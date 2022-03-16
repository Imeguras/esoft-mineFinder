import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinesFinder extends JFrame {
    private JPanel painelPrincipal;
    private JLabel Titulo;
    private JPanel Stats;
    private JPanel Mid;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JPanel ButtonsGroup;


    public MinesFinder(String title) {
        super(title);
        this.setSize(800, 600);
        setContentPane(painelPrincipal);
        Titulo.setText(title);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getActionCommand());
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println(e.getActionCommand());
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println(e.getActionCommand());
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println(e.getActionCommand());
            }
        });
    }

    public static void main(String[] args) {
        new MinesFinder("Mines Finder").setVisible(true);
    }
}