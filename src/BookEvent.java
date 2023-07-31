import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class BookEvent extends JFrame {
    JComboBox<String> c, cb,cb3,cb4,cb5;
    BookEvent(String title) {
        super(title);
        setSize(1000, 600);
        final JLabel label1 = new JLabel();
        label1.setHorizontalAlignment(JLabel.RIGHT);
        label1.setSize(800, 100);
        add(label1);
        final JLabel l1 = new JLabel();
        l1.setHorizontalAlignment(JLabel.RIGHT);
        l1.setSize(800, 100);
        add(l1);
        label1.setBounds(500, 100, 300, 30);
        final JLabel label2 = new JLabel();
        label2.setHorizontalAlignment(JLabel.RIGHT);
        label2.setSize(800, 100);
        add(label2);
        label2.setBounds(500, 150, 300, 30);
        final JLabel label3 = new JLabel();
        label3.setHorizontalAlignment(JLabel.RIGHT);
        label3.setSize(800, 100);
        add(label3);
        label3.setBounds(500, 200, 300, 30);
        final JLabel label4 = new JLabel();
        label4.setHorizontalAlignment(JLabel.RIGHT);
        label4.setSize(800, 100);
        add(label4);
        label4.setBounds(500, 250, 300, 30);
        JLabel labelx = new JLabel("Event :");
        labelx.setBounds(40, 100, 117, 40);
        add(labelx);

        JLabel labelm = new JLabel("Vanue Place :");
        labelm.setBounds(40, 150, 117, 40);
        add(labelm);
        JLabel labeln = new JLabel("Food Item:");
        labeln.setBounds(40, 200, 117, 40);
        add(labeln);
        JLabel labelx1 = new JLabel("Date :");
        labelx1.setBounds(40, 250, 117, 40);
        add(labelx1);

        String EVENT[] = { " WEDDING ", " PARTY ", " CONFERENCE", " FAMILY EVENT", "BIRTHDAY", " SEMINER",
                " THEME PARTY" };
          cb = new JComboBox<>(EVENT);
        cb.setBounds(150, 100, 150, 35);
        add(cb);

        String VANUE[] = { " OPEN AIR ", " HOME ", " HOTEL", " OUTDOOR ",  " CANTONMENT ",
                " CONVENTIONAL HALL" };
         c = new JComboBox<>(VANUE);
        c.setBounds(150, 150, 150, 35);
        add(c);
        String FOODTYPE[] = { " CONTINENTAL ", " BUFFET ", " FAST FOOD", " NORMAL" };
        cb3 = new JComboBox<>(FOODTYPE);
        cb3.setBounds(150, 200, 150, 35);
        add(cb3);

       
        setLayout(null);
        setSize(901, 499);
        setVisible(true);
        String Date[] = { " JANUARY ", " FEBRUARY ", " MARCH", "APRIL", "MAY", "JYNE", "JULY",
                "AUGUST", "SEPTEMBER", "OCTBER", "NOVEMBER", "DECEMBER" };
        cb4 = new JComboBox<>(Date);
        cb4.setBounds(150, 250, 100, 35);
        add(cb4);
        String YEAR[] = { " 2022 ", " 2033 ", "2024" };
        cb5 = new JComboBox<>(YEAR);
        cb5.setBounds(250, 250, 100, 35);
        add(cb5);
        SpinnerModel value = new SpinnerNumberModel(31, 1, 31, 1);// step  
        JSpinner spinner = new JSpinner(value);
        spinner.setBounds(350, 250, 50, 35);
        add(spinner);
        spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                String date = "DATE : " + ((JSpinner) e.getSource()).getValue();
                String date2 = "- " + cb4.getItemAt(cb4.getSelectedIndex());
                String date3 = "- " + cb5.getItemAt(cb5.getSelectedIndex());
                label4.setText(" " + date + " " + date2 + " " + date3);
            }
        });
        setSize(901, 499); // frame
        setLayout(null); // frame
        setVisible(true); // frame
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        JButton b = new JButton("TOTAL");
        b.setBounds(150, 350, 100, 30);
        add(b);
        JButton b1 = new JButton("back");
        b1.setBounds(0, 0, 100, 30);
        add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            setVisible(false);
            new CustomerHome(" ").setVisible(true);
   }
        });
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "BOOKED EVENT :  " + cb.getItemAt(cb.getSelectedIndex());
                String data2 = "FOOD  :  " + cb3.getItemAt(cb3.getSelectedIndex());
                String data3 = "VANUE TYPE :  " + c.getItemAt(c.getSelectedIndex());
                label1.setText(data);
                label2.setText(data2);
                label3.setText(data3); 
                float amount = 0;
                String msg = "";

                if(c.getSelectedIndex()==0){
                    amount += 5000;
                    msg+="event = 5000";
                  
                }
             else   if (c.getSelectedIndex() == 1) {
                    amount += 2000;
                    l1.setText("2000");
                }

                else  if(c.getSelectedIndex()==2){
                    amount += 9000;
                    l1.setText("9000");
                }
                else  if(c.getSelectedIndex()==3){
                    amount += 7000;
                    l1.setText("7000");
                }
                else  if(c.getSelectedIndex()==4){
                    amount += 18000;
                    l1.setText("18000");
                }
                else  if(c.getSelectedIndex()==5){
                    amount += 15000;
                    l1.setText("15000");
                }

                if(cb3.getSelectedIndex()==0){
                    amount += 20000;
                    msg+="\nfood = 20000\n";
                   // l1.setText("5000");
                }
             else   if (cb3.getSelectedIndex() == 1) {
                    amount += 18000;
                    msg+="\n18000\n";
                }

                else  if(cb3.getSelectedIndex()==2){
                    amount += 13000;
                    msg+="\n13000\n";
                }
                else  if(cb3.getSelectedIndex()==3){
                    amount += 15000;
                    msg+="\n15000\n";
                }
                if(c.getSelectedIndex()==0){
                    amount += 15000;
                    msg+="event = 15000";
                   // l1.setText("5000");
                }
            
              else  if(cb3.getSelectedIndex()==1){
                    amount += 11000;
                    msg+="\n place = 11000\n";
                   // l1.setText("5000");
                }
             else   if (cb3.getSelectedIndex() == 2) {
                    amount += 13000;
                    msg+="\n13000\n";
                }

                else  if(cb3.getSelectedIndex()==3){
                    amount += 22000;
                    msg+="\n22000\n";
                }
                else  if(cb3.getSelectedIndex()==4){
                    amount += 16000;
                    msg+="\n15000\n";
                }
                else  if(cb3.getSelectedIndex()==5){
                    amount += 15000;
                    msg+="\n15000\n";
                }

                msg += "-----------------\n";
                JOptionPane.showMessageDialog(b, msg + "Total: " + amount);
              
            }
        });



    }
}

/*

 */