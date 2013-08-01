
package robot.constructor;


public class Robot {
    private int id;
    
    public Robot(){
        this.id = 0;
    }
    public Robot(int id){
        this.id = id;
    }
  
    
    public static void charge(){
        System.out.println("The battery is charging");
    }
    public void start(){
        System.out.println("The robot with id " + id + " " + "was started");
        Brain brain = new Brain();
        brain.think();
        charge();
        
    }
   public class Brain{
       public void think(){
           System.out.println("The robot with id " + id + " " + "is thinking");
       }
   }

    
}
