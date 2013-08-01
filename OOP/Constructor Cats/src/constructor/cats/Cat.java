
package constructor.cats;

public class Cat {
    private String name;
    private String color;
    //Set name
    public void setName(String name){
        this.name = name;
    }
    //Get name
    public String getName(){
        return this.name;
    }
   //Set color
    public void setColor(String color){
        this.color = color;
    }
    //Get color
    public String getColor(){
        return this.name;
    }
    //Default constructor
    public Cat(){
        this.name = "Unnamed";
        this.color = "gray";
    }
    //Constructor with parameters
    public Cat(String name,String color){
        this.name = name;
        this.color = color;
    }
    public void sayMeow(){
        System.out.printf("The Cat %s said  Meeeeeeowww" , name);
    }
    
}
