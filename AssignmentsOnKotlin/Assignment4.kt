import java.util.Scanner
fun main(){ 
	sc=Scanner(System.`in`)
c	age:Int=sc.nextInt()
	weight:Int=sc.nextInt()
	if(age>18 && weight>55)
	{
	  println("You are eligible to donate blood")
	}
	else
	{
	println("You are not eligible to vote")
	}
	
}