/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author sange
 */
public class AddStaff {
    private String staffName;
    private String staffAddress;
    private int staffContact;
    private String staffEmail;
    private String staffNic;
    private String staffType;
    private String staffGrade;
    private String staffSub;
    private int staffID;

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }
    
    

    public void setStaffType(String staffType) {
        this.staffType = staffType;
    }

    public void setStaffGrade(String staffGrade) {
        this.staffGrade = staffGrade;
    }

    public void setStaffSub(String staffSub) {
        this.staffSub = staffSub;
    }

    
    public String getStaffType() {
        return staffType;
    }

    public String getStaffGrade() {
        return staffGrade;
    }

    public String getStaffSub() {
        return staffSub;
    }


    public String getStaffName() {
        return staffName;
    }

    public String getStaffAddress() {
        return staffAddress;
    }

    public int getStaffContact() {
        return staffContact;
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public String getStaffNic() {
        return staffNic;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public void setStaffAddress(String staffAddress) {
        this.staffAddress = staffAddress;
    }

    public void setStaffContact(int staffContact) {
        this.staffContact = staffContact;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }

    public void setStaffNic(String staffNic) {
        this.staffNic = staffNic;
    }


    
    
    
    
}
