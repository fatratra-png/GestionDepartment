package hei.group.n1;

import java.util.ArrayList;
import java.util.List;

public class Departement {

      String name;
      List<Employee> employees;

      public Departement(String name) {
            this.name = name;
            this.employees = new ArrayList<>();
      }

      void addEmployee(Employee employee) {
            this.employees.add(employee);
      }

      void removeEmployee(Employee employee) {
            this.employees.remove(employee);
      }

      int getTotalMonthlySalary() {
            int total = 0;
            for (Employee employee : employees) {
                  total += employee.salaryPerMonth;
            }
            return total;
      }
}
