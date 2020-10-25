import java.util.Scanner;
fun main()
{
	val sc=Scanner(System.`in`)	
	var revenue:Int=sc.nextInt()
	var bonus=0
	when(revenue)
	{
	in 10000..20000 ->
		bonus=1500
	in 21000..40000 ->
		bonus=2500 
	in 41000..60000 ->
		bonus=3500
	else -> {
		println("Not eligible for now")
	}
}
}