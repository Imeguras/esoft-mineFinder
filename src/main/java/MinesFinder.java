import javax.swing.*;

public class MinesFinder extends JFrame {
    private JPanel painelPrincipal;
    private JLabel Header;

    public MinesFinder(String title) {
        super(title);
        setContentPane(painelPrincipal);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MinesFinder("Mines Finder").setVisible(true);
    }
}