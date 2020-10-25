class Product2{
	String productCode;
	String productName;
	double productPrice;
	char categoryCode;
	private static int prodCounter=100;
	Product2(String productName,double productPrice,char categoryCode){
		this.productCode=this.generateProductCode();
		this.productName=productName;
		this.categoryCode=categoryCode;
	}
	Product2(String productName,double productPrice){
		this.productName=productName;
		this.productPrice=productPrice;
		this.productCode=this.generateProductCode();
		this.categoryCode='E';
	}
	
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public char getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(char categoryCode) {
		this.categoryCode = categoryCode;
	}
	private String generateProductCode() {
		return (this.categoryCode + Integer.toString(++prodCounter));
	}
	String getProductDetails() {
		return ("Product Code:"+this.productCode+"\n"+"Product Name :" + this.productName + "\nProduct Price :" + this.productPrice + "\nCategory :" + this.categoryCode);
	}
}
public class TestProduct2 {
	
	public static void main(String[] args) {
		Product2 pr=new Product2("Laptop",45000.00,'E');
		System.out.println(pr.getProductDetails());
		Product2 pr1=new Product2("Laptop",45000.00);		
		System.out.println(pr1.getProductDetails());
	}

}
