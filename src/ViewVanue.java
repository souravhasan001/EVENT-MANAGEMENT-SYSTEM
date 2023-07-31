import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.JTableHeader;
import java.awt.*;
import javax.swing.*;

public class ViewVanue extends JFrame {
    JLabel l;
    JCheckBox cb1, cb2, cb3;
    JButton b;
    JScrollPane sp;
    JTable due;
    JTableHeader header;
    ViewVanue(String title){
        super(title);
        setSize(1000, 600);
      /*   JLabel todayHeader = new JLabel(" VIEW VANUE ", SwingConstants.CENTER);
        todayHeader.setBounds(350, 50, 200, 30);
        todayHeader.setOpaque(true);
        todayHeader.setBackground(Color.black);
        todayHeader.setFont(new Font("", Font.BOLD, 18));
        todayHeader.setForeground(Color.pink);
        add(todayHeader);
        */
        JButton add = new JButton("BACK ");
        add.setBounds (200, 300, 200, 45);
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
            l = new JLabel(" VIEW VANUE");
            l.setBounds(50, 50, 300, 20);
            String data[][]={
                {" 1"," BIRTHDAY ", "15000 "},
                {" 2"," FAMILY EVENT", "11000 "},
                {" 3", " SEMINER","13000"},
                {" 4", " WEDDING", "22000"},
                {" 5", " PARTY", "16000"},
                {" 6", " CONFERENCE", "15000"}
            };    
            String column[]={"VANUE ID","VANUE NAME", "VANUE COST"};      
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
    


        setSize(901, 499); //frame
    }
}
