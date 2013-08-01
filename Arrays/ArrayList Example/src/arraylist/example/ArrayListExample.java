
package arraylist.example;

import java.util.ArrayList;
public class ArrayListExample {

   
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(10);
        numbers.add(100);
        numbers.add(10);
        numbers.add(15);
        
        /////////////////10///////////////////
        System.out.println("At index 1 the value is " + numbers.get(1));
        
        //////////////////Summing the values of the array////////////////
        int total = 0;
        for(int i = 0; i < numbers.size(); i ++){
            total += numbers.get(i);
        }
        System.out.println("The sum of the array is " + total);
        
        ////// Remove the first index  ////////////
        numbers.remove(0); 
        for(Integer values : numbers){
            System.out.println(values);
        }
        
    }
}
