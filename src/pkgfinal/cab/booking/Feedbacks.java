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
class Feedbacks {
    private String Feedback,ID,FeedbackReply;
    Feedbacks(String string, String string0,String string1) {
    this.ID=string;
    this.Feedback=string0;
    this.FeedbackReply=string1;
   }

    public String getFeedback()
    {
        return Feedback;
    }
    
     public String getID()
    {
        return ID;
    }
     
     public String getFeedbackReply()
    {
        return FeedbackReply;
    }
    
      
}