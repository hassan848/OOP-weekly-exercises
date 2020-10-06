/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleobjects;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hassan
 */
public class Contact {
    private String firstName;
    private String lastName;
    Address address;
    
    private List<PhoneNumber>phoneNumbers;
    
    public Contact(String firstN, String lastN){
        this.firstName = firstN;
        this.lastName = lastN;
        this.phoneNumbers = new ArrayList<PhoneNumber>();
    }
    
    public void setAddress(Address address){
        this.address = address;
    }
    
    public String toString(){
        String s = this.firstName+" "+this.lastName+"\n"+this.address.toString();
        for(int i=0;i<this.phoneNumbers.size();i++){
            s = s+this.phoneNumbers.get(i)+"\n";
        }
        return s;
    }
    
    public void addPhoneNumber(PhoneNumber number){
        this.phoneNumbers.add(number);
        
    }
    
    public boolean equals(Object o){
        if(o instanceof Contact){
            Contact other = (Contact)o;
            return this.firstName.equals(other.firstName) && this.lastName.equals(other.lastName)&&this.phoneNumbers.equals(other.phoneNumbers)&&this.address.equals(other.address);
        }else{
            return false;
        }
    }
}
