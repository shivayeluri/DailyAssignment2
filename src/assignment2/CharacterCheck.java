package assignment2;

import java.util.ArrayList;

public class CharacterCheck {
    public void vowelOrConsonant(String[] args){
        boolean flag = false;
        String[] alphabets = new String[]{"a","e","i","o","u"};

        try {
            if (args[0].length() == 1  && !isNumeric(args[0])) {
                String letter = args[0].toLowerCase();
                for (String alphabet : alphabets) {
                    if (letter.equals(alphabet)) {
                        flag = true;
                        break;
                    }
                }

                if (flag){
                    System.out.println(args[0] + " is Vowel");
                }else{
                    System.out.println(args[0] + " is Consonant");
                }

            }else if(isNumeric(args[0])){
                System.out.println("please enter character only not numbers");
            } else if (isFloat(args[0])) {
                System.out.println("please enter character only not Float");
            } else{
                System.out.println("please enter character only not alphabets.");
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public boolean isNumeric(String input){
        boolean flag = true;
        try {
            Integer.parseInt(input);
        }catch (Exception e){
            flag = false;
        }
        return flag;
    }

    public boolean isFloat(String input){
        boolean flag = true;
        try {
            Float.parseFloat(input);
        }catch (Exception e){
            flag = false;
        }
        return flag;
    }
}
