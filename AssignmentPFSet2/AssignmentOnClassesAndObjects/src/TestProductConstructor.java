class ProductConstructor{
	private String productCode;
	private String productName;
	private double productPrice;
	ProductConstructor(String productCode,String productName,double productPrice){
		this.productCode=productCode;
		this.productName=productName;
		this.productPrice=productPrice;
	}
	public void displayProductDetails() {
		System.out.println("Product Code:"+"\t"+productCode+"\n");
		System.out.println("Product Name:"+"\t"+productName+"\n");
		System.out.println("Product Price:"+"\t"+productPrice+"\n");
	}
	
}
public class TestProductConstructor {

	public static void main(String[] args) {
		ProductConstructor product=new ProductConstructor("P101","Laptop",45000.00);
		product.displayProductDetails();
	}

}
