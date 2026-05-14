package employeeRepository;

import entity.Employee;

import java.util.ArrayList;
import java.util.List;     // list is imported from the util package

public class Repository {
    //taking array list to store the data in data base
    List<Employee> el = new ArrayList<>();
    //curd operations
    //empty arraylist was created ..
    // to add the employee we use add method
    public  Employee addEmployee(Employee e){
        el.add(e);
        return e;
    }
    //geting all employee  propertis in list
    public List<Employee> getAll(){
        return el;
    }
    // get all employees with only some properties
    public void getAllNames(){
        for(Employee s:el){
            System.out.println(s.getEmpName());
            System.out.println(s.getGender());
            System.out.println(s.getEmprole());
        }
    }
    public  Employee Update(int id,Employee e){
        for (Employee emp :el) {
            if (emp.getEmpId() == id) {
                emp.setEmpName(e.getEmpName());
                emp.setEmprole(e.getEmprole());
                emp.setEmail(e.getEmail());
                return e;
            }
        }
        return  null;
    }
    public  Employee updateNameById(int id,String name){
        for (Employee emp :el) {
            if (emp.getEmpId() == id) {
                emp.setEmpName("G.P.Ganesh");
                return emp;
            }
        }
        return null;
    }
    //it is based on the id
    public void delete(int id){
        for (Employee e :el ){
            if(e.getEmpId()==id){
                el.remove(e);
            }
        }
    }



}
