package book.util;

public class InvalidInputException extends Throwable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage()
	{
		return "INVALID";
	}
}
