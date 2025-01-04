import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class functions {
    private static ArrayList<Employee> employeeList = new ArrayList<>();
    private static HashMap<String,String> deptWithManager = new HashMap<>();

    public static void addEmployee(Employee employee){
        for(Map.Entry<String,String> map : deptWithManager.entrySet()){
            if(map.getKey().equals(employee.getDept())){
                employee.updateManager(map.getValue());
            }
        }
        employeeList.add(employee);
    }

    public static void allEmployee(){
        if(employeeList.size()==0){
            System.out.println("No employees in the list");
            return;
        }
        for(Employee emp : employeeList){
            System.out.println(emp.toString());
            System.out.println("***********************************************");
        }
    }

    public static boolean displayDepartment(){
        if(deptWithManager.size()==0){
            System.out.println("Please do add department to access it.");
            return false;
        }
        else{
            for(Map.Entry<String,String> map : deptWithManager.entrySet()){
                System.out.println(map.getKey());
            }
        }
        return true;
    }

    public static void addDeptAndManager(String dept, String manager){
            deptWithManager.put(dept, manager);
    }

    public static void searchEmployee(String name){
        if(employeeList.size()==0){
            System.out.println("No employess.");
            return;
        }
        for(Employee emp : employeeList){
            if(emp.getName().equals(name)){
                System.out.println("Employee Found");
                System.out.println(emp.toString());
                return;
            }
        }
        System.out.println("No such employee in the given details");
    }

    public static void displayManagerandDept(){
        if(deptWithManager.size()==0){
            System.out.println("No departments available.");
            return;
        }
        else{
            for(Map.Entry<String,String> map : deptWithManager.entrySet()){
                System.out.println(map.getKey()+" "+map.getValue());
            }
        }
    }

    public static void empUnderManager(String manager){
        if(!deptWithManager.values().contains(manager)){
            System.out.println("No manager named "+manager+" works here. Please check the informations.");
            return;
        }
        for(Employee emp : employeeList){
            if(emp.getManager().equals(manager)){
                System.out.println(emp.toString());
            }
        }
    }

    public static void reportingTree(String name){
        boolean found = false;
        for(Employee emp : employeeList){
            if(emp.getName().equals(name)){
                System.out.println(emp.getManager()+" -> "+emp.getName());
                found = true;
            }
        }
        if(deptWithManager.values().contains(name)){
            found = true;
            System.out.print(name+" -> ");
            for(Employee emp : employeeList){
                if(emp.getManager().equals(name)){
                    System.out.print(emp.getName()+" -> ");
                }
            }
            System.out.println("List ends");
        }

        if(found == false ){
            System.out.println("No such employee exist");
        }
    }

    
}
