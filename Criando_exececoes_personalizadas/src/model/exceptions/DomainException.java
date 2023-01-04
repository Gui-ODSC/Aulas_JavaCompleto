package model.exceptions;

public class DomainException extends RuntimeException {//somente exception = não deixa o erro passar(o erro precisa ser tratado), ja com RuntimeException o erro é ignorado pelo compilador
	private static final long serialVersionUID = 3303870181677866627L;
	
	public DomainException(String msg) {
		super(msg);
	}
}
