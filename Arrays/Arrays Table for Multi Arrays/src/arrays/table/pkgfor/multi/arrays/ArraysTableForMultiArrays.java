
package arrays.table.pkgfor.multi.arrays;


public class ArraysTableForMultiArrays {

    public static void main(String[] args) {
       int firstArray[][]={{15,51,33,8},{33,11,22,12}};
       int secondArray[][] = {{11,22,33,44},{55},{55,1}};
       
       System.out.println("This is the first array");
       display(firstArray);
       System.out.println("This is the second array");
       display(secondArray);
    }
    public static void display(int array[][]){
        for(int row = 0; row < array.length;row++){
            for(int col=0;col < array[row].length;col++){
                System.out.print(array[row] [col] + "\t");
            }
            System.out.println();
        }
    
    }
}
