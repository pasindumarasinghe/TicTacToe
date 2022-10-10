/*
 * Author - @baqslash
 */
import javax.swing.*;
import java.awt.*;

public class GUI {
	//Gaming Area
	private JPanel panel;
	private JFrame frame;
	
	public GUI() {
		//creating the gaming area
		panel = new JPanel();
		panel.setLayout(new GridLayout(3,3));
		
		
		frame = new JFrame();
		frame.add(panel, BorderLayout.CENTER);
		frame.setSize(600,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setTitle("TicTacToe");
	}
	
	public void addButton(JButton button) {//adding a button to the user interface
		panel.add(button);
	}
	
	public void show() {//setting the visibility of the UI
		//this is used to display the gaming area after adding all the necessary components
		frame.setVisible(true);
	}
	
	public void closeOuterFrame() {//Closing the gaming area
		//This is used to close the gaming area before displaying the result
		frame.dispose();
	}
	
	public void result(String message) {
		//This is the Result window which displays the specified message
		JFrame fr = new JFrame();
		fr.setSize(400,200);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLocationRelativeTo(null);
		JLabel label = new JLabel(message,JLabel.CENTER);
		label.setFont(new Font("Verdana", Font.PLAIN, 32));		
		fr.add(label);

		fr.setVisible(true);
	}

}




