package michail.kovalishev;

public class Employee {
    private String fullName = "";
    private String position = "";
    private String email = "";
    private String phoneNumber = "";

    private int salary = 0;
    private int age = 0;

    public Employee() {

    }

    public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        setFullName(fullName);
        setPosition(position);
        setEmail(email);
        setPhoneNumber(phoneNumber);
        setSalary(salary);
        setAge(age);
    }

    public void outputOnConsole() {
        System.out.println("Employee [" + this.toString() + "]: ");
        System.out.println(" - ФИО = " + this.getFullName() + ";");
        System.out.println(" - Позиция = " + this.getPosition() + ";");
        System.out.println(" - Почта = " + this.getEmail() + ";");
        System.out.println(" - Номер телефона = " + this.getPhoneNumber() + ";");
        System.out.println(" - Зарплата = " + this.getSalary() + ";");
        System.out.println(" - Возраст = " + this.getAge() + ";\n");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) {
            System.out.println("Указан неверный email");
        }
        else {
            this.email = email;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 12) {
            System.out.println("Указан неверный телефон. Длина слишком большая");
        }
        else {
            this.phoneNumber = phoneNumber;
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary < 0) {
            System.out.println("Зарплата не может быть отрицательной.");
        }
        else {
            this.salary = salary;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Возраст не может быть отрицательным.");
        }
        else if (age < this.age) {
            System.out.println("Возраст не может быть меньше текущего возраста.");
        }
        else {
            this.age = age;
        }
    }
}
