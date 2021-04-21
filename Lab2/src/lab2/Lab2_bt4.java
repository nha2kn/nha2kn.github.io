/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nhanr
 */
public class Lab2_bt4 {
    public static void main(String[] args) {
        List<Department> departments = new ArrayList<>();
        Department dep1,dep2,dep3;
        
        dep1 = new Department(1, "Production");
        dep1.addEmployee(new Employee(1, "Do", 1000));
        
        dep2 = new Department(2,"Research");
        dep2.addEmployee(new Employee(2, "Vinh", 1500));
        
        dep3 = new Department(3,"Development");
        dep3.addEmployee(new Employee(3, "Vo", 2000));
        dep3.addEmployee(new Employee(4, "Dau", 2500));
        
        departments.add(dep1);
        departments.add(dep2);
        departments.add(dep3);

        dep3.getEmployee().remove(1);
        
        for (Department department : departments) {
            System.out.println("\n"+departments);
            for (Employee e: department.getEmployee()) {
                System.out.println(e);
            }
        }
    }
    
}
class Department {
    private int id;
    private String name;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Department() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", name=" + name + '}';
    }
    private List<Employee> employees = new ArrayList<>();
    public List<Employee> getEmployee(){
        return employees;
    }
    public void addEmployee(Employee e){
      employees.add(e);
      e.setDepartment(this);
    }
    public void removeEmployee(Employee e){
       employees.remove(e);
       e.setDepartment(null);
    }
}
 class Employee{
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public Employee() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", salary=" + salary + '}';
    }
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    
    
 }

