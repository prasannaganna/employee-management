package employeeController;

import employeeService.Service;
import entity.Employee;

import java.util.List;

public class Controller {
    Service service = new Service();
    public Employee addemp(int empId, String empName, String email, String gender, String emprole, String address){
        return service.add(empId,empName,email,gender,emprole,address);
    }
    public List<Employee> getAll(){
        return service.getAll();
    }
    public void getAlNames(){
        service.getAllNames();
    }
    public Employee updte(int id, Employee a){
        return service.update(id,a);
    }
    public Employee updateNameById(int id,String name){
        return service.uodatNameById(id,name);
    }
    public void delete(int id){
        service.delete(id);
    }


}
