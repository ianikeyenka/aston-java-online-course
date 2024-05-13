public class User {
    private final String name;
    private final String surname;
    private final int age;
    private final String phone;

    public User(String name, String surname, int age, String phone) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phone = phone;
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public static class UserBuilder {
        private String name;
        private String surname;
        private int age;
        private String phone;

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            return new User(name, surname, age, phone);
        }
    }
}


