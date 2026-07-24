class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int fuelUsed=0;
        while(mainTank!=0){
            if(mainTank>=5){
                fuelUsed+=5;
                mainTank-=5;
                if(additionalTank>=1){
                    mainTank++;
                    additionalTank--;
                }
            }
            else{
                fuelUsed+=mainTank;
                mainTank=0;
            }
        }
        return fuelUsed*10;
    }
}