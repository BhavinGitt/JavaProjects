package homeworkJAVA;

public class WrongFileNameException extends Exception {
	

	public WrongFileNameException(String errorMessage) {
		super(errorMessage);
	}
	
//	public static void method() throws WrongFileNameException {
//	    throw new WrongFileNameException("This is CheckedException");  
//	}

	public static void main(String[] args) throws WrongFileNameException {
	//	method();
		
		try {
			throw new WrongFileNameException("this is the Custome-EXCEPTION");
			
		} catch (WrongFileNameException ABC) {
			System.out.println(ABC.getMessage());
			  
			
		}

	}
}