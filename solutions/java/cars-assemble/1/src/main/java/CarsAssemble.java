public class CarsAssemble {
    private static final double Production_cars = 221;
    public double productionRatePerHour(int speed) {
        double successRate = 1.0;
        if (speed > 0 && speed <= 4) {
            successRate = 1.0; 
        } else if (speed >= 5 && speed <= 8) {
            successRate = 0.9;
        } else if (speed == 9) {
            successRate = 0.8;
        } else if (speed == 10) {
            successRate = 0.77;
        }

        return Production_cars*speed*successRate;
        
    }

    public int workingItemsPerMinute(int speed) {

        double wipm = Production_cars*speed/60;
        if( speed>0 && speed <=4){
           return (int)wipm; 
        }
        else if(speed>4 && speed<=8){
            return (int)(0.9*wipm); 
        }
        else if(speed == 9 ){
            return (int)(0.8* wipm);
        }
        else if(speed == 10 ){
            return (int)(0.77* wipm);
        }
        else{
            return 0;
        }
    }
}
