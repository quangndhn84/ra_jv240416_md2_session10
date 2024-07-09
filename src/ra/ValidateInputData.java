package ra;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ValidateInputData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nhập vào tuổi sinh viên kiểu số nguyên có giá trị lớn hơn 18
        int age = inputAge(scanner);
        System.out.println("Tuổi sinh viên vừa nhập: " + age);
        //Nhập vào điểm trung bình của sinh viên có kiểu dữ liệu là float và giá trị từ 0-10
        float avgMark = inputAvgMark(scanner);
        System.out.println("Điểm trung bình: " + avgMark);
        //Nhập vào ngày sinh của sinh viên (java.util.date) có định dạng dd/MM/yyyy
        Date birthDate = inputBirthDate(scanner);
        System.out.println("Ngày sinh của sinh viên: " + birthDate);
    }

    public static int inputAge(Scanner scanner) {
        System.out.println("Nhập vào tuổi sinh viên:");
        do {
            try {
                int age = Integer.parseInt(scanner.nextLine());
                if (age >= 18) {
                    return age;
                } else {
                    System.err.println("Tuổi sinh viên phải lớn hơn hoặc bằng 18, vui lòng nhập lại");
                }
            } catch (NumberFormatException nfe) {
                System.err.println("Tuổi sinh viên phải là số nguyên, vui lòng nhập lại");
            } catch (Exception ex) {
                System.err.println("Lỗi chưa xác định, vui lòng nhập lại");
            }
        } while (true);
    }

    public static float inputAvgMark(Scanner scanner) {
        System.out.println("Nhập vào điểm trung bình của sinh viên:");
        do {
            try {
                float avgMark = Float.parseFloat(scanner.nextLine());
                if (avgMark >= 0 && avgMark <= 10) {
                    return avgMark;
                } else {
                    System.err.println("Điểm trung bình trong khoảng 0-10, vui lòng nhập lại");
                }
            } catch (Exception ex) {
                System.err.println("Điểm trung bình có kiểu dữ liệu là số thực, vui lòng nhập lại");
            }
        } while (true);
    }

    public static Date inputBirthDate(Scanner scanner) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nhâp vào ngày sinh cuả sinh viên:");
        do {
            try {
                Date birthDate = sdf.parse(scanner.nextLine());
                return birthDate;
            } catch (Exception ex) {
                System.err.println("Ngày sinh sinh viên không đúng định dạng (dd/MM/yyyy), vui lòng nhập lại");
            }
        } while (true);
    }
}
