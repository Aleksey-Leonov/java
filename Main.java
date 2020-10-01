public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov", "Ivan", "Ivanovich", "Driller",
                "driller@mail.ru", "89121212121", 120000, 33);
        employees[1] = new Employee("Sidorov", "Sidor", "Sidorovich", "Consultant",
                "cons@mail.ru", "89121215555", 50000, 25);
        employees[2] = new Employee("Pelmenev", "Victor", "Jamalovich", "Seller",
                "seller@mail.ru", "891299999999", 60000, 43);
        employees[3] = new Employee("Samantov", "Ivan", "Alexeevich", "Java developer",
                "java@mail.ru", "8999999999999", 200000, 41);
        employees[4] = new Employee("Alexandrov", "Alex", "Mihailovich", "Trainer",
                "Trainer@mail.ru", "8912123123123", 70000, 55);


        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                System.out.println("Имя: "+ employees[i].getSurName());
                System.out.println("Фамилия: "+ employees[i].getName());
                System.out.println("Отчество: "+employees[i].getPatronymic());
                System.out.println("Должность: "+ employees[i].getPosition());
                System.out.println("eMail: "+employees[i].geteMail());
                System.out.println("Номер телефона: "+employees[i].getPhone());
                System.out.println("Зарплата: "+employees[i].getSalary());
                System.out.println("Возраст: "+employees[i].getAge());
                System.out.println("________________________________");
            }

        }
    }
}
