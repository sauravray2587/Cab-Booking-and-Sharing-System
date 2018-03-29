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
class Company {
    private String Name,MN,EID,ADD,LN,ID;
    Company(String string, String string0, String string1, String string2, String string3, String string4) {
    this.Name=string;
    this.MN=string0;
    this.EID=string1;
    this.ADD=string2;
    this.LN=string3;
    this.ID=string4;
    
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
      public String getEID()
      {
          return EID;
      }
      
}