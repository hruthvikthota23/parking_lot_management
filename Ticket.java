package parking_lot_management;

import java.time.LocalDateTime;

public class Ticket {
    private int ticketID;
    private String vehicleNumber;
    private LocalDateTime entryTime;
    // private LocalDateTime exitTime;

    public Ticket(int ticketID,String vehicleNumber){
         this.ticketID=ticketID;
         this.vehicleNumber=vehicleNumber;
         this.entryTime=LocalDateTime.now();
    }

    public int getTicketID() {
        return ticketID;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    // public double calculateFee(){
    //     exitTime=LocalDateTime.now();
    //     long hours = Duration.between(entryTime, exitTime).toHours();

    //     if(hours == 0) {
    //         hours = 1;
    //     }

    //     return hours * 20;
    // }

}
