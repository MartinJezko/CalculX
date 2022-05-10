import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    static String input = "";

    GUI() {

        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new GridLayout(6, 1));

        JLabel title = new JLabel("Java Calculator");
        JTextField inputfield = new JTextField(20);

        FlowLayout buttonlayout = new FlowLayout();
        JPanel buttonpanel1 = new JPanel();
        JPanel buttonpanel2 = new JPanel();
        JPanel buttonpanel3 = new JPanel();
        JPanel buttonpanel4 = new JPanel();
        buttonpanel1.setLayout(buttonlayout);
        buttonpanel2.setLayout(buttonlayout);
        buttonpanel3.setLayout(buttonlayout);
        buttonpanel4.setLayout(buttonlayout);


        // SET THE BUTTONS
        JButton sevenbtn = new JButton("7");
        sevenbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input += "7";
                inputfield.setText(input);
            }
        });

        JButton eightbtn = new JButton("8");
        eightbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input += "8";
                inputfield.setText(input);
            }
        });

        JButton ninebtn = new JButton("9");
        ninebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input += "9";
                inputfield.setText(input);
            }
        });

        JButton plusbutton = new JButton("+");
        plusbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input += "+";
                inputfield.setText(input);
            }
        });

        JButton fourbtn = new JButton("4");
        fourbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input += "4";
                inputfield.setText(input);
            }
        });

        JButton fivebtn = new JButton("5");
        fivebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input += "5";
                inputfield.setText(input);
            }
        });

        JButton sixbtn = new JButton("6");
        sixbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input += "6";
                inputfield.setText(input);
            }
        });

        JButton minusbutton = new JButton("-");
        minusbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input += "-";
                inputfield.setText(input);
            }
        });

        JButton onebtn = new JButton("1");
        onebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input += "1";
                inputfield.setText(input);
            }
        });

        JButton twobtn = new JButton("2");
        twobtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input += "2";
                inputfield.setText(input);
            }
        });

        JButton threebtn = new JButton("3");
        threebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input += "3";
                inputfield.setText(input);
            }
        });

        JButton dividebutton = new JButton(":");
        dividebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input += "/";
                inputfield.setText(input);
            }
        });

        JButton ENTERbtn = new JButton("="); // RESULT ACTION
        ENTERbtn.setBackground(Color.CYAN);
        ENTERbtn.setOpaque(true);
        ENTERbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calculator.process(input);
            }
        });

        JButton zerobtn = new JButton("0");
        zerobtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input += "0";
                inputfield.setText(input);
            }
        });

        JButton CANCELbtn = new JButton("C");
        CANCELbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = "";
                inputfield.setText(input);
            }
        });

        JButton multiplybutton = new JButton("x");
        multiplybutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input += "*";
                inputfield.setText(input);
            }
        });



        // Add content to panel
        buttonpanel1.add(sevenbtn);
        buttonpanel1.add(eightbtn);
        buttonpanel1.add(ninebtn);
        buttonpanel1.add(plusbutton);
        buttonpanel2.add(fourbtn);
        buttonpanel2.add(fivebtn);
        buttonpanel2.add(sixbtn);
        buttonpanel2.add(minusbutton);
        buttonpanel3.add(onebtn);
        buttonpanel3.add(twobtn);
        buttonpanel3.add(threebtn);
        buttonpanel3.add(multiplybutton);
        buttonpanel4.add(ENTERbtn);
        buttonpanel4.add(zerobtn);
        buttonpanel4.add(CANCELbtn);
        buttonpanel4.add(dividebutton);



        // Add content to frame, pack the frame
        frame.add(title);
        frame.add(inputfield);
        frame.add(buttonpanel1);
        frame.add(buttonpanel2);
        frame.add(buttonpanel3);
        frame.add(buttonpanel4);


        frame.pack();
        frame.setVisible(true);
    }

}
