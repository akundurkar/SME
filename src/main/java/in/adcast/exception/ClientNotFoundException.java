package in.adcast.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public final class ClientNotFoundException extends CustomRuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5969059934447225115L;

	public ClientNotFoundException() {
		super("USER_NOT_FOUND", "User does not exist",HttpStatus.NOT_FOUND);
	}
	public ClientNotFoundException(String code,String message) {
		super(code,message,HttpStatus.NOT_FOUND);
	}

	
}
