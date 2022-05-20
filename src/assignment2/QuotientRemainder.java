package assignment2;

public class QuotientRemainder {
    public void calculateQuotientRemainder(String[] inputNumbers){

        int quotient;
        int remainder;

        try {
            int number = Integer.parseInt(inputNumbers[0]);
            int divisor = Integer.parseInt(inputNumbers[1]);

            quotient = number / divisor;
            remainder = number % divisor;

            System.out.println(quotient);
            System.out.println(remainder);
        }catch (NumberFormatException e){
            System.out.println("Not a number.");
        }catch (ArithmeticException e){
            System.out.println("Divisor shouldn't be Zero.");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid number of Inputs.");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
