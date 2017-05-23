package com.example.android.justclass;
import android.widget.Toast;
import java.util.ArrayList;


/**
 * Created by admin on 23.05.2017.
 */

public class ReportCard {
    //constructor variables
    private String firstName,lastName,classNumber,subject,dateOfmark, mark;
    //full average score
    private float averageScore ;
    //database of marks
    private ArrayList <String> marksDataBase;

    /*//constructor's params:
            @firstName - first student's name
            @lastName - last student's name
            @classNumber - student's class number
            @subject - subject
            @DateOfmark - date of mark
            @mark - student's mark
    */

    public ReportCard(String firstName, String lastName, String classNumber, String subject, String dateOfmark, String mark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.classNumber = classNumber;
        this.subject = subject;
        this.dateOfmark = dateOfmark;
        this.mark = mark;
        marksDataBase.add(mark);
    }

    //Getters and setters for class field
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDateOfmark() {
        return dateOfmark;
    }

    public void setDateOfmark(String dateOfmark) {
        this.dateOfmark = dateOfmark;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    //getter for average score
    public float  getAverageScore() {
        return averageScoreMaker(marksDataBase) ;
     }

    //toString method
    @Override
    public String toString() {
        return "ReportCard{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", classNumber='" + classNumber + '\'' +
                ", subject='" + subject + '\'' +
                ", dateOfmark='" + dateOfmark + '\'' +
                ", mark='" + mark + '\'' +
                ", averageScore=" + averageScoreMaker(marksDataBase) +
                '}';
    }

    //Method for generate average score
    private float averageScoreMaker(ArrayList arrayList){
        if (arrayList.size() != 0){
        for (int i = 0; i < arrayList.size(); i++) {
            averageScore=averageScore+Float.parseFloat((String) arrayList.get(i));
             }
          }
        else {
            Toast.makeText(context , "No marks in Data Base ", Toast.LENGTH_LONG).show();
        averageScore=0;
        }
        return averageScore;
    }

}
