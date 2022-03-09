import javax.swing.*;

public class MinesFinder extends JFrame {
    private JPanel painelPrincipal;
    private JLabel Header;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;

    public MinesFinder(String title) {
        super(title);
        setContentPane(painelPrincipal);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MinesFinder("Mines Finder").setVisible(true);
    }
}