import java.awt.event.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.*;



public class UpdateCP extends WindowAdapter {
	JFrame py;

	public UpdateCP () {
		py = new JFrame(" details  ");
		py.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		py.setSize(901, 499);

		py.setLayout(null);
		py.setVisible(true);
        py.setSize(1000, 600);
        JLabel label1 = new JLabel("ONLINE EVENT MANAGEMENT SYSTEM");
		label1.setFont(new Font(" ", Font.BOLD, 20));
		label1.setBounds(200, 50, 490, 22);
		label1.setBackground(Color.CYAN);
		py.add(label1);

		JLabel label2 = new JLabel("Name:");
		label2.setBounds(40, 120, 117, 40);
		py.add(label2);
		JLabel label3 = new JLabel("Address  :");
		label3.setBounds(40, 159, 117, 40);
		py.add(label3);
		JLabel label4 = new JLabel("Gender :");
		label4.setBounds(40,205 , 117, 40);
		py.add(label4);
		JLabel label6 = new JLabel("Email:");
		label6.setBounds(40, 255, 117, 40);
		py.add(label6);
		JLabel label7 = new JLabel("Phone:");
		label7.setBounds(40, 295, 117, 40);
		py.add(label7);

        JTextField textField2 = new JTextField();
		textField2.setBounds(140, 120, 300, 30);
		py.add(textField2);
		JTextField textField3 = new JTextField();
		textField3.setBounds(140, 160, 300, 30);
		py.add(textField3);
		JTextField textField4 = new JTextField();
		textField4.setBounds(140, 205, 300, 30);
		py.add(textField4);
		JTextField textField6 = new JTextField();
		textField6.setBounds(140, 258, 300, 30);
		py.add(textField6);
		JTextField textField7 = new JTextField();
		textField7.setBounds(140, 300, 300, 30);
		py.add(textField7);

		JButton button6= new JButton("BACK");
		button6.setBackground(Color.BLACK);
		button6.setForeground(Color.WHITE);
		button6.setBounds(0, 0, 129, 36);
		py.add(button6);
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
               new CustomerHome("CUSTOMER PANEL").setVisible(true);
			}
		});	
        JButton button5 = new JButton("ADD");
		button5.setBackground(Color.BLACK);
		button5.setForeground(Color.WHITE);
		button5.setBounds(160, 400, 129, 36);
		py.add(button5);
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileWriter fwrite = null;
				java.io.BufferedWriter bw = null;
				PrintWriter pw = null;
			
				try {
					fwrite = new FileWriter("C:\\Users\\HP\\Desktop\\register.txt");
					bw = new java.io.BufferedWriter(fwrite);
					pw = new PrintWriter(bw);
					pw.println("name: " + textField2.getText() + "\nemail: " + textField6.getText() + "\naddress: "
							+ textField3.getText() + "\nphone: "
							+ textField7.getText() + "\ngender: " + textField4.getText());
					bw.close();
					pw.close();
					JOptionPane.showMessageDialog(null, "Data Saved Successfully...");
					textField2.setText(null);
					textField3.setText(null);
					textField4.setText(null);
					textField6.setText(null);
					textField7.setText(null);
					
				} catch (IOException ex) {
				}
			}
		});

    }
}