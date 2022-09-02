/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author erand
 */
public class SendAnnouncement {
    
    private String Subject;
    private String Message;
    private String Email;
    private String Receivers;

    public String getReceivers() {
        return Receivers;
    }

    public void setReceivers(String Receivers) {
        this.Receivers = Receivers;
    }
    
    

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
  
}
