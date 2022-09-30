import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame  {
    //Game Frame contains window for game includes minimize, maximize and close button

    GamePanel panel; // Instance of GamePanel class
    GameFrame(){
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack(); //GameFrame will adjust itself according to GamePanel.
        this.setVisible(true);
        this.setLocationRelativeTo(null); //GameFrame will appear in the center of our screen.

    }

}
