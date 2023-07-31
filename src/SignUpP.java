import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUpP extends JFrame {

    SignUpP(String title) {
        super(title);
        setSize(1000, 600);
        JLabel lblNewLabel = new JLabel("Event Management System");
        lblNewLabel.setBounds(0, 10, 900, 100);
        lblNewLabel.setOpaque(true);
        lblNewLabel.setFont(new Font("", Font.BOLD, 25));
        lblNewLabel.setBackground(Color.PINK);
        lblNewLabel.setForeground(Color.BLACK);
        JLabel lblNew = new JLabel("Welcome to Login panel!");
        lblNew.setBounds(384, 120, 168, 22);
        lblNew.setBackground(Color.PINK);
        lblNew.setForeground(Color.BLACK);
        JButton back = new JButton("Back");
        back.setBounds(480, 350, 89, 45);
        back.setBackground(Color.BLACK);
		back.setForeground(Color.white);
        back.setFont(new Font("", Font.BOLD, 14));
        add(back);
        ImageIcon img = new ImageIcon("C:\\Users\\HP\\Pictures\\Saved Pictures/bg5.jpg");
        JLabel background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 0, 0);
        add(background);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new LoginP("SIGN UP").setVisible(true);
            }
        });

       
    //    final JLabel label = new JLabel();
   //     label.setBounds(20, 200, 200, 50);
        final JPasswordField value = new JPasswordField();
        value.setBounds(384, 250, 184, 28);
        JLabel l1 = new JLabel("Username:");
        l1.setBounds(284, 200, 84, 14);
        JLabel l2 = new JLabel("Password:");
        l2.setBounds(284, 250, 84, 14);
        JButton b = new JButton("Singin");
        b.setBounds(284, 350, 89, 45);
        b.setBackground(Color.BLACK);
		b.setForeground(Color.white);
        final JTextField text = new JTextField();
        text.setBounds(384, 200, 184, 28);
        add(lblNew);
        add(lblNewLabel);
        add(value);
        add(l1);
       // add(label);
        add(l2);
        add(b);
        add(text);
        setSize(901, 499);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = text.getText();
                String pass = new String(value.getPassword());

                if (user.equals("login") && pass.equals("login")) {

                    setVisible(false);
                    new CustomerHome(" VANUE portal").setVisible(rootPaneCheckingEnabled);

                } else {
                    JOptionPane.showMessageDialog(null, "Wrong !", "Warning!", JOptionPane.WARNING_MESSAGE);
                }

            }
        });

    }
}
