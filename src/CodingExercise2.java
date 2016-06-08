/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 { public static void main(String[] args) {
	

String question1= JOptionPane.showInputDialog("how old are you");
String question2= JOptionPane.showInputDialog("What year were you born in?");
int answer1= Integer.parseInt(question1);
int answer2= Integer.parseInt(question2);
if(answer1>30){
JOptionPane.showMessageDialog(null, "You are too old for this game!");
} else {
	JOptionPane.showMessageDialog(null, "sorry there is no game");
}
}}
