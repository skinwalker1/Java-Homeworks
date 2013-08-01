
package constructor;

public class constClass {
    private String girlName;
    
    public constClass(String name){
        girlName = name;
    }
    
    public void saying(){
        System.out.println("Your first gf was" + " " + girlName);
    }
}
