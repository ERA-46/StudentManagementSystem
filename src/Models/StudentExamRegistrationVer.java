/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author D3SMOZIO
 */
public class StudentExamRegistrationVer {
    private String ExamRegistrationID;
    private String ExamId;
    private String ExamIndex;
    private String StudentName;
    private String StudentGender;
    private String ExamType;
    private String ExamHall;
    private String ExamTime;
    private String ExamDate;
    private String StudentEmail;
//getters-----------------------------------------------------------------------
    public String getExamRegistrationID() {
        return ExamRegistrationID;
    }

    public String getExamId() {
        return ExamId;
    }

    public String getExamIndex() {
        return ExamIndex;
    }

    public String getStudentName() {
        return StudentName;
    }

    public String getStudentGender() {
        return StudentGender;
    }

    public String getExamType() {
        return ExamType;
    }

    public String getExamHall() {
        return ExamHall;
    }

    public String getExamTime() {
        return ExamTime;
    }

    public String getExamDate() {
        return ExamDate;
    }

    public String getStudentEmail() {
        return StudentEmail;
    }
    
// setters----------------------------------------------------------------------
    public void setExamRegistrationID(String ExamRegistrationID) {
        this.ExamRegistrationID = ExamRegistrationID;
    }

    public void setExamId(String ExamId) {
        this.ExamId = ExamId;
    }

    public void setExamIndex(String ExamIndex) {
        this.ExamIndex = ExamIndex;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public void setStudentGender(String StudentGender) {
        this.StudentGender = StudentGender;
    }

    public void setExamType(String ExamType) {
        this.ExamType = ExamType;
    }

    public void setExamHall(String ExamHall) {
        this.ExamHall = ExamHall;
    }

    public void setExamTime(String ExamTime) {
        this.ExamTime = ExamTime;
    }

    public void setExamDate(String ExamDate) {
        this.ExamDate = ExamDate;
    }

    public void setStudentEmail(String StudentEmail) {
        this.StudentEmail = StudentEmail;
    }   
}
