public class Lasagna {
    // define the 'expectedMinutesInOven()' method
    private int totalTime = 40;
    public int expectedMinutesInOven(){
        return totalTime;
    }
    // define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutesInOven){
        int remainingTime = expectedMinutesInOven()-minutesInOven;
        return remainingTime; 
    }    
    // define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        return layers * 2;
    }
    
    // define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int minutesInOven){
        int total = minutesInOven + preparationTimeInMinutes(layers);
        return total;
    }
}
