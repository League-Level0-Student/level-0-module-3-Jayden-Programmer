package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class Happy {

	public static void main(String[] args) {

		String Happy = JOptionPane.showInputDialog(null, "Are you Happy?");

		if (Happy.equals("yes")) {
			JOptionPane.showMessageDialog(null, "keep doing what you where doing");
		} else {
			Happy = JOptionPane.showInputDialog(null, "Do you want to be Happy?");
			if (Happy.equals("yes")) {
				JOptionPane.showMessageDialog(null, "change something");
				} else {
				JOptionPane.showMessageDialog(null, "keep doing what you where doing ");
				}
		} 

	}
}