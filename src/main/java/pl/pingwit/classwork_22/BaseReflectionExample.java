package pl.pingwit.classwork_22;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Pavel Radkevich
 * @since 12.04.23
 */
public class BaseReflectionExample {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        Employee employee = new Employee("Pavel Radkevich", "RnD", 13.135f);

        Class<? extends Employee> employeeClass = employee.getClass();
        Class<Employee> employeeClass1 = Employee.class;
        Class<?> aClass = Class.forName("pl.pingwit.classwork_22.Employee");

        Employee newEmployee = null;
        Constructor<?>[] declaredConstructors = employeeClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            Class<?>[] parameterTypes = declaredConstructor.getParameterTypes();
            if (parameterTypes.length == 0) {
                newEmployee = (Employee) declaredConstructor.newInstance();
            }
        }
        for (Field declaredField : employeeClass.getDeclaredFields()) {
            declaredField.setAccessible(true);

            System.out.printf("Field %s has type %s", declaredField.getName(), declaredField.getType().getSimpleName());
            System.out.println();

            if (declaredField.getName().equals("name")) {
                declaredField.set(newEmployee, "Pupa");
            }
            if (declaredField.getName().equals("department")) {
                declaredField.set(newEmployee, "transport");
            }
            if (declaredField.getName().equals("ratePerHour")) {
                declaredField.set(newEmployee, 12.55f);
            }
        }
        System.out.println(newEmployee);

    }
}
