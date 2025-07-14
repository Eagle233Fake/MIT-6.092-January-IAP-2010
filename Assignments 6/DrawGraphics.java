import java.awt.Color;
import java.awt.Graphics;

public class DrawGraphics {
    Bouncer movingSprite;

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        Rectangle box = new Rectangle(15, 20, Color.RED);
        movingSprite = new Bouncer(100, 170, box);
        movingSprite.setMovementVector(3, 1);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        movingSprite.draw(surface);
    }
}
