package p3;

public class ExceptionHandling {
	
	int x = 100;
	
	public void handleArithmetic(int a, int b) {
		try {
            int x = a / b;
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero is not allowed.");
        }
    }
	

    public void handleNullPointer(String input) {
        try {
        	ExceptionHandling a1 = null;
            System.out.println(a1.x);
        } catch (NullPointerException e) {
        	e.printStackTrace();
            System.out.println("NullPointerException: Null value is fetched");
        }
    }

    public void handleCustomException(int value) throws CustomException {
        if (value < 0) {
            throw new CustomException("CustomException: Negative values are not allowed");
        } else {
            System.out.println("Value: " + value);
        }
    }

    public static void main(String[] args) {
        ExceptionHandling demo = new ExceptionHandling();

        demo.handleArithmetic(10, 0);

        demo.handleNullPointer(null);

        try {
            demo.handleCustomException(-5);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}

