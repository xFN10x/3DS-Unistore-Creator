package fn10.unistoreCreator.ui;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpringLayout;
import javax.swing.plaf.basic.BasicSpinnerUI;

import fn10.unistoreCreator.util.SpringUtilities;

import java.awt.Frame;;

public class CreationUI extends JDialog {

    private final JLabel NameText = new JLabel("Name");
    private final JLabel AuthText = new JLabel("Creator");
    private final JLabel DescriptionText = new JLabel("Description");
    private final JLabel FileNameText = new JLabel("File Name");
    private final JLabel UpdateURLText = new JLabel("Update URL");
    private final JLabel SheetURLText = new JLabel("Sheet URL");
    private final JLabel VersionText = new JLabel("Version");

    private final JTextField NameEntry = new JTextField();
    private final JTextField AuthEntry = new JTextField();
    private final JTextField DescriptionEntry = new JTextField();
    private final JTextField FileNameEntry = new JTextField();
    private final JTextField UpdateURLEntry = new JTextField();
    private final JTextField SheetURLEntry = new JTextField();
    private final JSpinner VersionEntry = new JSpinner(new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1));


    public CreationUI(Frame Parent) {
        super(Parent, "Create new UniStore", true);

        setSize(200, 300);
        setResizable(false);

        JPanel panel = new JPanel(new SpringLayout());

        panel.add(NameText);
        panel.add(NameEntry);
        panel.add(AuthText);
        panel.add(AuthEntry);
        panel.add(DescriptionText);
        panel.add(DescriptionEntry);
        panel.add(FileNameText);
        panel.add(FileNameEntry);
        panel.add(UpdateURLText);
        panel.add(UpdateURLEntry);
        panel.add(SheetURLText);
        panel.add(SheetURLEntry);
        panel.add(VersionText);
        panel.add(VersionEntry);

        add(panel);

        SpringUtilities.makeCompactGrid(panel, 7, 2, 6, 6, 6, 6);
    }

}
