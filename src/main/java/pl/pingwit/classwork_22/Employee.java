package pl.pingwit.classwork_22;

import java.util.Objects;

/**
 * @author Pavel Radkevich
 * @since 12.04.23
 */
public class Employee {

    private String name;
    private String department;
    private float ratePerHour;

    public Employee() {
    }

    public Employee(String name, String department, float ratePerHour) {
        this.name = name;
        this.department = department;
        this.ratePerHour = ratePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Float.compare(employee.ratePerHour, ratePerHour) == 0 && Objects.equals(name, employee.name) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, ratePerHour);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", ratePerHour=" + ratePerHour +
                '}';
    }
}
