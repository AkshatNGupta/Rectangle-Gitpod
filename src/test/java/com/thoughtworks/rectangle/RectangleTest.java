package com.thoughtworks.rectangle;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    public void shouldCalculateAreaOfRectangle() {
        Rectangle rectangle = new Rectangle(2, 3);
        int area = rectangle.area();
        assert(area == 6);
    }
}
