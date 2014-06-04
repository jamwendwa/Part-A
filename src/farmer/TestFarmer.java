/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package farmer;

/**
 *
 * @author Jack
 */
public class TestFarmer {
    public static void main(String[] args) {
        Farmer farmer1 = new Farmer("Kamau");
        Farmer farmer2 = new Farmer("Omolo");
        Farmer farmer3 = new Farmer("Hassan");
        farmer1.addFarmerId("kba", 1);
        farmer2.addFarmerId("kbb", 2);
        farmer3.addFarmerId("kbc", 3);
        farmer1.PrintNumber();
        farmer2.PrintNumber();
        farmer3.PrintNumber();
        // TODO code application logic here
    }
    
}
