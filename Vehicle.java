package parking_lot_management;

public class Vehicle {
    private String vehicleNumber;
    private String vehicleOwner;
    private String vehicleType;

    public Vehicle(String vehicleNumber,String vehicleOwner,String vehicleType){
        this.vehicleNumber=vehicleNumber;
        this.vehicleOwner=vehicleOwner;
        this.vehicleType=vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getVehicleOwner() {
        return vehicleOwner;
    }

    public String getVehicleType(){
        return vehicleType;
    }

}
