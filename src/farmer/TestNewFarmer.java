/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package farmer;

/**
 *
 * @author Jack
 */
public class TestNewFarmer {
    public static void main(String[] args) {
        Farmer farmer1 = new Farmer("Kamau");
        Farmer farmer2 = new Farmer("Omolo");
        Farmer farmer3 = new Farmer("Hassan");
        farmer1.addFarmerId("kba", 1);
        farmer2.addFarmerId("kbb", 2);
        farmer3.addFarmerId("kbc", 3);
        
        System.out.println("All Farmers");
//        farmer1.PrintNumber();
        farmer2.PrintNumber();
        farmer3.PrintNumber();
        System.out.println("\n");
        
        System.out.println("New Farmer");
        NewFarmer newfarmer1 = new NewFarmer(new Farmer("Njoho"), "kbd", 4);
        System.out.println(newfarmer1);
        System.out.println("\n");
        
        System.out.println("Removed Farmer");
        farmer3.PrintNumber();
        System.out.println("\n");
        
        System.out.println("New List of Farmers");
        farmer1.PrintNumber();
        farmer2.PrintNumber();
        NewFarmer newfarmer2 = new NewFarmer( new Farmer("Njoho"), "kbd", 3);
        System.out.println(newfarmer2);
        
        // TODO code application logic here
    }
    
}
