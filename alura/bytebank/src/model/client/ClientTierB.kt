package model.client

class ClientTierB(name: String, account: Int) : Client(name, account) {

    override fun removeBalance(value: Double) {
        if (this.balance >= value) {
            this.balance -= value
        }
    }

}