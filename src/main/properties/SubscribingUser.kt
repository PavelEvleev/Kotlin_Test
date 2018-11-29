package main.properties

class SubscribingUser(val email: String) : User {
    override val nickname: String
        get() = email.substringBefore("@")
}