import java.util.Scanner;

public class TinhToan {
    public static void main(String[] args) {
        double x = new TinhToan().calculateRectanglePerimeter(5,6);
        System.out.println(x);
    }

    // tinh chu vi hcn
    public double calculateRectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }


    // Tính chu vi hình vuông
    public  double calculateSquarePerimeter(double side) {
        return 4 * side;
    }


    private  boolean isValidNumber(double num) {
        return !Double.isNaN(num) && !Double.isInfinite(num);
    }
}
