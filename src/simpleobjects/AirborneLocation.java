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
public class AirborneLocation extends Location{
    
    private double altitude;
    
    public AirborneLocation(String name, double latitude, double longitude, double altitude){
        super(name, latitude, longitude);
        this.altitude = altitude;
    }
    
    public double getAltitude(){
        return this.altitude;
    }
    
    public String toString(){
        return this.getName()+" ("+this.getLatitude()+", "+this.getLongitude()+") at "+this.altitude;
    }
    
    public boolean equals(Object o){
        if (o instanceof AirborneLocation){
            AirborneLocation other = (AirborneLocation)o;
            return this.getName().equals(other.getName()) && this.getLatitude() == other.getLatitude() && this.getLongitude() == other.getLongitude() && this.altitude == other.altitude;
        }else{
            return false;
        }
    }
}
