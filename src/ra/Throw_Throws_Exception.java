package ra;

import java.util.Scanner;

public class Throw_Throws_Exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên thứ nhất:");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số nguyên thứ hai:");
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int div = divide(firstNumber,secondNumber);
        System.out.println("Thương 2 số là: "+div);
    }

    //throws: ném ngoại lệ khi phương thức có exception
    public static int divide(int number1, int number2) throws ArithmeticException,NumberFormatException,NullPointerException{
        //throw: ném ra ngoại lệ cho trường hợp cụ thể
        if (number2==0){
            throw new ArithmeticException("Lỗi chia cho 0");
        }
        int div = number1/number2;
        return div;
    }
}
