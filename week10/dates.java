/*1. Write a small application with a default date 01/01/2000 and three combo boxes
displaying valid days, months & year (1990 – 2050). Change the displayed date with the
one chosen by user from these combo boxes.*/


import javax.swing.*;
import java.awt.event.*;

public class dates extends JFrame implements ActionListener
 {
    JLabel selectedDateLabel;
    JComboBox dc, mc, yc;

    public dates()
     {
        setTitle("Date Selection");
        setSize(400, 200);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // setLocationRelativeTo(null); 

        
        String defaultDate = "01/01/2000";

     
        String days[] = new String[31];
        for (int i = 0; i < 31; i++)
         {
            days[i] = String.format("%02d", i + 1);
        }
        
        dc = new JComboBox(days);

        String months []= new String[12];
        for (int i = 0; i < 12; i++)
         {
            months[i] = String.format("%02d", i + 1);
        }
        mc = new JComboBox(months);

        String years[] = new String[61];
        for (int i = 0; i < 61; i++)
         {
            years[i] = Integer.toString(1990 + i);
        }
        yc = new JComboBox(years);

        // Set default date in combo boxes
        dc.setSelectedItem(defaultDate.substring(0, 2));
        mc.setSelectedItem(defaultDate.substring(3, 5));
        yc.setSelectedItem(defaultDate.substring(6));

        // Add action listener to combo boxes
        dc.addActionListener(this);
        mc.addActionListener(this);
        yc.addActionListener(this);

       
       
        selectedDateLabel = new JLabel("Selected Date: " + defaultDate);

        
        JPanel panel = new JPanel();
        
        panel.add(new JLabel("Day: "));
        panel.add(dc);
        
        panel.add(new JLabel("Month: "));
        panel.add(mc);
        
        panel.add(new JLabel("Year: "));
        panel.add(yc);
        
        panel.add(selectedDateLabel);

        add(panel);
        setVisible(true);
    }

   
    public void actionPerformed(ActionEvent e) 
    {
        // Update selected date label
        String selectedDate = dc.getSelectedItem() + "/" + mc.getSelectedItem() + "/" + yc.getSelectedItem() ;
        selectedDateLabel.setText("Selected Date: " + selectedDate);
       
    }

    public static void main(String[] args)
     {
        new dates();
    }
}

