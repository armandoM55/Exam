import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    private static final boolean Robot = false;

	public static void main(String[] args) {
   	 // 3. ask the user what color they would like the Robot to draw
String question1= JOptionPane.showInputDialog("what color would you like");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
//if(question1.equals("black")){
	
   	 // 2. set the pen width to 10

   	 // 1. make the Robot draw a shape
	Robot boi= new Robot();


 if (question1.equals("yellow")) {
	boi.setPenColor(255, 0, 0);}
 if(question1.equals("black")){
	 boi.setPenColor(0,100,0);
 } else{ boi.setPenColor(0,0,255);}
	boi.penDown();
   	 boi.setPenWidth(10);
   	 for(int i=0;i<4;i++){
   	 boi.move(100);
   	 boi.turn(90);}
    }
	
}