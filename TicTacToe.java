/*===========================
 * Marasinghe MAPG - E/17/207
 * CO225 - Lab 07
 * Tic-Tac-Toe
 * ==========================
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe implements ActionListener {

	private int count = 0;
	private JButton[] button = new JButton[9];
	private GUI gui = new GUI();//The GUI for the game
	
	/**
	 * Create the application.
	 */
	public TicTacToe() {
		//Here the buttons for the matrix are created
		button[0] = new JButton();//creating the button
		gui.addButton(button[0]);//adding the button to the GUI
		button[0].addActionListener(this);//setting the action listener
		button[0].addActionListener( new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		    	mark(button[0]);//mark function marks the identity of the player who selected it.
		    }
		});
		
		button[1] = new JButton();
		gui.addButton(button[1]);
		button[1].addActionListener(this);
		button[1].addActionListener( new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		    	mark(button[1]);
		    }
		});
		
		button[2] = new JButton();
		gui.addButton(button[2]);
		button[2].addActionListener(this);
		button[2].addActionListener( new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		    	mark(button[2]);
		    }
		});
		
		
		button[3] = new JButton();
		gui.addButton(button[3]);
		button[3].addActionListener(this);
		button[3].addActionListener( new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		    	mark(button[3]);
		    }
		});
		
		button[4] = new JButton();
		gui.addButton(button[4]);
		button[4].addActionListener(this);
		button[4].addActionListener( new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		    	mark(button[4]);
		    }
		});
		
		button[5] = new JButton();
		gui.addButton(button[5]);
		button[5].addActionListener(this);
		button[5].addActionListener( new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		    	mark(button[5]);
		    }
		});
		
		button[6] = new JButton();
		gui.addButton(button[6]);
		button[6].addActionListener(this);
		button[6].addActionListener( new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		    	mark(button[6]);
		    }
		});
		
		button[7] = new JButton();
		gui.addButton(button[7]);
		button[7].addActionListener(this);
		button[7].addActionListener( new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		    	mark(button[7]);
		    }
		});
		
		button[8] = new JButton();
		gui.addButton(button[8]);
		button[8].addActionListener(this);
		button[8].addActionListener( new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		    	mark(button[8]);
		    }
		});
		
		
		gui.show();//Show function sets the visibility of the GUI to true
	}
	
	
	
	public static void main(String[] args) {//this is the main function
		new TicTacToe();//creating a game
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(count == 9) {
			gui.closeOuterFrame();//Close the gaming area and displaying the results
			gui.result("DRAW");//When there is a draw
		}
		else {
			//Setting up the game rules	
			play(button[0],button[1],button[2]);
			play(button[3],button[4],button[5]);
			play(button[6],button[7],button[8]);
			
			play(button[0],button[3],button[6]);
			play(button[1],button[4],button[7]);
			play(button[2],button[5],button[8]);
			
			play(button[0],button[4],button[8]);
			play(button[2],button[2],button[6]);
		}
		
			
	}
	
	public void mark(JButton button) {
		/*
		 * This method marks the clicked(selected buttons) with the number of the player who clicked it
		 */
		if(!(button.getText().equals("1") || button.getText().equals("2"))) {
    		if(count%2 == 0) button.setText("1");
    		else button.setText("2");
    		button.setFont(new Font("Verdana", Font.PLAIN, 35));
    		count++;
    	}
	}
	
	public void play(JButton b1, JButton b2, JButton b3) {
		/*
		 * This method checks for all the combination of the wins in the game and displays the output
		 * accoedingly
		 */
		
		if( (b1.getText().equals(b2.getText())) && (b2.getText().equals(b3.getText())) ) {
			if(b1.getText().equals("1")) {
				gui.closeOuterFrame();
				gui.result("PLAYER 1 WON");
			}
			else if(b1.getText().equals("2")) {
				gui.closeOuterFrame();
				gui.result("PLAYER 2 WON");
			}
		}
	}

}

