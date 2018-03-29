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
class Booking {
    private String Date, Pick, Drop, UserID, BookingID;
    Booking(String string, String string0, String string1, String string2, String string3) {
    this.Date=string;
    this.Pick=string0;
    this.Drop=string1;
    this.UserID=string2;
    this.BookingID=string3;
    
    }
    
    public String getDate()
    {
        return Date;
    }
    
     public String getPick()
    {
        return Pick;
    }
      public String getDrop()
    {
        return Drop;
    }
     public String getUserID()
    {
        return UserID;
    }
      public String getBookingID()
    {
        return BookingID;
    }
      
}