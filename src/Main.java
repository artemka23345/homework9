public class Main {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        task2(fullName);
        task3(fullName);
    }
    static void task2(String fullName){
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " +
                fullName.toUpperCase());
    }
    static void task3(String fullName){
        fullName = "Иванов Семён Семёнович";
        System.out.println(fullName.replace('ё','е'));
    }

}
