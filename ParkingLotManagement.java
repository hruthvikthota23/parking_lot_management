package parking_lot_management;

import java.util.Scanner;

public class ParkingLotManagement {
    public static void main(String[] args) {  

        Scanner sc=new Scanner(System.in);
        System.out.println("=*= Welcome To SN Mall =*=");
        ParkingLot lot=new ParkingLot(8);
        
        boolean menu=true;
        while(menu){
            System.out.println("\n=== PARKING LOT MENU ===");
            System.out.println("1.Bike Parking");
            System.out.println("2.Car Parking");
            System.out.println("3.Remove Vehicle");
            System.out.println("4.Display Slots");
            System.out.println("5.Exit");

            System.out.println("Enter Your Choice :");
            int choice=sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.println("Enter Bike Number :");
                    String bikeNum=sc.nextLine();
                    System.out.println("Enter Bike Owner Name :");
                    String bikeOwn=sc.nextLine();
                    Vehicle bike=new Bike(bikeNum, bikeOwn);
                    lot.parkVehicle(bike);
                    break;
                case 2:
                    System.out.println("Enter Car Number :");
                    String carNum=sc.nextLine();
                    System.out.println("Enter Car Owner Name :");
                    String carOwn=sc.nextLine();
                    Vehicle car=new Car(carNum, carOwn);
                    lot.parkVehicle(car);
                    break;
                case 3:
                    System.out.println("Enter Vehicle Number :");
                    String vehNum=sc.nextLine();
                    lot.removeVehicle(vehNum);
                    break;
                case 4:
                    lot.displaySlots();
                    break;
                case 5:
                    System.out.println("\nTHANK YOU!!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("\nInvaild Choice \n TRY AGAIN");;
            }
            System.out.println("\nContinue Parking (yes/no)");
            if("no".equals(sc.nextLine())){
                menu=false;
            }
        }
    }
}
