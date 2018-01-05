
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    //instance variable to store beeper count
    int[] beeperList = new int[13];
    int tempCount = 0;
    
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    int x=0;
    
    public void findAndCountBeepers() {
        for(int i=0; (i < 10); i++){
            pickUpBeeper();
        }
    }
    public void pickUpBeeper(){
        while(frontIsClear()){
            while(!nextToABeeper()){
            move();
           }
            if (nextToABeeper()){
            turnLeft();
           }
            while(nextToABeeper()){
            pickBeeper();
            x++;
            move();
           }
           turnLeft();
           turnLeft();
           while(frontIsClear()){
            move();
           }
           turnLeft();
    }
    }
    public int[] getBeeperList() {
        int[] BeeperList;
        BeeperList = new int[x];
        //This will be used to print the beepers found.  No need to modify.
            for(int index=0 ; index <BeeperList.length; index++){
             System.out.print(BeeperList[index]);
            }
        return BeeperList; 
    }
}
