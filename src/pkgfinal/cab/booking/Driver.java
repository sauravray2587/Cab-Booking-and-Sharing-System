/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.cab.booking;

/**
 *
 * @author saurav
 */
class Driver {
    private String Name,MN,ADD,LN,ID;
    Driver(String string, String string0, String string1, String string2, String string3) {
    this.Name=string;
    this.MN=string0;
    this.ADD=string1;
    this.LN=string2;
    this.ID=string3;
    
    }
    
    public String getName()
    {
        return Name;
    }
    
     public String getMN()
    {
        return MN;
    }
      public String getADD()
    {
        return ADD;
    }
     public String getLN()
    {
        return LN;
    }
      public String getID()
    {
        return ID;
    }
      
}