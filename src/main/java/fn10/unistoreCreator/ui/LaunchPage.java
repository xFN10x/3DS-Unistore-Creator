package fn10.unistoreCreator.ui;

import javax.swing.JFrame;
import java.awt.Dimension;

public class LaunchPage extends JFrame {

    protected static final Dimension Size = new Dimension(400, 450);

    public LaunchPage() {
        super("3DS Unistore Creator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setSize(Size);

    }
}
