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

### Percentage (what is x% of y) panel

This panel also uses the GridBagLayout as its layout. It's also a part of the CardLayout. It contains three JFormattedTextFields to store user inputs and result. There are various validations in place for these text fields to determine if the input is a number or a valid number format. If those validations fail, such as if the user inputs a letter or a symbol, the input will be deleted. The textfields will also automatically put a thousands separator after the focus is lost, such as when the user clicks on another textfield. All the other JFormattedTextFields in other panels behave exactly the same. If you click on the hamburger menu, it will bring you 
back to the main panel. If you click on the refresh button, all the inputs of the textfields will be deleted. NOTE: all panels that are part of the CardLayout, there are 6 in total including the main panel, uses the GridBagLayout as its layout. I used the GridBagLayout because I find it more easy to organize and set alignments of the components of a panel.

![Untitled2](https://user-images.githubusercontent.com/86467782/125085010-b5b74780-e0fc-11eb-87b1-322067596de6.png)

### Percentage increase/decrease panel

![Untitled3](https://user-images.githubusercontent.com/86467782/125085442-29f1eb00-e0fd-11eb-8752-22b2c60ae5f9.png)

### x is y% of what number panel

![Untitled4](https://user-images.githubusercontent.com/86467782/125085872-a08ee880-e0fd-11eb-8d41-049dc9271fa9.png)

### x is what % of y panel

![Untitled5](https://user-images.githubusercontent.com/86467782/125086435-388cd200-e0fe-11eb-9242-a66ba39ba00e.png)

### fraction to percent panel

![Untitled6](https://user-images.githubusercontent.com/86467782/125087815-67577800-e0ff-11eb-8a8e-09ef90491af0.png)



