import javax.swing.table.JTableHeader;
import java.awt.*;
import javax.swing.*;



public class VanueM extends JFrame {
    JLabel  background, todayHeader, addHeader, dueHeader, mealH;
    JPanel panel;
    JMenuBar mb;
    JTable due;
    JTableHeader header;
    JMenu home, payment, mile, rules, help, logout;
    JButton add;
    JScrollPane sp;
    JComboBox<String> cb;
    JTextArea meal;

    VanueM(String title){
        super(title);
        setSize( 900, 800 );
        // Today Header
        todayHeader = new JLabel(" VIEW VANUE", SwingConstants.CENTER);
        todayHeader.setBounds(350, 50, 200, 30);
        todayHeader.setOpaque(true);
        todayHeader.setBackground(Color.black);
        todayHeader.setFont(new Font("", Font.BOLD, 18));
        todayHeader.setForeground(Color.blue);
        add(todayHeader);

        // Meal List
        String data[][]={
            {" 1"," BIRTHDAY ", "15000 "},
            {" 4"," FAMILY EVENT", "11000 "},
            {" 6", " SEMINER","13000"},
            {" 9", " WEDDING", "22000"},
            {" 10", " PARTY", "16000"},
            {" 11", " CONFERENCE", "15000"}
        };    
        String column[]={"VANUE ID","VANUE NAME", "VANUE COST"};      
        due = new JTable(data, column);
        sp = new JScrollPane(due);
        due.setFont(new Font("", Font.CENTER_BASELINE, 14));
        sp.setBounds(50, 100, 800, 80);
        sp.setFont(new Font("", Font.CENTER_BASELINE, 16));
        due.setRowHeight(30);
        header = due.getTableHeader();
        header.setPreferredSize(new Dimension(200, 40));
        header.setFont(new Font("", Font.CENTER_BASELINE, 16));
        add(sp);

        // Add Menu
        addHeader = new JLabel("ADD", SwingConstants.CENTER);
        addHeader.setBounds(350, 300, 200, 30);
        addHeader.setOpaque(true);
        addHeader.setBackground(Color.WHITE);
        addHeader.setForeground(Color.BLUE);
        addHeader.setFont(new Font("", Font.BOLD, 16));
        add(addHeader);

        
      

        // Add Button
        add = new JButton("Add");
        add.setBounds(350, 450, 200, 30);
        add.setForeground(Color.BLUE);
        add.setFont(new Font("", Font.BOLD, 15));
        add(add);
        
        // Background Image
        ImageIcon img = new ImageIcon( "C:\\Users\\HP\\Pictures\\Saved Pictures/bg4.jpg");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 0, 0);
        add(background);

        // Frame Initialization
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setLocationRelativeTo(null);  
        setVisible(true);
        setLayout( null );       
    }
}
/*
             
         
               

 */