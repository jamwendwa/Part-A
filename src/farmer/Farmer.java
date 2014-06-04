/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package farmer;

/**
 *
 * @author Jack
 */
public class Farmer {
    private String name;
    private String id[];
    private int number[];
    private int numFarmer;
    public static final int MAX_NUMBER=30; 
    
    public Farmer(String name){
        this.name=name;
        id = new String[MAX_NUMBER];
        number = new int[MAX_NUMBER];
        numFarmer=0;        
}
    public String getName(){
        return name;
    }
    /*public void setid(String[] id){
        this.id=id;
    }*/
    public String toString(){
        return name;
    }
    public void addFarmerId(String ids, int numbers){
        id[numFarmer] = ids;
        number[numFarmer] = numbers;
        ++numFarmer;
    }
    public void PrintNumber(){
        System.out.print(this);
        for (int i=0; i<numFarmer; i++){
            System.out.print("  " + id[i] + ":" + number[i]);
        }
        System.out.println();
    }
    

    /**
     * @param args the command line arguments
     */
    
}
