import java.awt.event.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.*;


public class RegisterP extends WindowAdapter {
	JFrame py;

	public RegisterP() {
		py = new JFrame(" details  ");
		py.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		py.setSize(901, 499);
        py.setBackground(Color.pink);
		py.setLayout(null);
		py.setVisible(true);
		
		JLabel label1 = new JLabel("Coustom details ");
		label1.setFont(new Font("Tahoma", Font.BOLD, 20));
		label1.setBounds(315, 4, 386, 45);
		py.add(label1);
		JButton button = new JButton(" LOGIN ");
		button.setBounds(140, 195,129 , 36);
		button.setBackground(Color.BLACK);
		button.setForeground(Color.WHITE);
		py.add(button);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				py.setVisible(false);
				new SIgnup2("CUSTOMER LOGIN PANEL").setVisible(true);
			}

		});
		
		JLabel label8 = new JLabel("Username:");
		label8.setBounds(40, 50, 117, 40);
		py.add(label8);
		JLabel label9 = new JLabel("Password:");
		label9.setBounds(40,100 , 117, 40);
		py.add(label9);
	
		JTextField textField8 = new JTextField();
		textField8.setBounds(140, 50, 300, 30);
		py.add(textField8);
		JTextField textField9 = new JTextField();
		textField9.setBounds(140, 100, 300, 30);
		py.add(textField9);
		JButton button5 = new JButton("ADD");
		button5.setBackground(Color.BLACK);
		button5.setForeground(Color.WHITE);
		button5.setBounds(140, 222, 129, 36);
		py.add(button5);
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FileWriter fwrite2 = null;
				     java.io.BufferedWriter bw2 = null;
			    	PrintWriter pw2= null;
				try {
					
					fwrite2 = new FileWriter("C:\\Users\\HP\\Desktop\\user1.txt");
					bw2 = new java.io.BufferedWriter(fwrite2);
					pw2 = new PrintWriter(bw2);
					pw2.println(""+textField8.getText() + "\n" + textField9.getText());
					bw2.close();
					pw2.close();
					textField8.setText(null);
					textField9.setText(null);

				} catch (IOException ex) {
				}
			}
		});
	}
}


/*
  
 ImageIcon img = new ImageIcon("C:\\Users\\HP\\Pictures\\Saved Pictures/bg5.jpg");
        JLabel background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 0, 0);
        py.add(background);
  
 */