/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseLayer;

import Models.AddStudent;
import Models.AdminUser;
import Models.*;
import Frontend.*;
import Frontend.Student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sange
 */
//Sangeeth
public class DBUserConnection {

    public int checkUser(AdminUser user1) {

        DBConnection con = new DBConnection();
        int retVal = -1;

        String sql = "SELECT * FROM AdminUser WHERE UserName=? AND Password=?;";

        try {
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);
            prep.setString(1, user1.getUserName());// set values
            prep.setString(2, user1.getPassword());// set values

            ResultSet rs = prep.executeQuery();
            while (rs.next()) {
                retVal = 1;// if user is there
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return retVal;
    }

    public void AddUser(AdminUser User) {
        DBConnection con = new DBConnection();
        String sql = "INSERT INTO AdminUser(Name,UserName,Password,SecurityQ,Answer,UserType)" + "values(?,?,?,?,?,?)";
        try {
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);

            prep.setString(1, User.getName());
            prep.setString(2, User.getUserName());
            prep.setString(3, User.getPassword());
            prep.setString(4, User.getSecurityQuestion());
            prep.setString(5, User.getAnswer());
            prep.setString(6, User.getType());

            int a = prep.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

    }

    //Sangeeth Nawarathna
    public void AddStud(AddStudent Stud) {

        DBConnection con = new DBConnection();

        String sql = "INSERT INTO Student(Student_ID,Name,Address,Contact,Email,Birthday,Guardian,Occupation,gender,Grade,Class,Course) "
                + " Values(?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);
            // set values
            prep.setString(1, Stud.getStudentID());
            prep.setString(2, Stud.getStudName());
            prep.setString(3, Stud.getStudAddress());
            prep.setInt(4, Stud.getStudContact());
            prep.setString(5, Stud.getStudEmail());
            prep.setString(6, Stud.getStudBday());
            prep.setString(7, Stud.getStudGuardian());
            prep.setString(8, Stud.getStudOccupation());
            prep.setString(9, Stud.getStudGender());
            prep.setString(10, Stud.getStudGrade());
            prep.setString(11, Stud.getStudClass());
            prep.setString(12, Stud.getStudCourse());

            int a = prep.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public void updateStud(AddStudent Student) {
        DBConnection con = new DBConnection();
        try {

            String id = Student.getStudentID();
            String name = Student.getStudName();
            String address = Student.getStudAddress();
            int contact = Student.getStudContact();
            String email = Student.getStudEmail();
            String bday = Student.getStudBday();
            String guardian = Student.getStudGuardian();
            String occupation = Student.getStudOccupation();
            String gender = Student.getStudGender();
            String grade = Student.getStudGrade();
            String clz = Student.getStudClass();
            String course = Student.getStudCourse();

            String sql = "UPDATE Student SET Name='" + name + "', Address='" + address + "', Contact='" + contact + "', Email='" + email + "', Birthday='" + bday + "', Guardian='" + guardian + "', Occupation='" + occupation + "',"
                    + "Gender='" + gender + "', Grade='" + grade + "',Class='" + clz + "', Course='" + course + "' WHERE Student_ID='" + id + "' ";
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);
            prep.execute();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);

        }

    }

    public void addEnglish(AddStudent Stud) {
        DBConnection con = new DBConnection();

        String sql = "INSERT INTO EnglishAttend(Student_ID,Name,Grade) "
                + " Values(?,?,?)";

        try {
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);
            // set values
            prep.setString(1, Stud.getStudentID());
            prep.setString(2, Stud.getStudName());
            prep.setString(3, Stud.getStudGrade());

            int a = prep.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public void addScience(AddStudent Stud) {
        DBConnection con = new DBConnection();

        String sql = "INSERT INTO ScienceAttend(Student_ID,Name,Grade) "
                + " Values(?,?,?)";

        try {
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);
            // set values
            prep.setString(1, Stud.getStudentID());
            prep.setString(2, Stud.getStudName());
            prep.setString(3, Stud.getStudGrade());

            int a = prep.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public void addMath(AddStudent Stud) {
        DBConnection con = new DBConnection();

        String sql = "INSERT INTO MathsAttend(Student_ID,Name,Grade) "
                + " Values(?,?,?)";

        try {
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);
            // set values
            prep.setString(1, Stud.getStudentID());
            prep.setString(2, Stud.getStudName());
            prep.setString(3, Stud.getStudGrade());

            int a = prep.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public void addGeography(AddStudent Stud) {
        DBConnection con = new DBConnection();

        String sql = "INSERT INTO GeographyAttend(Student_ID,Name,Grade) "
                + " Values(?,?,?)";

        try {
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);
            // set values
            prep.setString(1, Stud.getStudentID());
            prep.setString(2, Stud.getStudName());
            prep.setString(3, Stud.getStudGrade());

            int a = prep.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public void addCMaths(AddStudent Stud) {
        DBConnection con = new DBConnection();

        String sql = "INSERT INTO CMathsAttend(Student_ID,Name,Grade) "
                + " Values(?,?,?)";

        try {
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);
            // set values
            prep.setString(1, Stud.getStudentID());
            prep.setString(2, Stud.getStudName());
            prep.setString(3, Stud.getStudGrade());

            int a = prep.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public void addBio(AddStudent Stud) {
        DBConnection con = new DBConnection();

        String sql = "INSERT INTO BioAttend(Student_ID,Name,Grade) "
                + " Values(?,?,?)";

        try {
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);
            // set values
            prep.setString(1, Stud.getStudentID());
            prep.setString(2, Stud.getStudName());
            prep.setString(3, Stud.getStudGrade());

            int a = prep.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public void addChem(AddStudent Stud) {
        DBConnection con = new DBConnection();

        String sql = "INSERT INTO ChemAttend(Student_ID,Name,Grade) "
                + " Values(?,?,?)";

        try {
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);
            // set values
            prep.setString(1, Stud.getStudentID());
            prep.setString(2, Stud.getStudName());
            prep.setString(3, Stud.getStudGrade());

            int a = prep.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public void addIELTS(AddStudent Stud) {
        DBConnection con = new DBConnection();

        String sql = "INSERT INTO IELTSAttend(Student_ID,Name) "
                + " Values(?,?)";

        try {
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);
            // set values
            prep.setString(1, Stud.getStudentID());
            prep.setString(2, Stud.getStudName());

            int a = prep.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public void addFCE(AddStudent Stud) {
        DBConnection con = new DBConnection();

        String sql = "INSERT INTO FCEAttend(Student_ID,Name) "
                + " Values(?,?)";

        try {
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);
            // set values
            prep.setString(1, Stud.getStudentID());
            prep.setString(2, Stud.getStudName());

            int a = prep.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public void addKET(AddStudent Stud) {
        DBConnection con = new DBConnection();

        String sql = "INSERT INTO KETAttend(Student_ID,Name) "
                + " Values(?,?)";

        try {
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);
            // set values
            prep.setString(1, Stud.getStudentID());
            prep.setString(2, Stud.getStudName());

            int a = prep.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public void addPET(AddStudent Stud) {
        DBConnection con = new DBConnection();

        String sql = "INSERT INTO PETAttend(Student_ID,Name) "
                + " Values(?,?)";

        try {
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);
            // set values
            prep.setString(1, Stud.getStudentID());
            prep.setString(2, Stud.getStudName());

            int a = prep.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public void addSpoken(AddStudent Stud) {
        DBConnection con = new DBConnection();

        String sql = "INSERT INTO SpokenAttend(Student_ID,Name) "
                + " Values(?,?)";

        try {
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);
            // set values
            prep.setString(1, Stud.getStudentID());
            prep.setString(2, Stud.getStudName());

            int a = prep.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    //Vinod
    public void AddExam(Models.ExamVer Exm) {

        DBConnection con = new DBConnection();

        String sql = "INSERT INTO Exam(ExamType,ExamHall,ExamTime,ExamDate) "
                + " Values(?,?,?,?)";

        try {
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);

            // set values
            prep.setString(1, Exm.getExamType());
            prep.setString(2, Exm.getExamHall());
            prep.setString(3, Exm.getExamTime());
            prep.setString(4, Exm.getExamDate());
            int a = prep.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public void AddExamRegistration(Models.StudentExamRegistrationVer ExmReg) {

        DBConnection con = new DBConnection();

        String sql = "INSERT INTO ExamRegistration(ExamID,ExamIndex,StudentName,Gender,ExamType,ExamHall,ExamTime,ExamDate,StudentEmail) "
                + " Values(?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);

            // set values
            prep.setString(1, ExmReg.getExamId());
            prep.setString(2, ExmReg.getExamIndex());
            prep.setString(3, ExmReg.getStudentName());
            prep.setString(4, ExmReg.getStudentGender());
            prep.setString(5, ExmReg.getExamType());
            prep.setString(6, ExmReg.getExamHall());
            prep.setString(7, ExmReg.getExamTime());
            prep.setString(8, ExmReg.getExamDate());
            prep.setString(9, ExmReg.getStudentEmail());
            int a = prep.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public void AddDocumentation(Models.Documentation doc) {

        DBConnection con = new DBConnection();

        String sql = "INSERT INTO Documentation(DocumentPath) "
                + " Values(?)";

        try {
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);

            // set values
            prep.setString(1, doc.getDocumentPath());
            int a = prep.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    //Lahiru
    public void AddClass(ClassAdd Don) {

        DBConnection con = new DBConnection();

        String sql = "INSERT INTO Class(ClassId,ClassName, ClassSubject, ClassHall, ClassTime, ClassDate, ClassTeacher)VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);

            // set values
            prep.setString(1, Don.getClassId());
            prep.setString(2, Don.getClassName());
            prep.setString(3, Don.getClassSubject());
            prep.setString(4, Don.getClassHall());
            prep.setString(5, Don.getClassTime());
            prep.setString(6, Don.getClassDate());
            prep.setString(7, Don.getClassTeacher());

            int a = prep.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public void UpadteClass(ClassAdd Don) {
        DBConnection con = new DBConnection();

        try {
            String ClsNo = Don.getClassNo();
            String ClsId = Don.getClassId();
            String ClsName = Don.getClassName();
            String ClsSub = Don.getClassSubject();
            String ClsHall = Don.getClassHall();
            String ClsTime = Don.getClassTime();
            String ClsDate = Don.getClassDate();
            String ClsTea = Don.getClassTeacher();
            String sql = "UPDATE Class SET ClassId = '" + ClsId + "', ClassName = '" + ClsName + "', ClassSubject = '" + ClsSub + "', ClassHall = '" + ClsHall + "', ClassTime = '" + ClsTime + "', ClassDate = '" + ClsDate + "', ClassTeacher = '" + ClsTea + "' WHERE ClassNo = '" + ClsNo + "'";
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);
            prep.execute();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public void AddTransaction(TransactionAdd trns) {

        DBConnection con = new DBConnection();

        String sql;
        sql = "INSERT INTO Transactions(StudentID, StudentName, ReciptID, Amount, PaidMonth, Description, Grade, SubjectName, StudentEmail)VALUES (?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);

            // set values
            prep.setString(1, trns.getStuId());
            prep.setString(2, trns.getStudentName());
            prep.setString(3, trns.getReciptId());
            prep.setString(4, trns.getAmount());
            prep.setString(5, trns.getPaidMonth());
            prep.setString(6, trns.getDescription());
            prep.setString(7, trns.getGrade());
            prep.setString(8, trns.getStudentSubject());
            prep.setString(9, trns.getEmail());

            int a = prep.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public void AddCourse(CourseAdd Course) {
        DBConnection con = new DBConnection();

        String sql = "INSERT INTO Courses(CourseId, CourseTime, CourseDay, CourseHall, CourseType)"
                + "VALUES (?,?,?,?,?)";

        try {
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);

            // set values
            prep.setString(1, Course.getCourse_Id());
            
            prep.setString(2, Course.getCourse_Time());
            prep.setString(3, Course.getCourse_Day());
            prep.setString(4, Course.getCourse_Hall());
            prep.setString(5, Course.getCourse_Type());

            int a = prep.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public void UpadteCourse(CourseAdd Course) {
        DBConnection con = new DBConnection();

        try {
            String CourseId = Course.getCourse_Id();
            String CourseHall = Course.getCourse_Hall();
            String CourseTime = Course.getCourse_Time();
            String CourseDate = Course.getCourse_Day();
            
            String CourseType = Course.getCourse_Type();
            String sql = "UPDATE Courses SET  CourseTime = '" + CourseTime + "', CourseDay = '" + CourseDate + "', CourseHall = '" + CourseHall + "', CourseType = '" + CourseType + "' WHERE CourseID = '" + CourseId + "'";
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);
            prep.execute();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    //era
    public void AddStaff(AddStaff Staff){
    
          DBConnection con = new DBConnection();

        String sql = "INSERT INTO Staff(Name,Address,Contact,Email,NIC,Type,Grade,Subject) "
                + " Values(?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);

            // set values
            prep.setString(1, Staff.getStaffName());
            prep.setString(2, Staff.getStaffAddress());
            prep.setInt(3, Staff.getStaffContact());
            prep.setString(4, Staff.getStaffEmail());
            prep.setString(5, Staff.getStaffNic());
            prep.setString(6, Staff.getStaffType());
            prep.setString(7,Staff.getStaffGrade());
            prep.setString(8,Staff.getStaffSub());

            int a = prep.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }     
    }
    
    public void UpdateStaff(AddStaff staff){
        
        DBConnection con = new DBConnection();
        
        try{
            
            int id = staff.getStaffID();
            String name = staff.getStaffName();
            String address = staff.getStaffAddress();
            int contact = staff.getStaffContact();
            String email = staff.getStaffEmail();
            String nic = staff.getStaffNic();
            String type = staff.getStaffType();
            String grade = staff.getStaffGrade();
            String subject = staff.getStaffSub();
            
            String sql = "UPDATE Staff SET Name = '"+name+"',Address = '"+address+"',Contact = '"+contact+"',Email = '"+email+"',"
                    + "NIC = '"+nic+"',Type = '"+type+"',Grade = '"+grade+"',Subject = '"+subject+"' WHERE Staff_ID = '"+id+"'";
            
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);
            prep.execute();
            
        } catch (Exception ex){
            
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
