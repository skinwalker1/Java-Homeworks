
package arrays.in.methods;


public class ArraysInMethods {

   
    public static void main(String[] args) {
       int bucky[] = {3,4,5,6,7};
       System.out.println("The old array ");
    
       for(int i : bucky){
           System.out.println(i);
       }
       change(bucky);
       System.out.println("The new array ");
       for(int x : bucky){
           System.out.println(x);
       }
    }
    
    public static void change(int array[]){
        for(int i = 0;i< array.length; i ++){
            array[i]+=5;
        }
        
    }
}
