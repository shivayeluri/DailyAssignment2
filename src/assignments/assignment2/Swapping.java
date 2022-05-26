package assignment2.logic;

public class Swapping {
    public void swapTwoNumbers(String[] inputNumbers){
        try{
            int number1 = Integer.parseInt(inputNumbers[1]);
            int number2 = Integer.parseInt(inputNumbers[0]);
            System.out.println("Given numbers : " + number2+", "+number1);
            System.out.println("After Swapping : "+ number1+", "+number2);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid number of inputs");
        }catch (NumberFormatException e){
            System.out.println("Not a number.");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
