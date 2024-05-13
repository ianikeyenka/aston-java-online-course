public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

// Not Thread-safe
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

// Thread-safe
//    public static synchronized Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }
}
