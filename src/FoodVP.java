import javax.swing.JFrame;
//import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;
import javax.swing.*;
//import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Font;
//import java.awt.event.ActionEvent;

public class FoodVP extends JFrame {
    JLabel l;
    JCheckBox cb1, cb2, cb3;
    JButton b;
    JScrollPane sp;
    JTable due;
    JTableHeader header;

    FoodVP(String title) {
        super(title);
        setSize(1000, 600);
      
        l = new JLabel("Food Ordering System");
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
        due.setBounds(80, 80,100, 30);
        sp.setBounds(50, 100, 800, 80);
        sp.setFont(new Font("", Font.CENTER_BASELINE, 16));
        due.setRowHeight(30);
        header = due.getTableHeader();
        header.setPreferredSize(new Dimension(200, 40));
        header.setFont(new Font("", Font.CENTER_BASELINE, 16));
        add(sp);


    }
}
