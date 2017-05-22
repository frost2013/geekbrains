package michail.kovalishev;


public class EmployeeDemo {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Троцкин Петр", "Уборщик", "trockin1967@gmail.com", "+79655548763", 25000, 40);
        employees[1] = new Employee("Бифало Александр", "Программист", "bifaloya@yandex.ru", "+79671234578", 67000, 39);
        employees[2] = new Employee("Капрыгин Михаил", "Дизайнер", "kaprigin@gmail.com", "+79856789524", 65000, 35);
        employees[3] = new Employee("Бутлагов Константин", "Руководитель", "butlagovk@gmail.com", "+79915487216", 70000, 42);
        employees[4] = new Employee("Фихрин Евгений", "Директор", "fihrinev@gmail.com", "+79616598324", 80000, 47);

        for (Employee employee: employees) {
            if (employee.getAge() > 40) {
                employee.outputOnConsole();
            }
        }
    }
}
