class Student(var rollno:Int,var studentName:String,var City:String)
{
    init {
        this.rollno = rollno
        this.studentName = studentName
        this.City = City
    }
}
fun main()
{
    var std1=Student(100,"John","Bangalore")
    var std2=Student(102,"Peter","Chennai")
    var std3=Student(103,"Marks","Mumbai")
    var std4=Student(104,"Meera","Mumbai")
    var std5=Student(105,"Usha","Chennai")
    var std6=Student(106,"Rekha","Chennai")
    val myMap:Map<Int,Student> = mapOf(1 to std1,2 to std2,3 to std3,4 to std4, 5 to std5, 6 to std6)
    for (k in myMap)
    {
        if (k.value.City == "Bangalore")
        {
            println("Key is ${k.key} Value is ${k.value.rollno} ${k.value.studentName} ${k.value.City}")
        }
    }
}
