/*
 * Course.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

import java.util.ArrayList;

public class Course
{
    private ArrayList <String> arrayList;
    private String courseName;

    public Course (String courseName){
        this.courseName = courseName;
        arrayList = new ArrayList<String>();
    }

    public void addStudent(String student){
        arrayList.add(student);
    }

    public String[] getStudents(){
        String[] str = new String[arrayList.size()];
        for (int i=0; i<arrayList.size(); i++){
            str[i] = arrayList.get(i);
        }
        return str;
    }

    public int getNumberOfStudents(){
        return arrayList.size();
    }

    public String getCourseName(){
        return courseName;
    }

    public void dropStudent(String student){
        arrayList.remove(student);
    }
}

