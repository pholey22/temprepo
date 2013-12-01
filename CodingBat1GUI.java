import java.awt.GridLayout;
import java.awt.Container;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.util.*;


public class CodingBat1GUI extends JFrame{

	private Container contain;
	private GridLayout gridLayout1;

	private JLabel label1;
	private JTextField textBox1;
	private JButton button1;
	private JButton generateProb;

	private Random dice;
	private int methodToRun;

	public CodingBat1GUI(){
		super("CodingBat1");

		//=================================
		contain = getContentPane();
		gridLayout1 = new GridLayout(2,2,8,8);


		label1 = new JLabel("Number: ");
		add(label1);

		textBox1 = new JTextField();
		add(textBox1);

		button1 = new JButton("old35");
		add(button1);

		generateProb = new JButton("Generate");
		add(generateProb);

		setLayout(gridLayout1);


		//====================================
		dice = new Random();

		methodToRun = 1;


		//====================================
		LogicButtonHandler comp = new LogicButtonHandler();
		button1.addActionListener(comp);
		generateProb.addActionListener(comp);



	}

	public static boolean old35(int n){

		if( n % 3 == 0 && n % 5 == 0){
			return false;
		}else if( n % 3 == 0){
			return true;
		}else if ( n % 5 == 0){
			return true;
		}else{
			return false;
		}
	}

	public static boolean Palindrome(String str) throws IllegalArgumentException{

		if(str.contains("+")){
			throw new IllegalArgumentException("Palindrome throws: ");
		}


	int headder = 0;
	int footer = str.length() - 1;


	for(int i = 0; i < str.length() ; i++){

		if((str.charAt(headder) + "").equalsIgnoreCase(str.charAt(footer)+"")){
			headder++;
			footer--;

		}else{
			return false;

		}

	}

	return true;

	}

	public static String  fizzString2(int n) {

		String Comment = "";

		if((n % 3 == 0) && (n % 5 == 0)) return "FizzBuzz!";

		if(n % 3 == 0  ) return "Fizz!";

		if(n % 5 == 0) return "Buzz!";



		return n + "!";
	}


public class LogicButtonHandler implements ActionListener{

	public void actionPerformed(ActionEvent event){

		if(event.getSource() == button1){

			try{

				if(textBox1.getText().equals("")) throw new Exception();




				if(methodToRun == 1){

					boolean fact = old35(Integer.parseInt(textBox1.getText()));
					JOptionPane.showMessageDialog(null,"Old 35: "+fact);

				}else if(methodToRun == 2){

					String fizz = fizzString2(Integer.parseInt(textBox1.getText()));
					JOptionPane.showMessageDialog(null,"FizzBuzz: " + fizz);

				}else if(methodToRun == 3){

					JOptionPane.showMessageDialog(null,Palindrome(textBox1.getText()));

				}else{

					JOptionPane.showMessageDialog(null,"Blah");

				}
			}

			catch(NumberFormatException except){
				JOptionPane.showMessageDialog(null,"Input was bad: " + textBox1.getText());
			}

			catch(IllegalArgumentException except){
				JOptionPane.showMessageDialog(null,"Palindrome input cannot contain a : + ");
			}

			catch(Exception except){

				if(textBox1.getText() == ""){
					JOptionPane.showMessageDialog(null,"Error");
				}else {
					JOptionPane.showMessageDialog(null,"Exception");
				}
			}

		}else if(event.getSource() == generateProb){


				methodToRun = dice.nextInt((7 + 1) - 1) + 1;

				textBox1.setText("");



				switch(methodToRun){

					case 1:
					button1.setText("old35");
					label1.setText("Number: ");
					break;

					case 2:
					button1.setText("FizzBuzz");
					break;

					case 3:
					button1.setText("Palindrome");
					label1.setText("String: ");
					break;

					default:
					button1.setText("Blah");
					label1.setText("Number: ");
					break;


				}

		}//End of Event Else IF//

	}//End of actionPerformed Method//


}//End of Action Listener Class//


	public static void main(String [] args){

		CodingBat1GUI test = new CodingBat1GUI();
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		test.setSize(300,90);
		test.setResizable(false);
		test.setVisible(true);



	}


}