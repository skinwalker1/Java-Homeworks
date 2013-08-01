
package robot.constructor;
import java.util.Scanner;

public class RobotConstructor {

  
    public static void main(String[] args) {
        Robot robot1 = new Robot(52);
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the keyword 1 to start the robot");
        int userText = userInput.nextInt();

        if(userText == 1){
            robot1.start();
        }
        
    }
}
