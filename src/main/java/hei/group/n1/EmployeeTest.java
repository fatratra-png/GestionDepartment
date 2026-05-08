package hei.group.n1;

import java.time.LocalDate;

public class EmployeeTest {

      public static void main(String[] args) {
            //Je vais instancier des objets Employee via new Employee
            Employee westlife = new Employee(
                  1,
                  "Mahatana",
                  "Westlife",
                  LocalDate.of(1998, 11, 01),
                  "Ivandry HEI Madagascar",
                  3_000_000,
                  2020
            );
            System.out.println(westlife.getFullName());
            System.out.println(westlife.isLivingAtIvandry());
            System.out.println(westlife.countYearOfService());
      }
}
