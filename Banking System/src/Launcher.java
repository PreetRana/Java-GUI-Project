import gui.LoginForm;
import gui.RegisterForm;

import javax.swing.*;

public class Launcher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //instantiate a LoginFormGUI obj and make visible
                new LoginForm().setVisible(true);

            }
        });
    }
}
