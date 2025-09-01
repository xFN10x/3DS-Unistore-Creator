package fn10.unistoreCreator;

import com.formdev.flatlaf.FlatLightLaf;

import fn10.unistoreCreator.ui.LaunchPage;

public class Launcher {

    public static void main(String[] args) {
        try {
            FlatLightLaf.setup();
        } catch (Exception e) {
            e.printStackTrace();
        }

        LaunchPage lp = new LaunchPage();

        lp.setVisible(true);
    }

}
