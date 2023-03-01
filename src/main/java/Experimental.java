import javax.swing.*;

public class Experimental extends JFrame {
    private JPanel panel1;
    private JLabel lblMensagem;

    public Experimental(){
        setContentPane(panel1);
        pack();
    }
    public static void main(String[] args) {
        new Experimental().setVisible(true);
    }
}