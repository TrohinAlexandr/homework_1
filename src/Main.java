import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        System.out.println("Трохин Александр Андреевич");
        System.out.println("Группа РИБО-01-21, вариант 4"); 
        task4();
    }

    public static void task4() {
        System.out.println("Введите на какое кол-во месяцев берется вклад:");
        int month = Integer.parseInt(scan());
        if (month < 1) {
            System.out.println("Ошибка! Кол-во месяцев должно быть больше нуля.");
            return;
        }
        System.out.println("Введите месячный процент:");
        double percent = Double.parseDouble(scan());
        if (percent <= 0 || percent > 100) {
            System.out.println("Ошибка! Процент должен быть больше нуля и не больше 100.");
            return;
        }
        System.out.println("Введите начальную сумму:");
        double sum = Double.parseDouble(scan());
        if (sum <= 0) {
            System.out.println("Ошибка! Первоначальная сумма вклада должна быть больше нуля.");
            return;
        }
        int n = 1;
        while (n <= month) {
            sum += sum * (percent / 100);
            System.out.println("Доход после " + n + "-го месяца составляет " + sum + " рублей.");
            n++;
        }
        System.out.println("Итоговый доход за " + month + " месяцев составляет " + sum + " рублей.");
    }

    public static String scan() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
