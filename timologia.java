/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ergasia5_7;

/**
 *
 * @author ppapa
 */
public class timologia {
    public int posothtes;
    public int timh;
    public int plhrwmh;
    public int ofeli;
    timologia(int p,int t,int pl,int o){
        posothtes = p;
        timh = t;
        plhrwmh = pl;
        ofeli = o;
        
        o = (t*p)-pl;
        ofeli = o;
        
    }
            
    
}
