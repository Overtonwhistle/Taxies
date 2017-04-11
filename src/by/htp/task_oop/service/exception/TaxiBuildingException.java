package by.htp.task_oop.service.exception;

public class TaxiBuildingException extends ServiceException {

	private static final long serialVersionUID = 1L;

	public TaxiBuildingException() {
		super();
	}

	public TaxiBuildingException(String message) {
		super(message);
	}

	public TaxiBuildingException(Exception e) {
		super(e);
	}

	public TaxiBuildingException(String message, Exception e) {
		super(message, e);
	}
	
	
}
