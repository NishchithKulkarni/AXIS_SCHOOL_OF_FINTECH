package exceptionAssignments;

public class Customer {
	private String custNo;
	private String custName;
	private String category;
	
	public Customer(String custNo, String custName, String category) throws InvalidInputException {
	try {
		if(custNo.startsWith("C") && custNo.startsWith("c")) {
			
			  if(custName.length()>=4){
				  if(category.equals("Platinum" ) ||category.equals("Gold")||category.contentEquals("Silver"))
				  {
					  this.custNo=custNo;
					  this.custName=custName;
					  this.category=category;
				  }
				  else
				  {
					  throw new InvalidInputException();
				  }
			  }
			  else {
				  throw new InvalidInputException();
			  }
		
			
		}
		else {
			 throw new InvalidInputException();
		}
	}
	catch(InvalidInputException ie)
	{
		ie.printStackTrace();
	}
}
	public String getCustNo() {
		return custNo;
	}
	public String getCustName() {
		return custName;
	}
	public String getCategory() {
		return category;
	}
}

