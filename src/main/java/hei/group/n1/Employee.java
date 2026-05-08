package hei.group.n1;

import java.time.LocalDate;

public class Employee {

      // attributs

      int id;
      String firstName;
      String lastName;
      LocalDate birthday;
      String address;
      int salaryPerMonth;
      int hiringYear;

      // methodes

      String getFullName() {
            return (this.firstName + " " + this.lastName);
      }

      boolean isLivingAtIvandry() {
            return address.toLowerCase().contains("ivandry");
      }

      int getYearSalary() {
            return (this.salaryPerMonth * 12);
      }

      int countYearOfService() {
            return LocalDate.now().getYear() - hiringYear;
      }

      // constructeur

      public Employee(
            int id,
            String firstName,
            String lastName,
            LocalDate birthday,
            String address,
            int salaryPerMonth,
            int hiringYear
      ) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthday = birthday;
            this.address = address;
            this.salaryPerMonth = salaryPerMonth;
            this.hiringYear = hiringYear;
      }
}
