
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    int []BeeperList = new int[7];
    public int pickUpABeeper =0;
        
    public void sortBeepers() {
        for(int i=0; (i < 10); i++){
            pickUpBeeper();
        }
    }
    //int pickUpABeeper=0;
    int count= 0;
    public void pickUpBeeper(){
        if (count<10){
            while(!nextToABeeper()){
            move();
           }
            if (nextToABeeper()){
            turnLeft();
           }
            while(nextToABeeper()){
            pickBeeper();
            pickUpABeeper++;
            move();
           }
           count++;
           turnLeft();
           turnLeft();
           while(frontIsClear()){
            move();
           }
           turnLeft();
        }
    }
    public int[] getBeeperList() {
        return BeeperList; 
    }
    public void printBeeperList(){
        System.out.println();
        for(int pickUpABeeper: BeeperList) {
            System.out.print(pickUpABeeper + " , ");
        }
        System.out.println();
    }
}

