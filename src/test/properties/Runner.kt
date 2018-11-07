package test.properties

fun main(args: Array<String>) {
    val privateUser = PrivateUser("mwqdqwd@gmail.com")

    println(privateUser.nickname)

    val subscribingUser = SubscribingUser("qwdqfwic@gmail.com")

    println("email: ${subscribingUser.email}")
    println("nickname: ${subscribingUser.nickname}")

}