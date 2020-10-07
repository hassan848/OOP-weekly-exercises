/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleobjects;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author hassan
 */
public class SimpleObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Address a1 = new Address("103 Borough Road", "London", "SE1 0AA");
        System.out.println(a1);
        Address a2 = new Address("Neptune Way","Trident Business Park","Leeds Road","Huddersfield","HD2 1UA");
        System.out.println(a2);
        Address a3 = new Address("96 Cowley Road","Ilford","Essex","London","IG1 3JJ");
        System.out.println(a3);
        
        PhoneNumber p1 = new PhoneNumber("work", "02078157483");
        System.out.println(p1);
        
        Contact c1 = new Contact("Hassan", "Aslam");
        c1.setAddress(a3);
        System.out.println(c1);
        
        PhoneNumber p2 = new PhoneNumber("work", "07808144881");
        PhoneNumber p3 = new PhoneNumber("home", "07808133771");
        
        c1.addPhoneNumber(p2);
        c1.addPhoneNumber(p3);
        System.out.println(c1);
        
        Address a4 = new Address( "103 Borough Road", "London", "SE1 0AA");
        if (a1.equals(a4)) {
            System.out.println( "Addresses are equal.");
         } else {
            System.out.println( "Addresses are not equal.");
         }
        
        PhoneNumber p4 = new PhoneNumber("home", "07808133771");
        if (p3.equals(p4)) {
            System.out.println( "Phone numbers are equal.");
         } else {
            System.out.println( "Phone numbers are not equal.");
         }
        
        Contact c2 = new Contact("Hassan", "Aslam");
        c2.setAddress(a3);
        c2.addPhoneNumber(p2);
        c2.addPhoneNumber(p3);
        if (c1.equals(c2)) {
            System.out.println( "Contacts are equal.");
         } else {
            System.out.println( "Contacts are not equal.");
         }
        
        Location l1 = new Location("London", 51.528308, -0.3817765);
        Location l2 = new Location("Paris", 48.8587741, 2.2069771);
        Location l3 = new Location("Paris", 48.8587741, 2.2069771);
        Location l4 = l1;
        Location l5 = l2;
        Location l6 = l5;
        
        System.out.println();
        
        System.out.println(l1.equals(l2));
        System.out.println(l1.equals(l4));
        System.out.println(l2.equals(l6));
        System.out.println(l2.equals(l3));

        //System.out.println(l1);
        System.out.println();
        
        Set<Object> set = new HashSet<>();
        set.add(l1);
        set.add(l2);
        set.add(l3);
          
        AirborneLocation aL1 = new AirborneLocation("New York", 40.6976701, -74.2598637, 900);
        set.add(aL1);
        
        Location l7 = new Location("New York", 40.6976701, -74.2598637);
        set.add(l7);
          
        for(Object loc : set) {
            System.out.println(loc);
        }
        System.out.println();
        
        System.out.println(l7.equals(aL1));
        
    }
    
}
