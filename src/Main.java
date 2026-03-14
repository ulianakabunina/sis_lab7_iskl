import java.util.Scanner;

public class Main {

    public static class NotEnoughMarshmallowsException extends Exception {
        public NotEnoughMarshmallowsException(String message) {
            super(message);
        }
    }

    public static class MarshmallowValidator {
        private static final int MIN_MARSHMALLOWS = 3;

        public static void bringMarshmallows(int count) throws NotEnoughMarshmallowsException {

            Debugger.log("Проверяем количество зефирок");
            Debugger.logVariable("count", count);

            if (count < MIN_MARSHMALLOWS) {
                Debugger.logError("Недостаточно зефирок");

                throw new NotEnoughMarshmallowsException(
                        "Ты принёс всего " + count + " зефирки(у/ок)! А нужно минимум " + MIN_MARSHMALLOWS + "!\n" +
                                "Подружка расстроена. Встреча отменяется("
                );
            }

            Debugger.log("Проверка успешно пройдена");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Сколько зефирок ты взял для подружки? ");
        int marshmallows = scanner.nextInt();

        Debugger.logVariable("marshmallows (input)", marshmallows);

        try {
            MarshmallowValidator.bringMarshmallows(marshmallows);
            System.out.println("Подружка в восторге! Встреча состоится. Зефирки — идеальный выбор!");
        } catch (NotEnoughMarshmallowsException e) {
            System.out.println("ОЙ-ОЙ:");
            System.out.println(e.getMessage());

            Debugger.printStackTrace(e);
        }

        scanner.close();
        Debugger.log("Программа завершена");
    }
}