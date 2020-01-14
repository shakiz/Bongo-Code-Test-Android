package alternate_solution;

public class GetVehicle {
    public Vehicle getVehicle(String vehicleType){
        if (vehicleType.equals("Car")) {
            return new Car();
        }
        else if (vehicleType.equals("Plane")) {
            return new Plane();
        }
        return null;
    }
}
