//STUDENT GRADE CALCULATOR
import java.util.*;
public class task2{
    //calculating total marks
    public int tmarks(int n,int[] sub_marks){
        int sum=0;
        for(int i=0; i<n;i++){
            sum=sum+ sub_marks[i];
        }
        return sum;
    }
    //calulating Average Percentage
    public double average(double n,double total_marks){
        double total_average= total_marks/n;
        return total_average;
    }
    //Grade calculation
    public void Grade(double avg){
        if(avg>80){
            System.out.println("Grade A");
        }
        else if(avg>60 && avg<=80){
            System.out.println("Grade B");
        }
        else if(avg>40 && avg<=60){
            System.out.println("Grade C");
        }
        else
        {
            System.out.println("Grade D");
        }
    }
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter total number of subjects:");
    int no_of_sub = sc.nextInt();
    int[] sub_marks= new int[10];
    //taking marks of n subjects
    System.out.println("Enter the marks of all the subjects:");
    for(int i=0; i< no_of_sub; i++){
        sub_marks[i]= sc.nextInt();//marks out of 100
    }
    sc.close();
    task2 m = new task2();// creating object
    int total_marks=m.tmarks(no_of_sub,sub_marks);
    System.out.println("TOTAL MARKS:"+ total_marks);
    double average_percentage= m.average(no_of_sub,total_marks);
    System.out.println("AVERAGE PERCENTAGE:"+ average_percentage);
    m.Grade(average_percentage);
}
}