package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    void shouldReturnAreaWhenLengthAndBreadthArePositive() {
        Rectangle rectangle;
        rectangle = new Rectangle(2, 5);
        int area = rectangle.area();
        assertThat(area, is(equalTo(10)));
    }
}
