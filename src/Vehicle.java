public class Vehicle {
    int   passengers;
    private int wheels;
    private int maxspeed;
    int burnup;
    Vehicle()
    {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup = 13;
    }

    double distance(double interval){
        double val= this.maxspeed * interval;
        return val;
    }

    int getMaxspeed(){
        return this.maxspeed;
    }

    int getWheels(){
        return  this.wheels;
    }
    void setWheels (int wheels){
        if ((wheels < 1) || (wheels > 24)){
            System.out.println("Wrong set the number of wheels.");
        }
        this.wheels = wheels;
    }
}

