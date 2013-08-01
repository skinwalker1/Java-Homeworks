
package array.training;


public class ArrayTraining {

  
    public static void main(String[] args) {
       int array[] = {51,15,11,55};
       int total = 0;
       System.out.println("Index \t Value");
       for(int i = 0;i < array.length; i ++){
           total += array[i];
       }
       System.out.println(total);
    }
}
