import java.util.ArrayList;
import java.util.Scanner;
class main{
    int employeeCode;
    String name;
    String designation;
    double salary;
    String companyName;
    long phonenumber;
    String email;
    main(int employeeCode,String name,String designation,double salary,String companyName,long phoneNumber,String email){
        this.employeeCode=employeeCode;
        this.name=name;
        this.designation=designation;
        this.salary=salary;
        this.companyName=companyName;
        this.phonenumber=phoneNumber;
        this.email=email;

    }

}

public class Employee {
    public static void main(String[] args) {
        ArrayList empList = new ArrayList();
        while (true) {
            System.out.println("MENU \n 1.ADD EMPLOYEE \n 2.VIEW ALL EMPLOYEE \n 3. SEARCH EMPLOYEE \n 4.DELETE EMPLOYEE \n 5.EXIT");
            System.out.println("Choose your option");
            Scanner s = new Scanner(System.in);
            int menu = s.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Enter the employee code");
                    int code=s.nextInt();
                    System.out.println("Enter the employee name");
                    String name=s.next();
                    System.out.println("Enter the employee designation");
                    String desig=s.next();
                    System.out.println("Enter the employee salary");
                    double salary=s.nextDouble();
                    System.out.println("Enter the employee company name");
                    String cName=s.next();
                    System.out.println("Enter the employee phone number");
                    long phNo=s.nextLong();
                    System.out.println("Enter the employee email address");
                    String email=s.next();
                    empList.add(code);
                    empList.add(name);
                    empList.add(desig);
                    empList.add(salary);
                    empList.add(cName);
                    empList.add(phNo);
                    empList.add(email);
                    break;
                case 2:
                    System.out.println(empList);
                    break;






            }

        }
    }
}

