package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz implements ActionListener {

    String[] questions = {
            "Qual o nome da compania que criou o java?",
            "Em que ano o java foi criado?",
            "Como o java era originalmente chamado?"
    };

    String[][] options = {
            {"Sun Microsystems", "Starbucks", "Microsoft", "Alphabet"},
            {"1989", "1996", "1872", "1834"},
            {"Apple", "Latte", "OaK", "Koffing"}

    };

    char[] answers = {
            'A',
            'B',
            'C',
            'D'
    };

    char guess;
    char answer;
    int index;
    int corret_gesses = 0;
    int total_questions = questions.length;
    int result;
    int seconds = 10;

    JFrame frame = new JFrame();
    JTextField textField = new JTextField();
    JTextArea textArea = new JTextArea();
    JButton buttonA = new JButton();
    JButton buttonB = new JButton();
    JButton buttonC = new JButton();
    JButton buttonD = new JButton();
    JLabel answer_labelA = new JLabel();
    JLabel answer_labelB = new JLabel();
    JLabel answer_labelC = new JLabel();
    JLabel answer_labelD = new JLabel();
    JLabel time_label = new JLabel();
    JLabel seconds_left = new JLabel();
    JTextField number_right = new JTextField();
    JTextField percentage = new JTextField();

    public Quiz() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650, 650);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setLayout(null);
        frame.setResizable(false);

        textField.setBounds(0, 0, 650, 50);
        textField.setBackground(new Color(25, 25, 25));
        textField.setForeground(new Color(25, 200, 0));
        textField.setFont(new Font("Ink Free", Font.BOLD, 30));
        textField.setBorder(BorderFactory.createBevelBorder(1));
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setEditable(false);

        textArea.setBounds(0, 0, 650, 50);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("MV Boli", Font.BOLD, 25));
        textArea.setBorder(BorderFactory.createBevelBorder(1));
        textArea.setEditable(false);



        frame.add(textArea);
        frame.add(textField);
        frame.setVisible(true);

    }

    public void nextQuestion() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void displayAnswer() {

    }

    public void results() {

    }

}
