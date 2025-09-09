
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class GuessNumber extends JFrame{
    private int target;
    public GuessNumber(){
        super("Guess the Number");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,150);
        JPanel p=new JPanel();
        JTextField tf=new JTextField(10);
        JButton b=new JButton("Guess");
        JLabel l=new JLabel("Enter a number 1-100");
        p.add(l);p.add(tf);p.add(b);
        add(p);
        target=new Random().nextInt(100)+1;
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    int g=Integer.parseInt(tf.getText());
                    if(g==target) JOptionPane.showMessageDialog(null,"Correct!");
                    else if(g<target) JOptionPane.showMessageDialog(null,"Higher");
                    else JOptionPane.showMessageDialog(null,"Lower");
                }catch(Exception ex){ JOptionPane.showMessageDialog(null,"Invalid");}
            }
        });
    }
    public static void main(String[]args){
        SwingUtilities.invokeLater(new Runnable(){ public void run(){ new GuessNumber().setVisible(true); }});
    }
}
