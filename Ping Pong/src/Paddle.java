import java.awt.*;
import java.awt.event.KeyEvent;

public class Paddle extends Rectangle {

    int id; //Id for players
    int yVelocity; //speed of paddles in vertical direction
    int speed = 10;

    Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id){
        super(x, y, PADDLE_WIDTH, PADDLE_HEIGHT); //super class of paddle is rectangle.
        this.id = id;
    }

    public void keyPressed(KeyEvent e) {
        //when key is pressed paddle moves.
        switch (id) {
            case 1 -> {
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    setYDirection(-speed);
                    move();
                }
                if (e.getKeyCode() == KeyEvent.VK_S) {
                    setYDirection(speed);
                    move();
                }
            }
            case 2 -> {
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    setYDirection(-speed);
                    move();
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    setYDirection(speed);
                    move();
                }
            }
        }

    }

    public void keyReleased(KeyEvent e) {
        //when key is released paddle stops.
        switch (id) {
            case 1 -> {
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    setYDirection(0);
                    move();
                }
                if (e.getKeyCode() == KeyEvent.VK_S) {
                    setYDirection(0);
                    move();
                }
            }
            case 2 -> {
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    setYDirection(0);
                    move();
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    setYDirection(0);
                    move();
                }
            }
        }
    }

    public void setYDirection(int yDirection){
        yVelocity = yDirection;
    }

    public void move(){
        y+=yVelocity;
    }

    public void draw(Graphics g){
        if(id==1)
            g.setColor(Color.BLUE);
        else
            g.setColor(Color.red);

        g.fillRect(x, y, width, height);
    }
}
