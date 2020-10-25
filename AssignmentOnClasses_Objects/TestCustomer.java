package assignments.day6;
class Address{
	String addressLine;
	String city;
	Address(String city,String addressLine){
		this.city=city;
		this.addressLine=addressLine;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public String setAddressLine(String addressLine) {
		this.addressLine = addressLine;
		return addressLine;
	}
	public String getCity() {
		return city;
	}
	public String setCity(String city) {
		return this.city = city;
	}
	public String getAddressDetails() {
		return (setAddressLine("Ist Main HSR Layout")+","+setCity("Bangalore"));
	}
}
class Customer{
	private String customerName;
	private Address residentialAddress;
	Customer(){
		
	}
	Customer(String name,Address address){
		this.customerName=name;
		this.residentialAddress=address;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	String getCustomerDetails() {
		return "Customer:" +this.customerName+"\n"+"Residential Address:"+this.residentialAddress.getAddressDetails();
	}
}
public class TestCustomer {

	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.setCustomerName("John");
		Address add=new Address("Bangalore","Ist Main HSR Layout");
		customer.setResidentialAddress(add);
		System.out.println(customer.getCustomerDetails());
		Customer customer1=new Customer("John",add);
		System.out.println(customer1.getCustomerDetails());
		
	}

}
