# PercentageCalculator
This percentage calculator was built using Java Swing. 

It calculates the following:
- What is x% of y
- Percentage increase/decrease
- x is y% of what number
- x is what % of y
- fraction to percent

## User Interface

The user interface contains a single JFrame and within that is a JPanel that contains all the other panels of the application. The JPanel uses a CardLayout, within which all the other panels are stored.

### The main panel

The main panel is part of the CardLayout. It contains the buttons for each feature or calculation. If you click on one of these buttons, the corresponding layout will be visible. It uses the GridBagLayout as its layout.

![Untitled](https://user-images.githubusercontent.com/86467782/125075366-150f5a80-e0f1-11eb-9fdd-0b1fbf2967e4.png)

### Percentage (what is x% of y)

This panel also uses the GridBagLayout as its layout. It's also a part of the CardLayout. It contains three JFormattedTextFields to store user inputs and result. There are various validations in place for these text fields to determine if the input is a number or a valid number format. If those validations fail, such as if the user inputs a letter or a symbol, the input will be deleted. The textfields will also automatically put a thousands separator after the focus is lost, such as when the user clicks on another textfield. All the other JFormattedTextFields in other panels behave exactly the same. If you click on the hamburger menu, it will bring you 
back to the main panel. If you click on the refresh button, all the inputs of the textfields will be deleted. NOTE: all panels that are part of the CardLayout, there are 6 in total including the main panel, uses the GridBagLayout as its layout. I used the GridBagLayout because I find it more easy to organize and set alignments of the components of a panel.

![Untitled2](https://user-images.githubusercontent.com/86467782/125085010-b5b74780-e0fc-11eb-87b1-322067596de6.png)

### Percentage increase/decrease

![Untitled3](https://user-images.githubusercontent.com/86467782/125085442-29f1eb00-e0fd-11eb-8752-22b2c60ae5f9.png)

### x is y% of what number

![Untitled4](https://user-images.githubusercontent.com/86467782/125085872-a08ee880-e0fd-11eb-8d41-049dc9271fa9.png)

### x is what % of y

![Untitled5](https://user-images.githubusercontent.com/86467782/125086435-388cd200-e0fe-11eb-9242-a66ba39ba00e.png)

### fraction to percent

![Untitled6](https://user-images.githubusercontent.com/86467782/125087815-67577800-e0ff-11eb-8a8e-09ef90491af0.png)



## Calculation

The application uses the PercentageCalculator class to handle all the percentage calculations.

### what is x% of y

To calculate "what is x% of y", the PercentageCalculator class uses the method APercentOfB().

```java
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
```

### Percentage increase/decrease

To calculate percentage increase/decrease, the PercentageCalculator class uses the method percentageDecreaseIncrease().

```java
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
```

### x is y% of what number

To calculate "x is y% of what number", the PercentageCalculator class uses the method FiftyIsOnePercentOfWhatNumber().

```java
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
```

### x is what % of y

To calculate "x is what % of y", the PercentageCalculator class uses the method whatPercentOf().

```java
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
```

### fraction to percent

In order to convert fraction to percent, the PercentageCalculator class uses the method whatPercentOf() which was was already explored above.


# Exception Handling

The HandledException class handles exception handling. During calculation, an exception can occur when dividing by zero. There are two possible exceptions that can happen when dividing by zero. The first one is if the calculation results to "positive infinity". In which case we will pass two parameters to the HandledException class: the String code(INFINITY_EXCEPTION) and the String message ("Infinity") which would inform the user what exception occured. If the calculation didn't result in positive infinity but a division by zero still occured, the message that will be sent back by the HandledException class would be simply "0"(zero) and that will be displayed in the result textfield. 

```java
public class HandledException extends Exception {
    
    
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
```


# Input Validation

The application uses REGEX to validate the inputs of the jFormatterTextFields. It checks for different number formats. The REGEX will not accept alphanumeric inputs, inputs with symbols and inputs with white spaces in between.

```java
    private boolean validateJFormatterTextFieldValue(String content){
        
        //This method validates the inputs from the jFormatterTextFields.
        //It uses REGEX to validate the inputs.
        
         /*The REGEX checks for the following number formats:
            
          00000.00000
          .12345
          0.12345
          00000.12345
          -12345.12345
          -12,345.12345
          123,123,123.12345
          12345.12345
          1000
          1,000
          -50
          -50.12345
        
        */     
        if(Pattern.matches("([0]+)(\\.[0]+)*|(\\.\\d+)|([0]+)(\\.\\d+)*|\\-[1-9]+(\\.\\d+)*|\\-[1-9]{1,3}(\\,\\d{3})+(\\.\\d+)?", content)){
            
            return true;
        }
        else if(Pattern.matches("(\\d{1,3})(\\,\\d{3})*(\\.\\d+)?|\\d+(\\.\\d+)|\\d+|\\-[0]*[1-9]+[0]*(\\.\\d+)*", content)){
            
            return true;
        }
        
        return false;
        
    }
```

