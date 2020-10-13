public class ExtendsVehicleDemo {
    public static void main(String[] args){
        Auto bmw = new Auto();
        bmw.sunroof = true;
        System.out.println("Way, which user gone for 1.5 hour: " + bmw.distance(1.5) + "km.");
        System.out.println("Max speed: " + bmw.getMaxspeed() + "km\\h" );
        System.out.println("Sunroof is present: " + bmw.sunroof);
    }
}
