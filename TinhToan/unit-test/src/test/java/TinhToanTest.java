import java.util.Scanner;



import static org.junit.Assert.*;

public class TinhToanTest {
    private TinhToan ShapeCalculator = new TinhToan();


    public static void main(String[] args) {

        new TinhToanTest().testRectangleWithInvalidWidth();
    }

    Scanner scanner = new Scanner(System.in);


    @org.junit.Test
    public void testRectangleWithNegativeLength() {
        assertThrows(IllegalArgumentException.class, () -> {
            ShapeCalculator.calculateRectanglePerimeter(-5, 4);
        });
    }

    @org.junit.Test
    public void testRectangleWithInvalidLength() {
        assertThrows(NumberFormatException.class, () -> {
            ShapeCalculator.calculateRectanglePerimeter(Double.parseDouble(" "), 4);
        });
    }



    @org.junit.Test
    public void testRectangleWithInvalidWidth() {
        assertThrows(NumberFormatException.class, () -> {
            ShapeCalculator.calculateRectanglePerimeter(5, Double.parseDouble("a"));
        });

    }



    @org.junit.Test
    public void testRectangleWithLength() {
        assertThrows(NullPointerException.class, () -> {
            ShapeCalculator.calculateRectanglePerimeter(Double.parseDouble("a"), 4);
        });
    }


    @org.junit.Test
    public void testRectangleWithtwo() {
        assertThrows(NullPointerException.class, () -> {
            ShapeCalculator.calculateRectanglePerimeter(Double.parseDouble("/*"), Double.parseDouble("a"));
        });
    }


    @org.junit.Test
    public void testRectangleWithNullLength() {
        assertThrows(NullPointerException.class, () -> {
            ShapeCalculator.calculateRectanglePerimeter(Double.parseDouble(null), Double.parseDouble(null));
        });
    }


    @org.junit.Test
    public void testRectanglePerimeterWithValidInput() {
        assertEquals(18, ShapeCalculator.calculateRectanglePerimeter(5, 4));
    }

    @org.junit.Test
    public void testRectanglePerimeterWithNegativeLength() {
        assertThrows(IllegalArgumentException.class, () -> {
            ShapeCalculator.calculateRectanglePerimeter(-5, 4);
        });
    }

    @org.junit.Test
    public void testRectanglePerimeterWithInvalidLength() {
        assertThrows(NumberFormatException.class, () -> {
            ShapeCalculator.calculateRectanglePerimeter(Double.parseDouble(""), 4);
        });
    }

    @org.junit.Test
    public void testRectanglePerimeterWithNullLength() {
        assertThrows(NullPointerException.class, () -> {
            ShapeCalculator.calculateRectanglePerimeter(Double.parseDouble(null), 4);
        });
    }

    @org.junit.Test
    public void testRectanglePerimeterWithInvalidWidth() {
        assertThrows(NumberFormatException.class, () -> {
            ShapeCalculator.calculateRectanglePerimeter(5, Double.parseDouble("abc"));
        });
    }

    @org.junit.Test
    public void testRectanglePerimeterWithNullWidth() {
        assertThrows(NullPointerException.class, () -> {
            ShapeCalculator.calculateRectanglePerimeter(5, Double.parseDouble(null));
        });
    }

    @org.junit.Test
    public void testRectanglePerimeterWithZeroWidth() {
        assertEquals(10, ShapeCalculator.calculateRectanglePerimeter(5, 0));
    }

    @org.junit.Test
    public void testSquarePerimeterWithValidSide() {
        assertEquals(20, ShapeCalculator.calculateSquarePerimeter(5));
    }

    @org.junit.Test
    public void testSquarePerimeterWithNegativeSide() {
        assertThrows(IllegalArgumentException.class, () -> {
            ShapeCalculator.calculateSquarePerimeter(-5);
        });
    }


    @org.junit.Test
    public void testSquarePerimeterWithZeroSide() {
        assertEquals(0, ShapeCalculator.calculateSquarePerimeter(0));
    }


    @org.junit.Test
    public void testSquarePerimeterWithInvalidSide() {
        assertThrows(NumberFormatException.class, () -> {
            ShapeCalculator.calculateSquarePerimeter(Double.parseDouble(""));
        });
    }


    @org.junit.Test
    public void testSquarePerimeterWithInvalidSide2() {
        assertThrows(NumberFormatException.class, () -> {
            ShapeCalculator.calculateSquarePerimeter(Double.parseDouble("abc"));
        });
    }


    @org.junit.Test
    public void testSquarePerimeterWithInvalidSide3() {
        assertThrows(NumberFormatException.class, () -> {
            ShapeCalculator.calculateSquarePerimeter(Double.parseDouble("!@#$123"));
        });
    }

    }








