public class Main {
    private boolean brainActive = false;

    public void startCoding() throws BrainNotFoundException {
        if (!brainActive) {
            throw new BrainNotFoundException();
        }
        System.out.println("💻 Код пишется... вроде бы осмысленно!");
    }

    public void rebootBrain() {
        System.out.println("🔄 Перезагрузка мозга...");
        brainActive = true;
        System.out.println("✅ Мозг снова в сети!");
    }

    public static void main(String[] args) {
        Main dev = new Main();
        try {
            dev.startCoding();
        } catch (BrainNotFoundException e) {
            System.out.println(e.getMessage());
            dev.rebootBrain();
            try {
                dev.startCoding();
            } catch (BrainNotFoundException ignored) {}
        }
    }
}

class BrainNotFoundException extends Exception {
    public BrainNotFoundException() {
        super("""
              🧠 Кажется, мозг временно отключился.
              Попробуйте перезапустить разработчика или дать ему кофе.
              """);
    }

    public BrainNotFoundException(String details) {
        super("🧠 " + details);
    }
}

