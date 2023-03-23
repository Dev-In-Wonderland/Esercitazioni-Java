package eserWeek2Day1_Eser3;

import java.time.LocalDate;

public class BancaException extends Exception {
	
	private String msg;
	
	public BancaException(String msg) {
		super(msg);
	}
	
	public String toString() {
		return LocalDate.now() + " - LOG - " + this.msg;
	}

}