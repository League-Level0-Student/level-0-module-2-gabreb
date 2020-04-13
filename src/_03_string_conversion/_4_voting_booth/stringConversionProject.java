package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class stringConversionProject {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("How old are you?"); 
	int answerInt = Integer.parseInt(answer);
	if(answerInt>=18) {
		JOptionPane.showInputDialog("Who should be the next President?"); 
	}
	else {
		JOptionPane.showMessageDialog(null, "Nobody cares what you think! Get outta here!");
	}
}
}
