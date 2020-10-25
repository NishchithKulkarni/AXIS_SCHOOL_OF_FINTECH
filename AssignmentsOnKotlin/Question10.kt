class Account1{
   var acctId=0
    var accttype=""
    var name=""
    constructor(id:Int,accttype:String,name:String)
    {
        this.acctId=id
        this.accttype=accttype
        this.name=name
    }


    fun output()
    {
        println("Account id is ${acctId}")
        println("Account type is $accttype")
        println("Account Name is $name")
    }

}
fun main(args: Array<String>)
{

    var ac1=Account1(101,"Savings","Nishchith")
    var ac2=Account1(102,"Current","Mohan")
    var ac3=Account1(101,"Fixed Deposit","Raju")
    println(ac1.output())
    println(ac2.output())
    println(ac3.output())
}