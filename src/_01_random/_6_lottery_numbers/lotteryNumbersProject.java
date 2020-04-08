package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lotteryNumbersProject {
	public static void main(String[] args) {

		Random randy = new Random();
		int x = randy.nextInt(10);
		int x2 = randy.nextInt(10);
		int x3 = randy.nextInt(10);
		int x4 = randy.nextInt(10);
		int x5 = randy.nextInt(10);
		int x6 = randy.nextInt(10);
		JOptionPane.showMessageDialog(null, "Your lottery ticket number is: \n" + "   _" + x + "_ _" + x2 + "_ _" + x3 + "_ _" + x4 + "_ _" + x5 + "_ _" + x6 + "_");

	}
}
