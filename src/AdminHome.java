
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminHome extends JFrame {
    JLabel  background;
    AdminHome(String title) {
        super(title);
        setSize(1000, 600);
        JLabel  header = new JLabel("ONLINE EVENT MANAGEMENT SYSTEM", SwingConstants.CENTER);
        header.setBounds(0, 10, 1000, 100);
        header.setOpaque(true);
        header.setBackground(Color.PINK);
        header.setFont(new Font("", Font.BOLD, 25));
        header.setForeground(Color.gray);
        add(header);

        JButton button2 = new JButton(" VANUE MANAGEMENT");
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        button2.setBounds(100, 110, 129, 36);
        add(button2);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                 new ViewVanue("").setVisible(true);;
            }
        });
        JButton buttonc = new JButton(" TOTAL COST");
        buttonc.setBackground(Color.BLACK);
        buttonc.setForeground(Color.WHITE);
        buttonc.setBounds(100, 165, 129, 36);
        add(buttonc);
        buttonc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                 new TotalCost("").setVisible(true);;
            }
        });
        JButton button1 = new JButton("CUSTOMER DETAIL");
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        button1.setBounds(290, 110, 129, 36);
        add(button1);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                 new CustomerD("").setVisible(true);;
            }
        });
        JButton button3 = new JButton(" FOOD MANAGEMENT");
        button3.setBackground(Color.BLACK);
        button3.setForeground(Color.WHITE);
        button3.setBounds(470, 110, 129, 36);
        add(button3);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                 new FoodVP(" FOOD").setVisible(true);

            }

        });
        JButton button4 = new JButton(" VIEW BOOKING");
        button4.setBackground(Color.BLACK);
        button4.setForeground(Color.WHITE);
        button4.setBounds(290, 165, 129, 36);
        add(button4);
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                 new BookV("").setVisible(true);;
            }
        });
        JButton button5 = new JButton(" MANAGE NOTIFICATION ");
        button5.setBackground(Color.BLACK);
        button5.setForeground(Color.WHITE);
        button5.setBounds(290, 165, 129, 36);
        add(button5);
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new NotificationP(" MANAGE NOTIFICATION").setVisible(true);
            }
        });
        JButton button = new JButton(" EQUIPMENT MANAGEMENT");
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.setBounds(470, 165, 129, 36);
        add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new EquipmentPM("  EQUIPMENT").setVisible(true);
                ;
            }
        });
        JButton buttonh= new JButton("BOOKING HISTORY");
        buttonh.setBackground(Color.BLACK);
        buttonh.setForeground(Color.WHITE);
        buttonh.setBounds(100, 110, 129, 36);
        add(buttonh);
        buttonh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                 new BookingHis("").setVisible(true);;
            }
        });
        JButton button6 = new JButton("BACK");
        button6.setBackground(Color.BLACK);
        button6.setForeground(Color.WHITE);
        button6.setBounds(650, 110, 129, 36);
        add(button6);
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new EMStartP("  MAIN PANEL").setVisible(true);
                ;
            }
        });

        JLabel label3 = new JLabel("Welcome to  panel!");
        label3.setBounds(384, 33, 168, 22);
        label3.setBackground(Color.WHITE);
        add(label3);
        ImageIcon img = new ImageIcon("C:\\Users\\HP\\Pictures\\Saved Pictures/bg.png");
         background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 0, 0);
        add(background);
        setSize(901, 499); // frame
        setLayout(null); // frame
        setVisible(true); // frame
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);


    }
}