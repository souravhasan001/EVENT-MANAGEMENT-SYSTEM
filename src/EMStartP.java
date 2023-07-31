
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.event.*;


public class EMStartP extends JFrame {
  JFrame f;
  JLabel ti, header;
  JMenuBar mb;
  //JPanel panel;
  JMenu HOME, EXIT, about;

  EMStartP(String title) {
    super(title);
    header = new JLabel("ONLINE EVENT MANAGEMENT SYSTEM", SwingConstants.CENTER);
    header.setBounds(0, 10, 900, 100);
    header.setOpaque(true);
    header.setBackground(Color.PINK);
    header.setFont(new Font("", Font.BOLD, 25));
    header.setForeground(Color.BLACK);
    add(header);
    mb = new JMenuBar();
    HOME = new JMenu("HOME");
    about = new JMenu("CONTACT US");
    EXIT = new JMenu("EXIT");
    mb.add(HOME);
    mb.add(EXIT);
    mb.add(about);
    mb.setBackground(Color.gray);
    setJMenuBar(mb);
   setSize(901, 609); 
    setLayout(null);
    setVisible(true);
    about.addMouseListener(new MouseListener() {
    
      public void mouseClicked(MouseEvent e) {
        setVisible(false);
         new ContactUs("CONTACT US").setVisible(true);
      }

      @Override
      public void mousePressed(MouseEvent e) {
      }

      @Override
      public void mouseReleased(MouseEvent e) {
      }

      @Override
      public void mouseEntered(MouseEvent e) {
      }

      @Override
      public void mouseExited(MouseEvent e) {
      }
    });
    EXIT.addMouseListener(new MouseListener() {
     
      public void mouseClicked(MouseEvent e) {
        setVisible(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }

      @Override
      public void mousePressed(MouseEvent e) {
      }

      @Override
      public void mouseReleased(MouseEvent e) {
      }

      @Override
      public void mouseEntered(MouseEvent e) {
      }

      @Override
      public void mouseExited(MouseEvent e) {
      }
    });

    HOME.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
       
      }

    });
    ImageIcon img = new ImageIcon("C:\\Users\\HP\\Pictures\\Saved Pictures/2.jpg");
    JLabel background = new JLabel("", img, JLabel.CENTER);
   background.setBounds(0, 146,900 ,400);
    add(background);

		JButton button3 = new JButton("Admin ");
		button3.setBounds(150, 110, 129, 36);
		add(button3);
		button3.setBackground(Color.BLACK);
		button3.setForeground(Color.white);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				 new AdminP("ADMIN PANEL").setVisible(true);
			}
		});
		
		JButton button4 = new JButton(" Costumer ");
		button4.setBounds(350, 110, 129, 36);
		add(button4);
		button4.setBackground(Color.BLACK);
		button4.setForeground(Color.white);
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				 new LoginP("LOGIN PANEL").setVisible(true);

			}

		});
		JButton button6 = new JButton(" ABOUT US ");
		button6.setBounds(550, 110, 129, 36);
		add(button6);
		button6.setBackground(Color.BLACK);
		button6.setForeground(Color.white);
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
        new AboutES("ABOUT US").setVisible(true);
	}

		});
  


  }
}

/*
 * JButton b1 = new JButton("REGISTER");
 * b1.setBounds(230, 265, 210, 40);
 * b1.setBackground(Color.BLACK);
 * b1.setForeground(Color.white);
 * f.add(b1);
 * JButton b2 = new JButton("LOGIN");
 * b2.setBounds(230, 265, 210, 40);
 * b2.setBackground(Color.BLACK);
 * b2.setForeground(Color.white);
 * add(b2);
 * b2.setFont(getFont());
 * JButton b3 = new JButton("ADMIN");
 * b3.setBounds(230, 265, 210, 40);
 * b3.setBackground(Color.BLACK);
 * b3.setForeground(Color.white);
 * add(b3);
 */
