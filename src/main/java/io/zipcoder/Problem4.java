package io.zipcoder;

import java.util.ArrayList;
import java.util.Collections;

public class Problem4 {


    public Boolean isPalindrome(String input){

        int length = input.length()-1;
        Boolean palindromCheck= false;

        for (int i = 0; i< length/2; i++){

            if(input.charAt(i)==input.charAt(length-i)){
                palindromCheck = true;
            }

        }
        return palindromCheck;
    }

    public ArrayList<Character> stringtoCharArray(String input){
        ArrayList<Character> stringArray = new ArrayList<Character>();
        for (int i = 0; i < input.length(); i++) {
            stringArray.add(input.charAt(i));
        }
        return stringArray;

    }

    public Boolean isAnagramTest(String input, String input2) {

        ArrayList<Character> stringArray1 = stringtoCharArray(input);
        ArrayList<Character> stringArray2 = stringtoCharArray(input2);
        Collections.sort(stringArray1);
        Collections.sort(stringArray2);

        Boolean anagramCheck = false;

        if (stringArray1.size()!= stringArray2.size()) {
            anagramCheck = false;
        } else {
            int length = input.length();
            for (int i = 0; i < stringArray1.size(); i++) {
                if (stringArray1.get(i) == stringArray2.get(i))
                    anagramCheck = true;
            }
        }
        return anagramCheck;
    }

    public ArrayList<String> getSubstringFromAString(String input){
            ArrayList<String> substringList = new ArrayList<String>();
        for(int i=0; i<input.length()-1; i++){
            for(int j=0; j<input.length()-i; j++){

                substringList.add(input.substring(j,j+i+1));

            }
        }
      return substringList;
    }

    public  String checkIfAStringHasAPalindonAndANagram(String input){
        ArrayList<String> substringList = getSubstringFromAString(input);

        String checkResult="NO";

        for(int i=0; i<substringList.size(); i++){
            String substring1= substringList.get(i);


                if(isPalindrome(substring1)){
                    checkResult="YES";
                }
            }


        return checkResult;
    }

}
