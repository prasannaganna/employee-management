package employeeMain;

import employeeController.Controller;
import entity.Employee;

import java.util.List;

public class Main {

     public static void main (String[] args){
         Controller controller = new Controller();
         System.out.println(controller.addemp(1,"G.Prasanna","prasanna@gmail.com","Female","javadeveloper","hyderabad"));
         System.out.println(controller.addemp(2,"G.P.Gani","gani@gmail.com","male","javadeveloper","bangolre"));
         System.out.println( controller.addemp(3,"B.Ramya","ramya@gmail.com","Female","CustomerSupport","pune"));
         System.out.println(controller.addemp(4,"G.Bhavana","bhavana@gmail.com","Female","Maarketing","hyderabad"));
         System.out.println( controller.addemp(5,"B.Sushmitha","suhmitha@gmail.com","Female","FrontEnddeveloper","mumbai"));
         System.out.println(controller.addemp(6,"B.chadhu","chandhu@gmail.com","male","AI developer","bangolre"));
         System.out.println("geting all the employees in a list");
         System.out.println(controller.getAll());
         System.out.println("some properties of the employee: ");
         controller.getAlNames();
         Employee employee = new Employee(6,"B.bhanu","bhanu@gmail.com","male","senior java developer","mumbai");
         System.out.println(controller.updte(6,employee));
         System.out.println(controller.updateNameById(2,"G.P.Gani"));
        // Employee e = new Employee(6,"B.chadhu","chandhu@gmail.com","male","AI developer","bangolre");
          controller.delete(5);
         System.out.println(controller.getAll());

     }
}
