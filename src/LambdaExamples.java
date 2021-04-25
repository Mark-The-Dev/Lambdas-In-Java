import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExamples{

    public static void main(String[] args) {
        // old school way.
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Printing from the runnable");
//            }
//        }).start();

        // lambda way!
        // 3 parts -- Argument list, Arrow Token, Body.
        // in this case the argument list is empty ()
        // the arrow token is ->
        // the body is the code we are running Sys.out
        // This knows what to do because Run is the only method! (functional interface)
        new Thread(()-> System.out.println("Printing from the Runnable")).start();

        // can add a code block to add to lambda
        new Thread(()-> {
            System.out.println("Printing from the Runnable");
            System.out.println("Line 2");
            System.out.format("This is line %d\n", 3);
        }).start();

        Employee john = new Employee("John Joe", 30);
        Employee mark = new Employee("Mark Marcello", 31);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);


        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(mark);
        employees.add(jack);
        employees.add(snow);

        // comparator is a functional interface because it has one method that needs an override
//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });


        // lambda version
//        Collections.sort(employees, (Employee employee1, Employee employee2) ->
//                employee1.getName().compareTo(employee2.getName()));

        // lambda version with inferred types
//        Collections.sort(employees, (employee1, employee2) ->
//                employee1.getName().compareTo(employee2.getName()));

        // lambda version Comparator.comparing
        Collections.sort(employees, Comparator.comparing(Employee::getName));

        for(Employee employee: employees){
            System.out.println(employee.getName());
        }
    }


}
