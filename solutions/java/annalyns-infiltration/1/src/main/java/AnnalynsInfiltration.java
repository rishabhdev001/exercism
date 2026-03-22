class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        if(!knightIsAwake){
            return true;
        }
        else{
            return false;
        }
        
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {

        if((knightIsAwake || archerIsAwake) || (archerIsAwake || prisonerIsAwake) || (prisonerIsAwake || knightIsAwake))
        {
            return true;
        }
        else{
            return false;
        }
    
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {

        if(archerIsAwake){
            return false;
        }
        else if(prisonerIsAwake){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if((petDogIsPresent && !archerIsAwake) || (!petDogIsPresent && (prisonerIsAwake && (!knightIsAwake && !archerIsAwake)))){
            return true;
        }
        else{
            return false;
        }
        
    }
}
