import java.util.Scanner;
class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}
public class TriangleApp {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào 3 cạnh của tam giác");
            System.out.println("Cạnh 1: ");
            int side1 = scanner.nextInt();
            System.out.println("Cạnh 2: ");
            int side2 = scanner.nextInt();
            System.out.println("Cạnh 3: ");
            int side3 = scanner.nextInt();

            checkTriangle(side1,side2,side3);

            System.out.println("Ba cạnh nhập vào hợp lệ và tạo thành một tam giác.");
        } catch (IllegalTriangleException e){
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    public static void checkTriangle(int side1,int side2, int side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0){
            throw new IllegalTriangleException("Cạnh tam giác phải là số dương.");
        }
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1){
            throw new IllegalTriangleException("Tổng hai cạnh không lớn hơn cạnh còn lại.");
        }
    }
}
