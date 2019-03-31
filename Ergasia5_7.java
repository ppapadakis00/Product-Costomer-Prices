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
    public static int p,tm,pl,o,ci,pq;
    public static String Pnam,cnam,cbill,cadre,a,b;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ci=0;
        Scanner in = new Scanner(System.in);
        ArrayList<Customer> cu = new ArrayList<>();
        ArrayList<Product> pu = new ArrayList<>();
        ArrayList<timologia> ti = new ArrayList<>();
        pq = 0;
        do{
            if(pq != 0){
                a=in.nextLine();
            }
            
        System.out.println("Give the name of the Customer:  ");
        cnam = in.nextLine();
        if(ci != 1){
        System.out.println("Give the billing Address of the "+cnam+": ");
        cbill = in.nextLine();
        System.out.println("Give the address of the Customer:  ");
        cadre = in.nextLine();
        System.out.println("Give the name of the  product");
        Pnam = in.nextLine();
        Product p1 = new Product();
        Customer c = new Customer();
        p1.Pname = Pnam;
        System.out.println("Give the ammount of the  "+p1.Pname);
        p = in.nextInt();
         System.out.println("Give the price of the  "+p1.Pname);
        tm = in.nextInt();
         System.out.println("Give the ammount of the money that the customer can give: ");
        pl = in.nextInt();
        o = (tm*p)-pl;
        timologia t = new timologia(p,tm,pl,o);
        a=in.nextLine();
        
        c.Address = cadre;
        c.billaddress = cbill;
        c.name = cnam;
        cu.add(c);
        pu.add(p1);
        ti.add(t);
        System.out.println("If you Want to Continue press 0 else 1: ");
        ci = in.nextInt();
        
        System.out.println("Ta "+ti.get(pq).posothtes+" "+pu.get(pq).Pname+" Stalthkan sthn dieuthunsh: "+ cu.get(pq).Address+" tou pelath me to onoma "+ cu.get(pq).name);
        System.out.println("\n\nAmmount: "+ti.get(pq).posothtes+",Total Price: "+ti.get(pq).timh*ti.get(pq).posothtes+",Customer Money: "+ti.get(pq).plhrwmh+",Amounts Still Due: "+ti.get(pq).ofeli+" Sended at : "+ cu.get(pq).billaddress); 
        System.out.println("\n\n\n");     
        pq +=1;
        }
        }while(ci != 1);
    }
    
}
