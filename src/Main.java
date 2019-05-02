import javax.swing.*;
import java.awt.event.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        JTextField results = new JTextField();
        JButton[][] digits = new JButton[4][4];
        digits[0][0] = new JButton("7");
        digits[0][1] = new JButton("4");
        digits[0][2] = new JButton("1");
        digits[0][3] = new JButton("0");
        digits[1][0] = new JButton("8");
        digits[1][1] = new JButton("5");
        digits[1][2] = new JButton("2");
        digits[1][3] = new JButton(",");
        digits[2][0] = new JButton("9");
        digits[2][1] = new JButton("6");
        digits[2][2] = new JButton("3");
        digits[2][3] = new JButton("=");
        digits[3][0] = new JButton("/");
        digits[3][1] = new JButton("*");
        digits[3][2] = new JButton("-");
        digits[3][3] = new JButton("+");
        JButton clear = new JButton("C");

        frame.setSize(260,330);
        frame.add(results);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(clear);
        results.setBounds(20,20,150, 50);
        for(int i = 0; i < digits.length; i++){
            for(int j = 0; j < digits.length; j++){
                frame.add(digits[i][j]);
                digits[i][j].setBounds(i* 50 + 20, j * 50 + 70, 50, 50);
            }
        }
        clear.setBounds(170,20,50,50);
      digits[0][0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                results.setText(results.getText() + 7);
            }
        });
        digits[0][1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                results.setText(results.getText() + 4);
            }
        });
        digits[0][2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                results.setText(results.getText() + 1);
            }
        });
        digits[0][3].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                results.setText(results.getText() + 0);
            }
        });
        digits[1][0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                results.setText(results.getText() + 8);
            }
        });
        digits[1][1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                results.setText(results.getText() + 5);
            }
        });
        digits[1][2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                results.setText(results.getText() + 2);
            }
        });
        digits[1][3].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                results.setText(results.getText() + ".");
            }
        });
        digits[2][0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                results.setText(results.getText() + 9);
            }
        });
        digits[2][1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                results.setText(results.getText() + 6);
            }
        });
        digits[2][2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                results.setText(results.getText() + 3);
            }
        });
       digits[2][3].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String count = results.getText();
                int sign = 0;
                int index = 0;
                double a;
                double b;
                double c = 0;
                Pattern p1 = Pattern.compile("[+]");
                Matcher m1 = p1.matcher(count);
                if (m1.find()){
                    sign = 1;
                    index = count.indexOf("+");
                }
                Pattern p2 = Pattern.compile("[-]");
                Matcher m2 = p2.matcher(count);
                if (m2.find()){
                    sign = 2;
                    index = count.indexOf("-");
                }
                Pattern p3 = Pattern.compile("[*]");
                Matcher m3 = p3.matcher(count);
                if (m3.find()){
                    sign = 3;
                    index = count.indexOf("*");
                }
                Pattern p4 = Pattern.compile("[/]");
                Matcher m4 = p4.matcher(count);
                if (m4.find()){
                    sign = 4;
                    index = count.indexOf("/");
                }
                a = Double.parseDouble(count.substring(0, index));
                b = Double.parseDouble(count.substring(index + 1));
                switch (sign) {
                    case 1:
                        c = a + b;
                        break;
                    case 2:
                        c = a - b;
                        break;
                    case 3:
                        c = a * b;
                        break;
                    case 4:
                        c = a / b;
                        break;
                }
                String counting = Double.toString(c);
                results.setText(counting);
            }
        });
        digits[3][0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                results.setText(results.getText() + '/');
            }
        });
        digits[3][1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                results.setText(results.getText() + '*');
            }
        });
        digits[3][2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                results.setText(results.getText() + '-');
            }
        });
        digits[3][3].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                results.setText(results.getText() + '+');
            }
        });
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                results.setText("");
            }
        });
    };
}
