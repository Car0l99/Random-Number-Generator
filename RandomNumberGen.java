import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomNumberGen extends JFrame implements ActionListener {

    JTextField textField;
    Random rand = new Random();
    JButton random;
    JFrame frame;

    public RandomNumberGen() {

        frame = new JFrame();
        frame.setVisible(true);
        frame.setTitle("Number Generator");
        frame.getContentPane().setBackground(new Color(0xA0B1F3));
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        textField = new JTextField();
        textField.setBounds(60, 60, 150, 40);
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setFont(new Font("Times New Roman", Font.BOLD, 20));
        frame.add(textField);

        random = new JButton("Random");
        frame.getContentPane().add(random);
        random.setBounds(90, 150, 90, 30);
        random.setBackground(new Color(0xA4A7B5));
        random.setFont(new Font("Times New Roman", Font.BOLD, 12));
        random.setForeground(Color.DARK_GRAY);
        random.addActionListener(this);

        frame.setVisible(true);
        frame.revalidate();
        frame.repaint();


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == random) {
            int lucky = rand.nextInt(1000);
            textField.setText(String.format(String.valueOf(lucky)));
        }

    }

    public static void main(String[] args) {
        new RandomNumberGen();
    }
}

