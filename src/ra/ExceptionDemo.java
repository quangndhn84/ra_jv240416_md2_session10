package ra;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        /*
         * try{
         *   Block Statements;
         * }catch(ex1){
         *   Block catch 1;
         * }catch(ex2){
         *   Block Catch 2;
         * }...
         * catch(Exception ex){
         *   Block Catch N;
         * }finally{
         *   Dù có lỗi hay không lỗi vẫn thực hiện khối lệnh finally;
         * }
         *
         * */
        //Nhập vào 2 số nguyên và in ra thương 2 số đó
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập vào số nguyên thứ nhất:");
            int firstNumber = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập vào số nguyên thứ hai:");
            int secondNumber = Integer.parseInt(scanner.nextLine());
            int div = firstNumber / secondNumber;
            System.out.println("Thương 2 số là: " + div);
        }
//        catch (NumberFormatException nfe){
//            //Xử lý lỗi convert dữ liệu đầu vào sang number
//            System.out.println("Có lỗi xảy ra trong quá trình convert dữ liệu sang number");
//        }catch (ArithmeticException aex){
//            //Xử lý lỗi toán học (chia cho 0)
//            System.out.println("Không thể chia cho 0");
//        }
        catch (NumberFormatException | ArithmeticException ex1) {
            System.out.println("Message: "+ex1.getMessage());
            ex1.printStackTrace();
        } catch (Exception ex) {
            //Xử lý lỗi nếu không phải lỗi numberformatexception hoặc AritheticException
            System.out.println("Lỗi không xác định");
        } finally {
            System.out.println("Chương trình kết thúc");
        }

    }
}
