/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package student_database;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Ask how many Students will be added
        System.out.println("How many students will be added to the data base?");
        Scanner in = new Scanner(System.in);
        int ns = in.nextInt();

        //set up array for ns students
        Student[] students = new Student[ns];
        //create ns students
        for(int i=0; i < ns; i++) {
            Scanner in1 = new Scanner(System.in);
            System.out.println("Enter Student's first name : ");
            String firstName = in1.nextLine();

            Scanner in2 = new Scanner(System.in);
            System.out.println("Enter Student's last name : ");
            String lastName = in2.nextLine();

            Scanner in3 = new Scanner(System.in);
            System.out.println("Enter Student's grade : ");
            String grade = in3.nextLine();

            students[i] = new Student(firstName, lastName, grade);

            //set Id, enroll in courses, get balance, pay tuition and update balance
            students[i].uniqueId();
            students[i].enrollCourse();
            students[i].viewBalance();
            students[i].payTuition();
        }

        //print out details for each of the students enrolled
        for(int i=0; i < ns; i++) {
           System.out.println(students[i].toString());
        }
    }

}
