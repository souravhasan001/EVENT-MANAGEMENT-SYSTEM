
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class LoginP extends JFrame{

    LoginP(String title){
			super(title);
		JLabel label1 = new JLabel("ONLINE EVENT MANAGEMENT SYSTEM");
		label1.setFont(new Font(" ", Font.BOLD, 30));
		label1.setBounds( 100, 0, 264, 22);
		label1.setBackground(Color.CYAN);
		add(label1);

		JLabel label2 = new JLabel("***** costomer  only! *****");
		label2.setBounds(336, 437, 197, 14);

		add(label2);

		JButton button2 = new JButton("REGISTER ");
         button2.setBackground(Color.BLACK);
		 button2.setForeground(Color.WHITE);
		button2.setBounds(300, 222, 129, 36);
		add(button2);
		button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
				setVisible(false);
			  RegisterP r = new RegisterP();
			 // r.setVisible(true);
			}
		});
		JLabel label3 = new JLabel("Welcome to sign-up panel!");
		label3.setBounds(150, 360, 168, 22);
		label3.setBackground(Color.WHITE);
		add(label3);
		JButton button6 = new JButton(" LOGIN ");
		button6.setBackground(Color.BLACK);
		button6.setForeground(Color.WHITE);
		button6.setBounds(470, 222, 129, 36);
		add(button6);
		 button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
				setVisible(false);
			new SignUpP("CUSTOMER LOGIN PANEL").setVisible(true);
			       
			}

		});

		
        setBackground(Color.MAGENTA);
		setSize(901, 499); // frame
		setLayout(null); // frame
		setVisible(true); // frame
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}

	
	

}
