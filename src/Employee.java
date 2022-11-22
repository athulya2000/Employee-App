import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

 class EmployeeList {
     int code;
     String name;
     String designation;
     double salary;
     String companyName;
     long phoneNo;
     String email;

     public EmployeeList(int code, String name, String designation, double salary, String companyName, long phoneNo, String email) {
         this.code = code;
         this.name = name;
         this.designation = designation;
         this.salary = salary;
         this.companyName = companyName;
         this.phoneNo = phoneNo;
         this.email = email;
     }
 }

     public class Employee {

         public static void main(String[] args) {
             ArrayList<EmployeeList> empList = new ArrayList<EmployeeList>();
             while (true) {
                 System.out.println("MENU \n 1.ADD EMPLOYEE \n 2.VIEW ALL EMPLOYEE \n 3. SEARCH EMPLOYEE \n 4.DELETE EMPLOYEE \n 5.EXIT");
                 System.out.println("Choose your option");
                 Scanner s = new Scanner(System.in);
                 int menu = s.nextInt();
                 switch (menu) {
                     case 1:
                         System.out.println("Enter the employee code");
                         int code = s.nextInt();
                         System.out.println("Enter the employee name");
                         String name = s.next();
                         System.out.println("Enter the employee designation");
                         String designation = s.next();
                         System.out.println("Enter the employee salary");
                         double salary =s.nextDouble();
                         System.out.println("Enter the employee company name");
                         String companyName = s.next();
                         System.out.println("Enter the employee phone number");
                         long phoneNo = s.nextLong();
                         System.out.println("Enter the employee email address");
                         String email = s.next();
                         EmployeeList emp = new EmployeeList(code, name, designation, salary, companyName, phoneNo, email);
                         empList.add(emp);
                         break;
                     case 2:
                         System.out.println("View all employee details");
                         for(int i=0;i<empList.size();i++){
                             System.out.println(empList.get(i).code);
                             System.out.println(empList.get(i).name);
                             System.out.println(empList.get(i).designation);
                             System.out.println(empList.get(i).salary);
                             System.out.println(empList.get(i).companyName);
                             System.out.println(empList.get(i).phoneNo);
                             System.out.println(empList.get(i).email);
                         }
                         break;
                     case 3:
                         System.out.println("Enter the employee code");
                         int empCode=s.nextInt();
                         for(EmployeeList e:empList){
                             if(empCode==e.code){
                                 System.out.println(e.code);
                                 System.out.println(e.name);
                                 System.out.println(e.designation);
                                 System.out.println(e.salary);
                                 System.out.println(e.companyName);
                                 System.out.println(e.phoneNo);
                                 System.out.println(e.email);

                             }
                             else {
                                 System.out.println("No such employee found");

                             }
                         }
                         break;
                     case 4:
                         System.out.println("Enter the employee code");
                         int eCode=s.nextInt();
                         for(EmployeeList ec:empList){
                             if(eCode==ec.code){
                                 empList.remove(ec);
                                 break;
                             }
                         }
                         break;
                     case 5:
                         System.exit(0);

                     default:
                         System.out.println("Choose valid option");


                 }

             }
         }
 }

