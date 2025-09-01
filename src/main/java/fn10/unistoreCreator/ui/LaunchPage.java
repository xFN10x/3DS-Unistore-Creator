package fn10.unistoreCreator.ui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;

public class LaunchPage extends JFrame {

    private final JPanel AlreadyMadeViewer = new JPanel();
    private final JScrollPane AlreadyMadeScroll = new JScrollPane(AlreadyMadeViewer,
            JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

    private final JButton CreateButton = new JButton("Create new...");

    private final SpringLayout Layout = new SpringLayout();

    public LaunchPage() {
        super("3DS Unistore Creator");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 400);
        setLayout(Layout);
        setResizable(false);

        Layout.putConstraint(SpringLayout.NORTH, AlreadyMadeScroll, 10, SpringLayout.NORTH, getContentPane());
        Layout.putConstraint(SpringLayout.SOUTH, AlreadyMadeScroll, 300, SpringLayout.NORTH, getContentPane());
        Layout.putConstraint(SpringLayout.WEST, AlreadyMadeScroll, 10, SpringLayout.WEST, getContentPane());
        Layout.putConstraint(SpringLayout.EAST, AlreadyMadeScroll, -10, SpringLayout.EAST, getContentPane());

        Layout.putConstraint(SpringLayout.EAST, CreateButton, -10, SpringLayout.EAST, getContentPane());
        Layout.putConstraint(SpringLayout.SOUTH, CreateButton, -10, SpringLayout.SOUTH, getContentPane());

        CreateButton.addActionListener(ac -> {
            CreationUI cui = new CreationUI(this);

            cui.setVisible(true);
        });

        add(AlreadyMadeScroll);
        add(CreateButton);
    }
}
