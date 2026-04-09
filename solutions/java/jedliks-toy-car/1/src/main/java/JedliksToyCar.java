public class JedliksToyCar {
    int distanceDriven =0;
    int currentBattery = 100;
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven "+distanceDriven+" meters";
    }

    public String batteryDisplay() {
        if(currentBattery==0) 
            return "Battery empty";
        return "Battery at "+currentBattery+"%";
    }

    public void drive() {
        if (currentBattery>0){
        distanceDriven += 20;
        currentBattery -= 1;
        }
    }
}
