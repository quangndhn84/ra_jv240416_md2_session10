package ra;

import java.util.Scanner;

public class MenuDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("*************SHOP MANAGEMENT***********");
            System.out.println("1. Quản lý danh mục");
            System.out.println("2. Quản lý sản phẩm");
            System.out.println("3. Thoát");
            System.out.println("Lựa chọn của bạn:");
            int choice = inputChoiceMenu(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayMenuCategories(scanner);
                    break;
                case 2:
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng nhập từ 1-3");
            }
        } while (true);
    }

    public static void displayMenuCategories(Scanner scanner) {
        boolean isExit = true;
        do {
            System.out.println("***********CATEGORIES MANAGEMENT**************");
            System.out.println("1. Danh sách danh mục");
            System.out.println("2. Thêm mới danh mục");
            System.out.println("3. Thoát");
            System.out.println("Lựa chọn của bạn:");
            int choice = inputChoiceMenu(scanner.nextLine());
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    isExit = false;
                    break;
                default:
                    System.err.println("Vui lòng chọn từ 1-3");
            }
        } while (isExit);
    }

    public static int inputChoiceMenu(String choiceStr) {
        do {
            try {
                int choice = Integer.parseInt(choiceStr);
                return choice;
            } catch (Exception ex) {
                System.err.println("Lựa chọn phải là số nguyên, vui lòng nhập lại");
            }
        } while (true);
    }
}
