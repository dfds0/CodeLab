provider "aws" {
  region     = "us-east-1"
  access_key = "value"
  secret_key = "value"
}

#VPC
resource "aws_vpc" "vpc_prod" {
  cidr_block = "10.0.0.0/16"
  tags = {
    Name = "prod"
  }
}

#GATEWAY
resource "aws_internet_gateway" "gateway_prod" {
  vpc_id = aws_vpc.vpc_prod.id
  tags = {
    Name = "prod"
  }
}

#ROUTE
resource "aws_route_table" "route_prod" {
  vpc_id = aws_vpc.vpc_prod.id
  route = [{
    cidr_block             = "0.0.0.0/0"
    gateway_id             = aws_internet_gateway.gateway_prod.id
    ipv6_cidr_block        = "::/0"
    egress_only_gateway_id = aws_internet_gateway.gateway_prod.id
  }]
  tags = {
    Name = "prod"
  }
}

#SUBNET
resource "aws_subnet" "subnet_prod" {
  vpc_id            = aws_vpc.vpc_prod.id
  cidr_block        = "10.0.1.0/24"
  availability_zone = "us-east-1"
  tags = {
    Name = "prod"
  }
}

#ASSOCIATION
resource "aws_route_table_association" "association_prod" {
  subnet_id      = aws_subnet.subnet_prod.id
  route_table_id = aws_route_table.route_prod.id
}

#SECURITY - 443, 80
resource "aws_security_group" "security_prod" {
  name        = "traffic_prod"
  description = "..."
  vpc_id      = aws_vpc.vpc_prod.id

  ingress = [{
    cidr_blocks = ["0.0.0.0/0"]
    description = "HTTPS"
    protocol    = "tcp"
    from_port   = 443
    to_port     = 443
    }, {
    cidr_blocks = ["0.0.0.0/0"]
    description = "HTTP"
    protocol    = "tcp"
    from_port   = 80
    to_port     = 80
  }]

  egress = [{
    cidr_blocks = ["0.0.0.0/0"]
    protocol    = "-1"
    from_port   = 0
    to_port     = 0
  }]

  tags = {
    Name = "prod"
  }
}

#NETWORK
resource "aws_network_interface" "network_prod" {
  subnet_id       = aws_subnet.subnet_prod.id
  private_ips     = ["10.0.1.50"]
  security_groups = [aws_security_group.security_prod.id]
}

#IP
resource "aws_eip" "eip_prod" {
  vpc                       = true
  network_interface         = aws_network_interface.network_prod.id
  associate_with_private_ip = "10.0.1.50"
  depends_on = [
    aws_internet_gateway.gateway_prod
  ]
}

#SERVER
resource "aws_instance" "server_prod" {
  ami               = "ami-085925f297f89fce1"
  instance_type     = "t2.micro"
  availability_zone = "us-east-1a"
  key_name          = "main-key"
  network_interface {
    device_index         = 0
    network_interface_id = aws_network_interface.network_prod.id
  }

  user_data = <<-EOF
                #!/bin/bash
                sudo apt update -y
                sudo apt install apache2 -y
                sudo systemctl start apache2
                subo bash -c 'echo your very first web server > /var/www/html/index.html'
                EOF

  tags = {
    Name = "prod"
  }
}

#OUTPUT
output "server_private_ip" {
  value = aws_instance.server_prod.private_ip
}

output "server_id" {
  value = aws_instance.server_prod.id
}