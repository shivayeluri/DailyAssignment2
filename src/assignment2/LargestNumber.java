package assignment2;

public class LargestNumber {
    public void amongThreeNumbers(String[] args){
        try {
            int largestNumber = Integer.parseInt(args[0]);
            if (args.length == 3) {
                for (String number : args) {
                    if (Integer.parseInt(number) > largestNumber || Integer.parseInt(number) == largestNumber ){
                        largestNumber = Integer.parseInt(number);
                    }
                }
                System.out.println(largestNumber);
            } else {
                System.out.println("Invalid number of inputs");
            }
        }catch (NumberFormatException e){
            System.out.println("Not a number");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

