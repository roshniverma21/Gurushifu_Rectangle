package com.thoughtworks.rectangle;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RectangleTest{
    @Test
    void shouldCalculateTheAreaOfRectangleWhenLengthAndWidthArePositive(){
        Rectangle rectangle = new Rectangle(10.0, 20.0);
        double calculatedArea = rectangle.area();
        assertThat(calculatedArea, is(closeTo(200.0,0.001)));
    }

    @Test
    void shouldCalculateThePerimeterOfRectangleWhenLengthAndWidthArePositive(){
        Rectangle rectangle = new Rectangle(10.0, 20.0);
        double calculatedPerimeter = rectangle.perimeter();
        assertThat(calculatedPerimeter, is(closeTo(60.0,0.001)));
    }
}