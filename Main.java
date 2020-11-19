import java.util.Scanner;
public class Main{
 
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Teacher teacher1=new Teacher("108021111","Jack","0988888777","Jack@gmail.com","58");
        Student student1=new Student("108021113","Mary","0999900000","Mary@gmail.com","girl");
        System.out.println(teacher1.showinfo());
        System.out.println(student1.showinfo());
    }
}