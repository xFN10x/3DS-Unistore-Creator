package fn10.unistoreCreator;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

import fn10.unistoreCreator.ui.LaunchPage;
import fn10.unistoreCreator.util.SettingsManager;
import fn10.unistoreCreator.enums.Theme;

public class Launcher {

    public static void main(String[] args) {
        try {
            switch (SettingsManager.load().selectedTheme) {
                case Theme.LightAlt:
                    FlatMacLightLaf.setup();
                    break;

                case Theme.Dark:
                    FlatDarkLaf.setup();
                    break;

                case Theme.DarkAlt:
                    FlatDarculaLaf.setup();
                    break;

                case Theme.Light:
                default:
                    FlatLightLaf.setup();
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        LaunchPage launchPage = new LaunchPage();
        launchPage.setVisible(true);
    }
}
