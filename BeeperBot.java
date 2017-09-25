
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
    public int[] getBeeperList() {
            //This will be used to print the beepers found.  No need to modify.
            for(int i, index <arraygerBeeperList.length; index++)
            
            
            return beeperList;
    }
    
}

