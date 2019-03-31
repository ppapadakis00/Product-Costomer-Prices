/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ergasia5_7;
import java.util.*;
/**
 *
 * @author ppapa
 */
public class Ergasia5_7 {
    public static int p,tm,pl,o;
    public static String Pnam,cnam,cbill,cadre,a;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Give the name of the Customer:  ");
        cnam = in.nextLine();
        System.out.println("Give the name of the  product");
        Pnam = in.nextLine();
        Product p1 = new Product();
        p1.Pname = Pnam;
        System.out.println("Give the ammount of the  "+p1.Pname);
        p = in.nextInt();
         System.out.println("Give the price of the  "+p1.Pname);
        tm = in.nextInt();
         System.out.println("Give the ammount of the money that the customer can give: ");
        pl = in.nextInt();
        timologia t = new timologia(p,tm,pl,0);
        a=in.nextLine();
        System.out.println("Give the billing Address of the "+cnam+": ");
        cbill = in.nextLine();
        System.out.println("Give the address of the Customer:  ");
        cadre = in.nextLine();
        Customer c = new Customer();
        c.Address = cadre;
        c.billaddress = cbill;
        c.name = cnam;
        o = (t.timh*t.posothtes)-t.plhrwmh;
        
        System.out.println("Ta "+t.posothtes+" "+p1.Pname+" Stalthkan sthn dieuthunsh: "+ c.Address+" tou pelath me to onoma "+ c.name);
        System.out.println("\n\nAmmount: "+t.posothtes+",Total Price: "+t.timh*t.posothtes+",Customer Money: "+t.plhrwmh+",Amounts Still Due: "+o+" Sended at : "+ c.billaddress);
        
        
       
    }
    
}
