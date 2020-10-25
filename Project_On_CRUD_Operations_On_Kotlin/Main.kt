import daoServices.Enquire
import daoServices.InsertAndDelete
import model.AdminServices
import model.DonorServices
import model.EnquireServices
import model.RequestServices

fun main()
{
    while(true)
    {
        println("Choose an option from menu")
        println("MENU \n 1.Request Services For Blood \n 2.Enquire Blood Services\n 3.Donor Can Donate  \n 4.Please contact me if you have any query")
        try{
            when(readLine()?.toInt())
            {
                1 -> RequestServices.request_services()
                2 ->  EnquireServices.enquireServices()
                3 -> DonorServices.donor_services()
                4 -> AdminServices.adminServices()
                5 -> println()
                else -> {
                    println("Enter a valid input")
                }
            }
        }
        catch (e: Exception){
            e.printStackTrace()
        }

    }
}
