import javax.swing.table.JTableHeader;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EquipmentPM extends JFrame {
    JLabel  background, todayHeader,todayHeader1 ;
    JPanel panel;
    JMenuBar mb;
    JTable due;
    JTableHeader header;
    JMenu home, payment, mile, rules, help, logout;
    JButton add;
    JScrollPane sp;
    JComboBox<String> cb;
    JTextArea meal;
     String addtext;
    EquipmentPM(String title){
        super(title);
        setSize( 900, 800 );
        // Today Header
        todayHeader = new JLabel(" VIEW Equipment", SwingConstants.CENTER);
        todayHeader.setBounds(350, 50, 200, 30);
        todayHeader.setOpaque(true);
        todayHeader.setBackground(Color.black);
        todayHeader.setFont(new Font("", Font.BOLD, 18));
        todayHeader.setForeground(Color.blue);
        add(todayHeader);

        // Meal List
        String data[][]={
            {" 1"," OPEN AIR", "5000 "},
            {" 2"," HOME", "2000 "},
            {" 3"," HOTEL", "9000 "},
            {" 4"," OUTDOOR", "7000"},
            {" 5", " CANTONMENT","18000"},
            {" 6", " CONVENTIONAL HALL","15000"},
        };    
        String column[]={"VANUE ID","VANUE PLACE", "VANUE COST"};      
        due = new JTable(data, column);
        sp = new JScrollPane(due);
        due.setFont(new Font("Tahoma ", Font.CENTER_BASELINE, 14));
        sp.setBounds(50, 100, 800, 225);
        sp.setFont(new Font("Tahoma", Font.CENTER_BASELINE, 16));
        due.setRowHeight(30);
        header = due.getTableHeader();
        header.setPreferredSize(new Dimension(200, 40));
        header.setFont(new Font("", Font.CENTER_BASELINE, 16));
        add(sp);

        // Add Menu
    
        JButton button6 = new JButton("BACK");
        button6.setBackground(Color.BLACK);
        button6.setForeground(Color.WHITE);
        button6.setBounds(0, 0, 129, 36);
        add(button6);
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new AdminHome(" PANEL").setVisible(true);
                ;
            }
        });

        JTextField textField2 = new JTextField();
		textField2.setBounds(50, 350, 200, 35);
		add(textField2);
		JTextField textField1 = new JTextField();
		textField1.setBounds(250, 350,200, 35);
		add(textField1);
        JTextField textField = new JTextField();
		textField.setBounds(450, 350, 200, 35);
		add(textField);
    
      

        // Add Button
        add = new JButton("Add");
        add.setBounds(400, 400, 200, 30);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.setFont(new Font("", Font.BOLD, 15));
        add(add);
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               

        } });
    
      
        
        // Background Image
        ImageIcon img = new ImageIcon( "C:\\Users\\HP\\Pictures\\Saved Pictures/bg4.jpg");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 250,900, 650);
        add(background);

        // Frame Initialization
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setLocationRelativeTo(null);  
        setVisible(true);
        setLayout( null );       
    }
}
    

