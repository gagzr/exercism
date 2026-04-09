public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        if(speed==0)
            return (double) speed;
        else if(speed>0 && speed<=4)
            return (double) speed*221;
        else if(speed>4 && speed<=8)
            return (double) speed*221*0.9;
        else if(speed==9)
            return (double) speed*221*0.8;
        else if(speed==10)
            return (double) speed*221*0.77;
        return (double) 0;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed)/60;
    }
}
