import java.util.* ; 

class Solution {
    public int romanToInt(String s) {
      HashMap <Character, Integer> romanValues = new HashMap <>() ; 
      romanValues.put('I', 1) ; 
      romanValues.put('V', 5) ;
      romanValues.put('X', 10) ;
      romanValues.put('L', 50) ;
      romanValues.put('C', 100) ;
      romanValues.put('D', 500) ;
      romanValues.put('M', 1000) ;

      int value = 0 ; 
      int previous = 0 ; // to keep track of the previous value 

     // String roman = "XL" ; // XL = 40 (10-50) 

     for(int i= s.length()-1 ; i >=0 ; i--){
         char currentChar = s.charAt(i) ; 
         int currentValue = romanValues.get(currentChar) ; 

         if(currentValue >= previous){
             value += currentValue ; 
         } else {
             value -= currentValue ; 
         }
         previous = currentValue ; 
     }
     return value ; 
    }
}