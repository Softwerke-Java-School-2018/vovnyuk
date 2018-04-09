import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Please select the type of device you want to purchase(phone, tablet, laptop, player): ");
        String type = in.nextLine();
        if (type.equals("phone")){
            System.out.print("Please select the manufacturer of the device you want to purchase(APPLE, SAMSUNG, LENOVO, HUAWEI, SONY, ZTE");
//            String kek = in.nextLine();
        }

        else if (type.equals("tablet")) {
            System.out.print("Please select the manufacturer of the device you want to purchase(APPLE, SAMSUNG, LENOVO, HUAWEI, SONY, ZTE");
//            String name = in.nextLine();
        }
        else if (type.equals("laptop")){
            System.out.print("Please select the manufacturer of the device you want to purchase(APPLE, SAMSUNG, LENOVO, HUAWEI, SONY, ZTE");
//            String name = in.nextLine();
        }
        else if (type.equals("player")) {
            System.out.print("Please select the manufacturer of the device you want to purchase(APPLE, SAMSUNG, LENOVO, HUAWEI, SONY, ZTE");
//            String name = in.nextLine();
        }
        else
            System.out.print("ничего");
        System.out.println("Ваш заказ: тип: " + type + "   производитель: " /*+ name */);
        // потом все это дело будет заноситься в базу данных
    }
}