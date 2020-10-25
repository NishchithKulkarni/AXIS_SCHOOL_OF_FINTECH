import java.util.Scanner
sealed class Cars
{
   init{
       println("")
   }
    class Maruti:Cars() {
        init {
            println("Indian make")
        }
    }
    class Hyundai:Cars() {
        init {
            println("Korean make")
        }
    }
    class Honda:Cars() {
        init {
            println("Japan make")
        }
    }
}
fun main()
{
   val sc=Scanner(System.`in`)
    println("Enter the type  of the car")
    val typeOfCar=sc.next()
    when(typeOfCar){
        "Maruti" -> Cars.Maruti()
        "Hyundai" -> Cars.Hyundai()
        "Honda" -> Cars.Honda()
        else -> {
            println("Enter a valid input")
        }

    }


}
