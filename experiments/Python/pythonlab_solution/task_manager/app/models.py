from django.db import models
from django.contrib.auth.models import User


# Create your models here.
class Task(models.Model):
    PRIORITY_CHOICES = [('HIGH', 'High'), ('NORMAL', 'Normal'), ('LOW  ', 'Low')]

    title = models.CharField(max_length=30, null=False, blank=False)
    description = models.CharField(max_length=100, null=False, blank=False)
    expired_date = models.DateField(null=False, blank=False)
    priority = models.CharField(max_length=30, choices=PRIORITY_CHOICES, null=False, blank=False)
    user = models.ForeignKey(User, null=True, on_delete=models.CASCADE)