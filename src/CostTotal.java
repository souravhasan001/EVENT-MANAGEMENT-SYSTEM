
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CostTotal extends JFrame {
    String money;

    CostTotal(String title) {
        super(title);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(901, 499);

        setLayout(null);
        setVisible(true);

        JLabel label1 = new JLabel("Calculating Bank Internal Charge");
        label1.setFont(new Font("Tahoma", Font.BOLD, 20));
        label1.setBounds(315, 0, 386, 45);
        add(label1);

        JButton button = new JButton("<Back");
        button.setBounds(10, 15, 87, 32);
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                // Pannel1 pl=new Pannel1();
            }

        });

        JLabel label2 = new JLabel("All Bill :");
        label2.setBounds(39, 101, 117, 24);
        add(label2);

        JTextField textField = new JTextField();
        textField.setBounds(166, 96, 167, 34);
        add(textField);
        textField.setColumns(10);

        JTextField textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(166, 223, 167, 34);
        add(textField_2);

        JTextField textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(166, 366, 167, 34);
        add(textField_4);

        JLabel lblGroundCharger = new JLabel("Employes Payment :");
        lblGroundCharger.setBounds(39, 233, 132, 24);
        add(lblGroundCharger);

        JLabel lblMaintananceCost = new JLabel("Maintanance Charge :");
        lblMaintananceCost.setBounds(25, 371, 132, 24);
        add(lblMaintananceCost);

        JLabel lblTaka = new JLabel("TK");
        lblTaka.setBounds(343, 101, 48, 24);
        add(lblTaka);

        JLabel lblTaka_2 = new JLabel("TK");
        lblTaka_2.setBounds(343, 228, 48, 24);
        add(lblTaka_2);

        JLabel lblTaka_4 = new JLabel("TK");
        lblTaka_4.setBounds(343, 371, 48, 24);
        add(lblTaka_4);

        JLabel label4 = new JLabel("");
        label4.setFont(new Font("Tahoma", Font.BOLD, 17));
        label4.setBounds(542, 252, 314, 34);
        add(label4);

        JButton button5 = new JButton("calculate");
        button5.setBounds(563, 170, 89, 34);
        add(button5);
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s1 = textField.getText();
              
                String s3 = textField_2.getText();

                String s5 = textField_4.getText();

                double d1 = Double.parseDouble(s1);

                double d3 = Double.parseDouble(s3);

                double d5 = Double.parseDouble(s5);

                double sum = d1 + d3 + d5;

                String sm = String.valueOf(sum);
                money = sm;
                sm += " Taka Only";
                label4.setText(sm);

            }
        });


    }

}