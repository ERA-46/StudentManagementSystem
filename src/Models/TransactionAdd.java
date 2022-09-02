/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author lahir
 */
public class TransactionAdd {
    private String StuId;
    private String StudentName;
    private String PaidMonth;
    private String Amount;
    private String Grade;
    private String StudentSubject;
    private String Description;
    private String Email;
    private String ReciptId;

    public String getReciptId() {
        return ReciptId;
    }

    public void setReciptId(String ReciptId) {
        this.ReciptId = ReciptId;
    }
    
    public String getStuId() {
        return StuId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setPaidMonth(String PaidMonth) {
        this.PaidMonth = PaidMonth;
    }

    public String getPaidMonth() {
        return PaidMonth;
    }

    

    public String getAmount() {
        return Amount;
    }

    public String getGrade() {
        return Grade;
    }

    public String getStudentSubject() {
        return StudentSubject;
    }

    public String getDescription() {
        return Description;
    }

    public String getEmail() {
        return Email;
    }

    public void setStuId(String StuId) {
        this.StuId = StuId;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    
    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    public void setStudentSubject(String StudentSubject) {
        this.StudentSubject = StudentSubject;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    
    
}
