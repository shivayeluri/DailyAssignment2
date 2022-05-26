package assignment2.logic;

public class NumberCheck {
    public void evenOrOdd(String[] args){

        try {
            if (args.length > 1) {
                for (String number : args) {
                    if (isEven(Integer.parseInt(number))) {
                        System.out.println(number + " is Even");
                    } else {
                        System.out.println(number + " is Odd");
                    }
                }
            } else {
                if (isEven(Integer.parseInt(args[0])))
                    System.out.println(args[0] + " is Even");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid number of inputs");
        }catch (NumberFormatException e){
            System.out.println("Not a number");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public Boolean isEven(int number){
        boolean flag = false;
        if((number)%2 == 0){
            flag = true;
        }
        return flag;
    }

}
