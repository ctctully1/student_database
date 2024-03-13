package student_database;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String grade;
    int studentId;
    static int id = 1000;
    String courses ="";
    int numcourses;
    private int balance;

    public Student(String firstName, String lastName, String grade){
        this.firstName = firstName;

        this.lastName = lastName;

        this.grade = grade;
    }

    public int uniqueId(){
        id++;
        String strId = this.grade + id;
        this.studentId = Integer.parseInt(strId.toString());
        return studentId;
    }

    //pick course to enroll in
    public void enrollCourse(){
        boolean test = false;
        do {
            System.out.println("choose a course to enroll in : \n 1 for History 101" +
                    "\n 2 for Mathematics 101" +
                    "\n 3 for English 101" +
                    "\n 4 for Chemistry 101" +
                    "\n5 for Computer Science 101");
            Scanner in1 = new Scanner(System.in);
            int course = in1.nextInt();
            if (course == 1) {
                courses = courses + "\n History 101";
                numcourses++;
            }
            else if(course == 2) {
                courses = courses + "\n Mathematics 101";
                numcourses++;
            }
            else if(course == 3) {
                courses = courses + "\n English 101";
                numcourses++;
            }
            else if(course == 4) {
                courses = courses + "\n Chemistry 101";
                numcourses++;
            }
            else if(course == 5) {
                courses = courses + "\n Computer Science 101";
                numcourses++;
            }
            else{
                courses = courses;
            }
            System.out.println("Would you like to to select another course: y or n");
            Scanner in2 = new Scanner(System.in);
            String inn = in2.nextLine();
            if (inn.equals("y")) {test = true;}
            else {test = false;}
        } while(test);
        System.out.println("Number of courses enrolled in :" + numcourses);
        int costCourse=600;
        balance = numcourses * costCourse;
    }

    //get the balance for the cost of tuition - $600 per course
    public int getBalance() {
        int costCourse = 600;
        balance = numcourses * costCourse;
        return balance;
    }

    // view Balance
    public void viewBalance(){
        System.out.println("Your balance is: $" + balance);
    }

    // choose to pay for any number of courses and update the balance
    public void payTuition(){
        System.out.println("How many courses would you like to pay for?");
        Scanner in1 = new Scanner(System.in);
        int numpay = in1.nextInt();
        numcourses = numcourses - numpay;
    }

    //see the status of the student - name, grade, ID, courses enrolled, and balance
    public String toString(){
        return "\nName: " + this.firstName + " " + this.lastName +
                "\nGrade: " + this.grade +
                "\nStudent ID: " + this.studentId +
                "\nCourses enrolled in: " + courses +
                "\nCurrent Balance is $" + getBalance();
    }
}
