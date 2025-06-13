package fertGL;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class WeatherApp extends JFrame {
    public WeatherApp() {
        super("Weather App");

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(345,450);

        setLocationRelativeTo(null);

        setLayout(null);

        setResizable(false);

        addAppComponent();
    }

    private void addAppComponent() {
        JTextField searchTextField = new JTextField();

        searchTextField.setBounds(15,15,250,35);

        searchTextField.setFont(new Font("Dialog",Font.ROMAN_BASELINE,24));

        add(searchTextField);

        JButton searchButton = new JButton(loadImage("src/main/resources/img/free-icon-search-6711440.png"));

        searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));

        searchButton.setBounds(270,15,33,33);
        add(searchButton);

        JLabel weatherConditionImage = new JLabel(loadImage("src/main/resources/img/free-icon-sun-4814268.png"));

        weatherConditionImage.setBounds(20,70,128,128);
        add((weatherConditionImage));

        JLabel tempText = new JLabel("10 C");
        tempText.setBounds(150,80,150,100);
        tempText.setFont(new Font("Dialog",Font.TRUETYPE_FONT,48));

        tempText.setHorizontalAlignment(SwingConstants.CENTER);
        add(tempText);
    }

    private ImageIcon loadImage(String resPath) {
        try {
            BufferedImage image = ImageIO.read(new File(resPath));

            return new ImageIcon(image);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Can't find resources");
        return null;
    }
}
