public class Debugger {

    private static boolean debugMode = true; // можно выключить отладку

    // Вывод обычного отладочного сообщения
    public static void log(String message) {
        if (debugMode) {
            System.out.println("[DEBUG] " + message);
        }
    }

    // Вывод значения переменной
    public static void logVariable(String name, Object value) {
        if (debugMode) {
            System.out.println("[DEBUG] " + name + " = " + value);
        }
    }

    // Сообщение об ошибке
    public static void logError(String message) {
        if (debugMode) {
            System.out.println("[ERROR] " + message);
        }
    }

    // Отслеживание стека вызовов
    public static void printStackTrace(Exception e) {
        if (debugMode) {
            System.out.println("[STACK TRACE]");
            e.printStackTrace();
        }
    }
}