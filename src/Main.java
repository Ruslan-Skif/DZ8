public class Main {
    public static void main(String[] args) {
        int [] pays = {9, 10, 13, 8, 11};
        int sum = 0;
        for (int i = 0; i < pays.length; i++){
            sum = sum + pays[i];
        }
        System.out.println("Task 1");
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        System.out.println(" ");
        System.out.println("Task 2");
        int maxPays = 0;
        int minPays = pays[0];
        for (int i = 0; i < pays.length; i++) {
            if (maxPays < pays[i]) {
                maxPays = pays[i];
            }
            if(minPays > pays[i]) {
                minPays = pays[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPays + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + maxPays + " рублей.");
        System.out.println(" ");
        System.out.println("Task 3");
        sum = 0;
        double middlePays = 0.0;
        for (int i = 0; i < pays.length; i++){
            sum = sum + pays[i];
        }
        middlePays = (double)sum / pays.length;
        System.out.println("Средняя сумма трат за месяц составила " + middlePays + " рублей.");
        System.out.println(" ");
        System.out.println("Task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }

    }
}