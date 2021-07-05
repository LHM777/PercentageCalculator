
package com.lhm777.percentagecalculator;


public class HandledException {
    
	
	//This class handles the Exceptions that are thrown by PercentageCalculator Class.
    //Since there is a possibility of an exception being generated while calculation occurs, we would need to handle that.
    //An exception would be generated when division by zero occurs.
    //An exception would also be generated when infinity occurs.
    //When that happens, we would throw a custom exception called 'HandledException'
    //The HandledException class will identify what exception it is and then send back a String message as a response.
    
    private String code;

    public HandledException(String code, String message) {
        super(message);
        this.setCode(code);
    }

    public HandledException(String code, String message, Throwable cause) {
        super(message, cause);
        this.setCode(code);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
