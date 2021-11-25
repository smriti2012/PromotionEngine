package promotion.exception;

public class InvalidProductException extends Exception {

	public String message;

	public InvalidProductException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
