class Product{
	String productCode;
	String productName;
	double productPrice;
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
	
}

public class TestProduct{
	public static void main(String[] args) {
	Product product=new Product();
	product.setProductCode("P101");
	product.setProductName("Laptop");
	product.setProductPrice(45000.00);
	System.out.println("Product Code:" +"\t" +product.getProductCode()+"\n" +"Product Name: "+"\t"+product.getProductName()+"\n"+"Product Price:"+"\t"+product.getProductPrice());
	}

}
