/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleobjects;

/**
 *
 * @author hassan
 */
public class Address {
    
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String addressLine4;
    private String postcode;
    
    public Address(String address1, String address2, String address3,String address4,String postcode){
        this.addressLine1 = address1;
        this.addressLine2 = address2;
        this.addressLine3 = address3;
        this.addressLine4 = address4;
        this.postcode = postcode;
    }
    public Address(String address1, String address2, String address3,String postcode){
        this.addressLine1 = address1;
        this.addressLine2 = address2;
        this.addressLine3 = address3;
        this.addressLine4 = "";
        this.postcode = postcode;
    }
    public Address(String address1, String address2, String postcode){
        this.addressLine1 = address1;
        this.addressLine2 = address2;
        this.addressLine3 = "";
        this.addressLine4 = "";
        this.postcode = postcode;
    }
    
    public String getLine1(){
        return this.addressLine1;
    }
    
    public String getLine2(){
        return this.addressLine2;
    }
    
    public String getLine3(){
        return this.addressLine3;
    }
    
    public String getLine4(){
        return this.addressLine4;
    }
    
    public String getPostcode(){
        return this.postcode;
    }
    
    public String toString(){
        String fullAddress = "";
        if(this.addressLine1!=""){
            fullAddress = this.addressLine1;
        }
        if(this.addressLine2!=""){
            fullAddress=fullAddress+"\n"+this.addressLine2;
        }
        if(this.addressLine3!=""){
            fullAddress=fullAddress+"\n"+this.addressLine3;
        }
        if(this.addressLine4!=""){
            fullAddress=fullAddress+"\n"+this.addressLine4;
        }
        if(this.postcode!=""){
            fullAddress=fullAddress+"\n"+this.postcode+"\n";
        }
        return fullAddress;
    }
    
    public boolean equals(Object o){
        if(o instanceof Address){
            Address other = (Address)o;
            return this.addressLine1.equals(other.addressLine1) && 
            this.addressLine2.equals(other.addressLine2) && 
            this.addressLine3.equals(other.addressLine3) && 
            this.addressLine4.equals(other.addressLine4) && 
            this.postcode.equals(other.postcode);

        }else{
            return false;
        }
    }
    
}
