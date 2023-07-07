package ui;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CalculadorGUI extends JFrame implements ActionListener{
    public JTextField txt;
    JLabel c1, c2, c3, c4;
    public JButton[] numberButtons;
    public JButton[] functionButtons;
    public JButton plusButton, subButton, mulButton, divButton, equButton, exButton;
    JPanel panel;

    public CalculadorGUI(){
        numberButtons = new JButton[10];
        functionButtons = new JButton[6];
        c1 = new JLabel("C1");
        c1.setHorizontalAlignment(SwingConstants.CENTER);
        c2 = new JLabel("C2");
        c2.setHorizontalAlignment(SwingConstants.CENTER);
        c3 = new JLabel("C3");
        c3.setHorizontalAlignment(SwingConstants.CENTER);
        c4 = new JLabel("C4");
        c4.setHorizontalAlignment(SwingConstants.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,400);

        txt = new JTextField();
        txt.setEditable(false);
        new TextPrompt("1234567890", txt);
        this.add(txt, BorderLayout.NORTH);

        plusButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        exButton = new JButton("^");
        equButton = new JButton("=");

        functionButtons[0] = plusButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = exButton;
        functionButtons[5] = equButton;
        
        for (int i = 0; i < functionButtons.length; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFocusable(false);
        }

        for (int i = 0; i < numberButtons.length; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFocusable(false);
        }

        panel = new JPanel();
        panel.setLayout(new GridLayout(5,4,10,10));
        panel.add(c1);
        panel.add(c2);
        panel.add(c3);
        panel.add(c4);
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(plusButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(divButton);
        panel.add(numberButtons[0]);
        panel.add(exButton);
        panel.add(equButton);
        this.add(panel, BorderLayout.CENTER);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        for (int i = 0; i < numberButtons.length; i++) {
            if(e.getSource() == numberButtons[i]){
                txt.setText(txt.getText().concat(String.valueOf(i)));
            }
        }

    }

}