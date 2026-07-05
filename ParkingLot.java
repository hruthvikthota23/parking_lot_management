package parking_lot_management;

import java.time.LocalDateTime;
import java.util.*;

public class ParkingLot {
    private ArrayList<ParkingSlot> slots;
    private HashMap<Integer,Ticket> tickets;
    private int ticketNumber=100;

    public ParkingLot(int capacity) {
        slots=new  ArrayList<>();
        tickets=new HashMap<>();

        for(int i=1;i<=capacity;i++){
            slots.add(new ParkingSlot(i));
        }
    }

    private void receipt(int ticketNumber,int slotNumber,String vehicleNumber,String ownerName,String vehicleType,LocalDateTime entryTime){
        System.out.println("\n=== PARKING RECEIPT ===");
        System.out.println("Ticket ID : "+ticketNumber);
        System.out.println("Slot NO : "+slotNumber);
        System.out.println("Vehicle NO : "+vehicleNumber);
        System.out.println("Owner Name : "+ownerName);
        System.out.println("Vehicle Type : "+vehicleType);
        System.out.println("Entry Time: "+entryTime);
    }

    public void parkVehicle(Vehicle vehicle){
        for(ParkingSlot slot:slots){
            if(slot.isAvailable()){
                slot.parkVehicle(vehicle);
                Ticket ticket=new Ticket(ticketNumber++,vehicle.getVehicleNumber());
                tickets.put(ticket.getTicketID(), ticket);
                receipt(ticketNumber, slot.getSlotNumber(),vehicle.getVehicleNumber(),vehicle.getVehicleOwner(),vehicle.getVehicleType(),LocalDateTime.now());
                System.out.println("Vehicle Parked Successfully!!");
                return;
            }
        }
        System.out.println("\nPARKING LOT FULL!!");
    }
    
    public void removeVehicle(String vehicleNumber){
        for(ParkingSlot slot:slots){
            Vehicle vehicle=slot.getVehicle();
            if(vehicle!=null && vehicle.getVehicleNumber().equals(vehicleNumber)){
                slot.removeVehicle();
                receipt(ticketNumber, slot.getSlotNumber(),vehicle.getVehicleNumber(),vehicle.getVehicleOwner(),vehicle.getVehicleType(),LocalDateTime.now());
                System.out.println("Vehicle Removed Successfully!!");
                return;
            }
        }
        System.out.println("\nVEHICLE NOT FOUND!!");
    }

    public void displaySlots(){
        System.out.println("\n=== PARKING AVAILABLILIY ===");
        for(ParkingSlot slot:slots){
            if(slot.isAvailable()){
                System.out.println("Slot "+slot.getSlotNumber()+" is Empty!");
            }
            else{
                System.out.println("Slot "+slot.getSlotNumber()+" is Filled : "+slot.getVehicle().getVehicleNumber());
            }
        }
    }
}
