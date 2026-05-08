package hei.group.n1;

import java.time.LocalDate;

public class DepartemenTest {

      public static void main(String[] args) {
            Departement hr = new Departement("Human Ressources");
            Employee johnDoe = new Employee(
                  1,
                  "John",
                  "Doe",
                  LocalDate.of(1993, 12, 31),
                  "Itaosy-unis",
                  3_000_000,
                  2026
            );
            Employee jack = new Employee(
                  2,
                  "Jack",
                  "Doe",
                  LocalDate.of(1993, 12, 31),
                  "Itaosy-unis",
                  3_000_000,
                  2026
            );

            hr.addEmployee(johnDoe);
            hr.addEmployee(jack);

            System.out.println(hr.employees);
            System.out.println(hr.employees.size());

            System.out.println(hr.getTotalMonthlySalary());

            hr.removeEmployee(johnDoe);
            System.out.println(hr.employees);
      }
}
