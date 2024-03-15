import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class ShopeePageOpenerGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Shopee Page Opener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton openButton = new JButton("Abrir Shopee");
        openButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openShopeePageUnder10();
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(openButton);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void openShopeePageUnder10() {
        try {
            Desktop.getDesktop().browse(new URI("https://shopee.com.br/daily_discover?pageNumber=2"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

public class ShopeePageOpener {
    public static void main(String[] args) {
        openShopeePageDailyDiscover();
    }

    public static void openShopeePageDailyDiscover() {
        try {
            URI uri = new URI("https://shopee.com.br/daily_discover?pageNumber=2");
            Desktop.getDesktop().browse(uri);
        } catch (IOException | URISyntaxException e) {
        }
    }
}
}