package hei.group.n1;

import org.junit.jupiter.api.*;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class DepartementTest {

    private Departement hr;
    private Employee johnDoe;
    private Employee jack;

    @BeforeEach
    void setUp() {
        hr = new Departement("Human Ressources");

        johnDoe = new Employee(
                1, "John", "Doe",
                LocalDate.of(1993, 12, 31),
                "Itaosy-unis", 3_000_000, 2026
        );

        jack = new Employee(
                2, "Jack", "Doe",
                LocalDate.of(1993, 12, 31),
                "Itaosy-unis", 3_000_000, 2026
        );
    }

    @Test
    @DisplayName("Ajouter un employé augmente la taille de la liste")
    void shouldIncreaseListSizeWhenAddingEmployee() {
        hr.addEmployee(johnDoe);
        hr.addEmployee(jack);

        assertEquals(2, hr.employees.size());
    }

    @Test
    @DisplayName("La liste contient les employés ajoutés")
    void shouldContainAddedEmployees() {
        hr.addEmployee(johnDoe);
        hr.addEmployee(jack);

        assertTrue(hr.employees.contains(johnDoe));
        assertTrue(hr.employees.contains(jack));
    }

    @Test
    @DisplayName("Le salaire total mensuel est la somme des salaires")
    void shouldReturnCorrectTotalMonthlySalary() {
        hr.addEmployee(johnDoe);
        hr.addEmployee(jack);

        assertEquals(6_000_000, hr.getTotalMonthlySalary());
    }

    @Test
    @DisplayName("Supprimer un employé le retire de la liste")
    void shouldRemoveEmployeeFromList() {
        hr.addEmployee(johnDoe);
        hr.addEmployee(jack);

        hr.removeEmployee(johnDoe);

        assertFalse(hr.employees.contains(johnDoe));
        assertEquals(1, hr.employees.size());
    }

    @Test
    @DisplayName("Le salaire total est 0 si aucun employé")
    void shouldReturnZeroSalaryWhenNoEmployee() {
        assertEquals(0, hr.getTotalMonthlySalary());
    }
}