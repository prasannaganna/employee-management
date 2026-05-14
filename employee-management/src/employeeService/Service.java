package employeeService;

import employeeRepository.Repository;
import entity.Employee;

import java.util.List;

public class Service {
    Repository repository  = new Repository();
    public Employee add(int empId, String empName, String email, String gender, String emprole, String address){
        Employee employee = new Employee(empId,empName,email,gender,emprole,address);
        return  repository.addEmployee(employee);
    }
    public List<Employee> getAll(){
        return repository.getAll();
    }
    public void getAllNames(){
        repository.getAllNames();
    }
    public Employee update(int id, Employee e){
        return repository.Update(id,e);
    }
    public Employee uodatNameById(int id ,String name){
        return repository.updateNameById(id, name);
    }
    public void delete(int id ){
        repository.delete(id);
    }

}
