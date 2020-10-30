package _05_exception_class;

public class LogicException extends RuntimeException {

	public LogicException() {
		super();
	}

	public LogicException(String message, Throwable cause) {
		super(message, cause);
	}
	/**
	 * @author 24750
	 * @param cause 当前异常的根本原因
	 * @param message 表示当前异常的原因/信息
	 */
	public LogicException(String message) {
		super(message);
	}
	
}
