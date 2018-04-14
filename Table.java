import java.util.*;

import javafx.application.Application;
import javafx.stage.Stage;

public class Table extends Application {


    private List<String> manuf = new ArrayList<String>();
    private List<String> manuf2 = new ArrayList<String>();
    private List<String> model = new ArrayList<String>();
    private List<String> checkNameModel = new ArrayList<String>();
    private List<String> colour = new ArrayList<String>();
    private List<String> type = new ArrayList<String>();
    private List<Integer> id = new ArrayList<Integer>();
    private List<Integer> price = new ArrayList<Integer>();


    private String menu = "Menu. Choose what do you want to do:" + "\n" +
            "1. Add devices" + "\n" +
            "2. Add clients" + "\n" +
            "3. Show devices DB" + "\n" +
            "4. Show clients DB" + "\n" +
            "5. Search devices by manufacturer" + "\n" +
            "6. Search devices by index" + "\n" +
            "7. Exit";

    private String student_id;


    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null)
            return false;
        if (!(getClass() == obj.getClass()))
            return false;
        else {
            Table tmp = (Table) obj;
            if (tmp.student_id == this.student_id)
                return true;
            else
                return false;
        }
    }


    @Override
    public void start(Stage primaryStage) {


        Scanner in = new Scanner(System.in);


        String choice;
        do {
            System.out.println(menu);
            choice = in.nextLine();
            switch (choice) {
                case "1":
                    System.out.print("Please write down the number of the devices you want to add to the table: ");
                    int numberOfDevices = in.nextInt();

                    for (int i = 0; i < numberOfDevices; i++) {

                        System.out.print("Please write down the manufacturer of the device you want to add to the table: ");
                        String selectedManuf = in.nextLine();
                        String selectedManuf2 = in.nextLine();
                        manuf.add(i, selectedManuf);
                        manuf2.add(i, selectedManuf2);
                        // не знаю почему эта часть просто скипается с одним in.nextLine

                        System.out.print("Please write down the model of the device you want to add to the table: ");
                        String selectedModel = in.nextLine();
                        model.add(i, selectedModel);

                        System.out.print("Please write down the colour of the device you want to add to the table: ");
                        String selectedColour = in.nextLine();
                        colour.add(i, selectedColour);

                        int a = (int) (Math.random() * 600);
                        id.add(a);

                        System.out.print("Please write down the type of the device you want to add to the table: ");
                        String selectedType = in.nextLine();
                        type.add(i, selectedType);

                        System.out.print("Please write down the price of the device you want to add to the table: ");
                        Integer selectedPrice = in.nextInt();
                        price.add(i, selectedPrice);
                    }
                    break;
                case "2":
                    System.out.println(model.getClass().getName() + "<" + model.get(0).getClass().getName() + ">");
                    break;
                case "3":
                    for (int i = 0; i < model.size(); i++) {
                        System.out.print("Manufacturer:");
                        System.out.println(manuf2.get(i));
                        System.out.print("Model:");
                        System.out.println(model.get(i));
                        System.out.print("Colour:");
                        System.out.println(colour.get(i));
                        System.out.print("Type:");
                        System.out.println(type.get(i));
                        System.out.print("id:");
                        System.out.println(id.get(i));
                        System.out.print("Price:");
                        System.out.println(price.get(i));
                    }
                    break;
                case "4":
                    break;
                case "5":
                    System.out.print("Please write down the name of model of the devices you want to see:");
                    String nameModel = in.nextLine();
                    checkNameModel.add(nameModel);
                    for (int i = 0; i < model.size(); i++) {
                        if (checkNameModel.equals(model.get(i))) {
                            System.out.print("Manufacturer:");
                            System.out.println(manuf2.get(i));
                            System.out.print("Model:");
                            System.out.println(model.get(i));
                            System.out.print("Colour:");
                            System.out.println(colour.get(i));
                            System.out.print("Type:");
                            System.out.println(type.get(i));
                            System.out.print("id:");
                            System.out.println(id.get(i));
                            System.out.print("Price:");
                            System.out.println(price.get(i));
                            i = 0;
                        } else {
                            System.out.println("There are no devices of this manufacturer");
                        }
                    }

                    break;
                case "6":
                    System.out.print("Please write down the index of the device you want to to see features: ");
                    int indexOfDeviceToShow = in.nextInt();

                    System.out.print("Manufacturer:");
                    System.out.println(manuf2.get(indexOfDeviceToShow - 1));
                    System.out.print("Model:");
                    System.out.println(model.get(indexOfDeviceToShow - 1));
                    System.out.print("Colour:");
                    System.out.println(colour.get(indexOfDeviceToShow - 1));
                    System.out.print("Type:");
                    System.out.println(type.get(indexOfDeviceToShow - 1));
                    System.out.print("id:");
                    System.out.println(id.get(indexOfDeviceToShow - 1));
                    System.out.print("Price:");
                    System.out.println(price.get(indexOfDeviceToShow - 1));
                    break;
                case "7":
                    System.exit(0);
                    break;
            }

        } while (!choice.equals("0"));


    }

    public static void main(String[] args) {
        launch(args);
    }

}