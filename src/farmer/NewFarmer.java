/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package farmer;

import static farmer.Farmer.MAX_NUMBER;

/**
 *
 * @author Jack
 */
public class NewFarmer {
    //private String dat;
    private Farmer farmer;
    private String id;
    private int number;
    private int numFarmer;
    public static final int MAX_NUMBER=30;
    
    public NewFarmer(Farmer farmer, String id, int number){
        //this.dat=dat;
        this.farmer=farmer;
        this.id=id;
        this.number=number;
        numFarmer=0;        
}
    public NewFarmer(Farmer farmer, String id, int number, int numFarmer){
        //this.dat=dat;
        this.farmer=farmer;
        this.numFarmer=numFarmer;
        this.id = id;
        this.number = number;        
}
    //public String getDate(){
        //return dat;
    //}
    public Farmer getFarmer(){
        return farmer;
    }
    public String toString(){
        return farmer + " " + id + ":" + number ;
    }
    
}
