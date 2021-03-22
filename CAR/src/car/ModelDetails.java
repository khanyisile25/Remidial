/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author makhanyi
 */
public class ModelDetails {
private String DriverType;
private int numOfDoors;
private String driverTrain;

public ModelDetails(String DriverType, int numOfDoors, String driverTrain){
this.DriverType=DriverType;
this.numOfDoors=numOfDoors;
this.driverTrain=driverTrain;
}
public String getDriverType(){
    return DriverType;
}
public void setDriverType(String DriverType){
    }
public int getnumOfDoors(){
    return numOfDoors;
}
public void setnumOfDoors(int numOfDoors){
}
public String getdriverTrain(){
    return driverTrain;
}
public void setdriverTrain(int driverTrain){
    
}
}
