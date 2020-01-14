package alternate_solution;

public class Plane extends Vehicle{

    @Override
    public int set_num_of_wheels() {
        return 0;
    }

    @Override
    public int set_num_of_passengers() {
        return 0;
    }

    @Override
    public boolean has_gas() {
        return true;
    }
    
}