package geometry2d;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    @Test
    public void testArea() {
        Circle circle = new Circle(2);
        double expectedArea = Math.PI * 2 * 2;
        assertEquals(expectedArea, circle.area(), 0.0001);
    }
}
