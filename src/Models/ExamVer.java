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
public class ExamVer {
    private String ExamType;
    private String ExamHall;
    private String ExamTime;
    private String ExamDate;
    private String ExamId;

    public String getExamId() {
        return ExamId;
    }

    public void setExamId(String ExamId) {
        this.ExamId = ExamId;
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
}
