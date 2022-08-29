package in.co.rays.project_3.exception;

/**
 * @author Rajneesh Rathor
 */
public class DatabaseException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public DatabaseException(String msg){
		super(msg);
	}
}
