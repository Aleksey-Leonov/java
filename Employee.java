public class Employee {
    private String surName;
    private String name;
    private String patronymic;
    private String position;
    private String eMail;
    private String phone;
    private double salary;
    private int age;


    public Employee(String surName, String name, String patronymic, String position, String eMail, String phone, double salary, int age) {
        this.surName = surName;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.eMail = eMail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getSurName() {
        return surName;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getPosition() {
        return position;
    }

    public String geteMail() {
        return eMail;
    }

    public String getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}
