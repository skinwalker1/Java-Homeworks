
package array.summing;


public class ArraySumming {

    
    public static void main(String[] args) {
       int array[] = {2,4,5,7,10};
       int total = 0;
       for(int i = 0; i < array.length;i++){
           if(array[i]%2==0){
               total += array[i];
           }
       }
       System.out.println("The sum of the even numbers in the array is : " + total);
    }
}
