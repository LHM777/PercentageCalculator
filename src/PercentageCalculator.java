
package com.lhm777.percentagecalculator;


public class PercentageCalculator {
    
	
	//This class handles all the percentage calculations of the application.
    
    
    private static String INFINITY_EXCEPTION = "INFINITY_EXCEPTION";
    
    

    public double APercentOfB(double a, double b){
    
        //This method calculates what is a% of b
        //It then stores the result in a BigDecimal type.
        //BigDecimal is responsible for setting the scale of the decimals
        //Our calculator allows for up to 12 decimal places in this case.
        
        double value = a/100 * b;
        int places = 12;
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
        
    }
    
    
    
    public double percentageDecreaseIncrease(double a, double b) throws HandledException{
        
        //This method calculates percentage increase/decrease.
        //It then stores the result in a BigDecimal type.
        //BigDecimal is responsible for setting the scale of the decimals
        //Our calculator allows for up to 12 decimal places in this case.
        //Since there is a possibility of an exception being generated, we would need to handle that.
        //An exception would be generated when division by zero occurs.
        //An exception would also be generated when infinity occurs.
        //When that happens, we would throw a custom exception called 'HandledException'
        //The HandledException class will identify what exception it is and then send back a String message as a response.
        
        double value;
        BigDecimal bd = null;
        
        if((value = ((b - a)/a)*100) == Double.POSITIVE_INFINITY){
            
            throw new HandledException(INFINITY_EXCEPTION, "Infinity");
            
        }
        else{
            
            int places = 12;
            bd = new BigDecimal(Double.toString(value));
            bd = bd.setScale(places, RoundingMode.HALF_UP);
        
        }
        
        
        return bd.doubleValue();
        
    
    }
    
    
    
    public double FiftyIsOnePercentOfWhatNumber(double a, double b) throws HandledException{
        
        
        //This method calculates x is y% of what number.
        //It then stores the result in a BigDecimal type.
        //BigDecimal is responsible for setting the scale of the decimals
        //Our calculator allows for up to 12 decimal places in this case.
        //Since there is a possibility of an exception being generated, we would need to handle that.
        //An exception would be generated when division by zero occurs.
        //An exception would also be generated when infinity occurs.
        //When that happens, we would throw a custom exception called 'HandledException'
        //The HandledException class will identify what exception it is and then send back a String message as a response.
        
        
        double value;
        BigDecimal bd = null;
        
        if((value =(a * 100)/b) == Double.POSITIVE_INFINITY){
            
            throw new HandledException(INFINITY_EXCEPTION, "Infinity");
            
        }
        else{
            
            int places = 12;
            bd = new BigDecimal(Double.toString(value));
            bd = bd.setScale(places, RoundingMode.HALF_UP);
        
        }
        
        
        return bd.doubleValue();
    
    }
    
    
    
    public double whatPercentOf(double a, double b) throws HandledException{
    
        
        //This method calculates x is what percent of y.
        //It then stores the result in a BigDecimal type.
        //BigDecimal is responsible for setting the scale of the decimals
        //Our calculator allows for up to 12 decimal places in this case.
        //Since there is a possibility of an exception being generated, we would need to handle that.
        //An exception would be generated when division by zero occurs.
        //An exception would also be generated when infinity occurs.
        //When that happens, we would throw a custom exception called 'HandledException'
        //The HandledException class will identify what exception it is and then send back a String message as a response.
        
        
        double value;
        BigDecimal bd = null;
        
        
        if((value = (a/b) * 100) == Double.POSITIVE_INFINITY){
            
            throw new HandledException(INFINITY_EXCEPTION, "Infinity");
            
        }
        else{
            
            int places = 12;
            bd = new BigDecimal(Double.toString(value));
            bd = bd.setScale(places, RoundingMode.HALF_UP);
        
        }
        
        
        return bd.doubleValue();
        
    }
	
	
}
