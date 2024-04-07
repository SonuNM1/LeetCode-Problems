
import java.util.* ; 

public class RemoveDuplicateWord{
    public static void main(String args[]){

        // input = I am am rahul rahul 
        // output = I am rahul 

        String input = "I am am rahul rahul" ;
        
        String[] inputArr = input.split(" ") ; 

        // set contains unique elements only , doesn't contain duplicate 

        Set <String> mySet = new HashSet<String>() ; 

        for(String x: inputArr){
            mySet.add(x) ; 
        }

        // Iterator are used to iterate over the elements of a Collection 

        Iterator itr = mySet.iterator() ; 

        while(itr.hasNext()){
            System.out.print(itr.next() ) ; 
        }

    }
}