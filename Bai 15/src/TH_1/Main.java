package TH_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập chỉ số của 1 phần tử bất kỳ: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số 5 " + x + " là: " + arr[x]);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Chỉ số vượt quá gioi hạn của mảng");
        }
    }
}