import javax.swing.*;
import java.awt.*;

public class CalculatorGUI extends JFrame {
    public CalculatorGUI() {
        setTitle("Calculator");
      

        JPanel panel = new JPanel(new GridLayout(5, 4, 5, 5));
        JTextField textField = new JTextField();
        textField.setEditable(false);
        panel.add(textField);

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (String label : buttonLabels)
         {
            JButton button = new JButton(label);
            panel.add(button);
        }

        add(panel);
        //pack();
        setLocationRelativeTo(null); // Center the frame
    }

    public static void main(String[] args)
     {
        //SwingUtilities.invokeLater(() ->
         
            CalculatorGUI calculator = new CalculatorGUI();
            calculator.setVisible(true);
       
    }
}

