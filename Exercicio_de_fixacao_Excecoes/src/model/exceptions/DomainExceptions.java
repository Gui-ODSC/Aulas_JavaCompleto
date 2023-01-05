package model.exceptions;

public class DomainExceptions extends RuntimeException {
	private static final long serialVersionUID = 4306705633862401849L;
	
	public DomainExceptions(String msg) {
		super(msg);
	}
}
