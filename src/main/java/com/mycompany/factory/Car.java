
package com.mycompany.factory;


public class Car {
    
    private String model;
    private int buildYear;
    private String color = "undefined";
    private int maxSpeed;
    private int ccm;
    private int consumption;
      
    
    public String getModel() {
        return this.model;
    }  
      
    public void Setmodel (String customModel) {
        this.model = customModel;
    }
            
    public int getBuildYear() {
        return this.buildYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCcm() {
        return ccm;
    }

    public void setCcm(int ccm) {
        this.ccm = ccm;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }
            
    public void setBuildYear (int customBuildYear) {
        this.buildYear = customBuildYear;
    } 
    
    public void printAttributes() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Godna prizvodnje: " + this.getBuildYear());
        System.out.println("Kubikaza: " + this.getCcm());
        System.out.println("Boja: " + this.getColor());        
        System.out.println("Potrosnja: " + this.getConsumption());
        System.out.println();
    }
    
    
}
