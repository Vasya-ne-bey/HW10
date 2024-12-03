public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String finalName = "Ivanov";
        String fullName = "Ivan Ivanovich Ivanov";
        System.out.println("Ф.И.О. сотрудника - " + fullName);
        System.out.println("Задание 2");
        String bigName = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + bigName);
        System.out.println("Задание 3");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println(fullName);
    }
}