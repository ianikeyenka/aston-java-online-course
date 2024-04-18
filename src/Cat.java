public class Cat {
    private String name;
    private int age;
    private String habit;

    public Cat(String name, int age, String habit) {
        this.name = name;
        this.age = age;
        this.habit = habit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Exception: Name should not be empty!");
            return;
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Exception: Age should not be negative!");
            return;
        }
        this.age = age;
    }

    public String getHabit() {
        return habit;
    }

    public void setHabit(String habit) {
        if (habit == null || habit.isEmpty()) {
            System.out.println("Exception: habit should not be empty!");
            return;
        }
        this.habit = habit;
    }

    @Override
    public String toString() {
        return name + ";" + age + ";" + habit;
    }
}
