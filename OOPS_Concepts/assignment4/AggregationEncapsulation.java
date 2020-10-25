package assignment4;
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
	private Address officialAddress;
	Customer(){
		
	}
	Customer(String name,Address address,Address officialAddress){
		this.customerName=name;
		this.residentialAddress=address;
		this.officialAddress=officialAddress;
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
	
	public Address getOfficialAddress() {
		return officialAddress;
	}
	public void setOfficialAddress(Address officialAddress) {
		this.officialAddress = officialAddress;
	}
	String getCustomerDetails() {
		return "Customer:" +this.customerName+"\n"+"Residential Address:"+this.residentialAddress.getAddressDetails() +"\n"+"Official Address:" +this.officialAddress.getAddressDetails();
	}
}
public class AggregationEncapsulation {

	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.setCustomerName("John");
		Address add=new Address("Bangalore","Ist Main HSR Layout");
		customer.setResidentialAddress(add);
		Address add1=new Address("Bangalore","Ist Main Electronics City");
		
		//System.out.println(customer.getCustomerDetails());
		customer.setOfficialAddress(add1);
		Customer customer1=new Customer("John",add,add1);
		System.out.println(customer1.getCustomerDetails());
		
	}

}
