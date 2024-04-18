public class Runner {
    public static void main(String[] args) {
        Cat oldCat = new Cat("Pedro", 15, "Likes to sleep");
        oldCat.setAge(-2);
        oldCat.setHabit(null);
        System.out.println(oldCat);

        ClassLoader classLoader = Cat.class.getClassLoader();
        System.out.println("Get ClassLoader: " + classLoader.toString());

        System.out.println("Get Class name: " + oldCat.getClass().getName());
    }
}
