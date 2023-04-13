import javax.swing.*;

public class DashBoard extends JFrame{

    private JPanel mainPanel;
    private JButton addAccountButton;

    public DashBoard(String title) {
        super(title);
        setContentPane(mainPanel);
        pack();
    }

    public static void main(String[] args) {
        new DashBoard("Financial App").setVisible(true);
    }
}
