import javax.swing.JFrame;
//import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
//import java.awt.Container;

public class ViewFood extends JFrame {
    JLabel l;
    JCheckBox cb1, cb2, cb3;
    JButton b;
    JScrollPane sp;
    JTable due;
    JTableHeader header;
    JPanel p1,p2,p3;

    ViewFood(String title) {
        super(title);
        setSize(1000, 800);
        JLabel todayHeader = new JLabel(" VIEW VANUE ", SwingConstants.CENTER);
        todayHeader.setBounds(350, 50, 200, 30);
        todayHeader.setOpaque(true);
        todayHeader.setBackground(Color.black);
        todayHeader.setFont(new Font("", Font.BOLD, 18));
        todayHeader.setForeground(Color.pink);
        add(todayHeader);
        JButton add = new JButton("BACK ");
        add.setBounds(200, 400, 200, 45);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.setFont(new Font("", Font.BOLD, 15));
        add(add);
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              setVisible(false);
               new CustomerHome("ADMIN PANEL").setVisible(true);
            }
          });
        l = new JLabel("Food View System");
        l.setBounds(50, 50, 300, 20);
        String data[][]={
            {" 1", " BUFFET", "20000 "},
            {" 2", " CONTINENTAL", "18000 "},
            {" 3", " REGULAR", "13000"},
            {" 4", " FAST FOOD", "15000"}
        };    
        String column[]={"FOOD ID","FOOD NAME", "FOOD COST"};         
        due = new JTable(data, column);
       sp = new JScrollPane(due);
        due.setFont(new Font("", Font.CENTER_BASELINE, 14));
        due.setBounds(50, 150, 800, 230);
        sp.setBounds(50, 100, 800, 80);
        sp.setFont(new Font("", Font.CENTER_BASELINE, 16));
        due.setRowHeight(30);
        header = due.getTableHeader();
        header.setPreferredSize(new Dimension(200, 40));
        header.setFont(new Font("", Font.CENTER_BASELINE, 16));
      add(sp);
    

    }
}
/*
    Container c = this.getContentPane();
      c.setLayout(null);
      JTabbedPane t=new JTabbedPane();
      t.setBounds(50,400,300,300);
      c.add(t);
      p1 =new JPanel();
      p2 = new JPanel();
      p3 = new JPanel();
       ImageIcon   img = new ImageIcon("C:\\Users\\HP\\Pictures\\Saved Pictures/food.png");
       JLabel imgl= new JLabel(img);
     imgl.setBounds(50,400,290,270);
     c.add(imgl);
     ImageIcon   img1 = new ImageIcon("C:\\Users\\HP\\Pictures\\Saved Pictures/food1.png");
     JLabel imgl1= new JLabel(img1);
     imgl1.setBounds(50,400,290,270);
   //  c.add(imgl1);
      p1.add(imgl);
      p1.add(imgl1);
      p3.setBackground(Color.cyan);
      t.addTab("ID 1", p1);
      t.addTab("ID 2", p2);
      t.addTab("ID 3", p3);
 
 */