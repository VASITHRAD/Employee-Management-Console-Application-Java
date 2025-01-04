public class Employee {
    private String name;
    private int Age;
    private String designation;
    private String dept;
    private String manager;

    public Employee(String name, int age, String designation, String dept) {
        this.name = name;
        this.Age = age;
        this.designation = designation;
        this.dept = dept;
    }
    
    @Override
    public String toString() {
        return "Employee Name = " + getName() + ", Age = " + getAge() + ", Designation = " + getDesignation()
                + ", Department = " + getDept() + ", Manager = " + getManager() ;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return Age;
    }
    public String getDesignation() {
        return designation;
    }
    public String getDept() {
        return dept;
    }
    public String getManager() {
        return manager;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        Age = age;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
    
    public void updateManager(String manager){
        this.manager = manager;
    }
}
