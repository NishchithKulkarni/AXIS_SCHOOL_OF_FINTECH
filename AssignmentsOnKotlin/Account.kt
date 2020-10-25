data class Account(var acctid:Int,var acct_type:String,var name:String) {
init {
    this.acctid = acctid
    this.acct_type = acct_type
    this.name = name
}
    fun output()
    {
        println("Account id is $acctid")
        println("Account type is $acct_type")
        println("Account Name is $name")
    }

}
fun main(args: Array<String>)
{

    var ac1=Account(101,"Savings","Nishchith")
    var ac2=Account(102,"Current","Mohan")
    var ac3=Account(101,"Fixed Deposit","Raju")
    println(ac1.output())
    println(ac2.output())
    println(ac3.output())
}