// Given an employee date base.Name, Age, Designation, Department Of ten people
// Five tasks were given such as
// 1. Print all employee details.
// 2. Searching employee details
// 3. Employees under the given manger name of the department
// 4. reporting to tree of the given employee name

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Employee Database Management System");
            System.out.println("Choose the options below :");
            System.out.println("1. Add Employees \n2. Print Employees \n3. Search an Employee \n4. Employees under the given manager of the department \n5. Reporting Tree of the employee \n6. Add new Department and manager \n7. Available department and their managers. \n8. Exit");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Enter the below details to add the employee : ");
                    System.out.println("Enter the name of the Employee : ");
                    String name = sc.next();
                    System.out.println("Enter the Age of the employee : ");
                    int Age = sc.nextInt();
                    System.out.println("Enter the designation of the employee : ");
                    String Designation = sc.next();
                    System.out.println("Please select a department the employee needs to be added : ");
                    boolean check = functions.displayDepartment();
                    if(check == false){
                        System.out.println("Please add a deptartment to access : ");
                        String department = sc.next();
                        System.out.println("Enter the manager of the department : ");
                        String manager = sc.next();
                        functions.addDeptAndManager(department, manager);
                        System.out.println("Department added Successfully");
                    }
                    System.out.println("Enter any one of the department from above : ");
                    String dep = sc.next();
                    Employee employee = new Employee("", 0, "", "");
                    employee.setName(name);
                    employee.setAge(Age);
                    employee.setDesignation(Designation);
                    employee.setDept(dep);
                    functions.addEmployee(employee);
                    System.out.println("Employee add successfully");
                    break;
                case 2:
                    System.out.println("Printing all the employees : ");
                    functions.allEmployee();
                    break;
                case 3:
                    System.out.println("Search an Employee by filling the below details : ");
                    System.out.println("Enter the name :");
                    String nameSearch = sc.next();
                    System.out.println("Please select a department the employee needs to be Search : ");
                    boolean chck = functions.displayDepartment();
                    if(chck == false){
                        System.out.println("No department available");
                    }
                    else{
                        functions.searchEmployee(nameSearch);
                    }
                    break;
                case 4:
                    System.out.println("Enter the name of the manager to list the employees under them : ");
                    String manager = sc.next();
                    functions.empUnderManager(manager);
                    break;
                case 5:
                    System.out.println("Enter the name and the reporting tree will be shown : ");
                    String nameTree = sc.next();
                    functions.reportingTree(nameTree);
                    break;
                case 6:
                    System.out.println("Add new Department and Assign Manager to it");
                    System.out.println("Enter the Department name : ");
                    String newDept = sc.next();
                    System.out.println("Enter the Manager name : ");
                    String newManager = sc.next();
                    functions.addDeptAndManager(newDept, newManager);
                    break;
                case 7:
                    functions.displayManagerandDept();
                    break;
                case 8:
                    System.out.println("Closing the application....BYE BYE!!!");
                    System.exit(1);
                default:
                    break;
            }
        }
    }
    
}