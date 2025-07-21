import java.awt.Color;
import java.awt.Graphics;

public class DrawGraphics {
    BouncingBox box;
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box = new BouncingBox(150, 150, Color.RED);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        surface.drawLine(50, 250, 250, 50);
        surface.drawRoundRect(250, 50, 250, 50, 50, 50);
        box.draw(surface);
    }
} 