public class Mainthree {
    String name;
    int age;
    String major;

    public Mainthree(String name, int age, String major) {
        this.name = name;   // this.name — класс өрісі, ал name — параметр
        this.age = age;
        this.major = major;
    }

    public void showInfo() {
        System.out.println("Аты: " + name);
        System.out.println("Жасы: " + age);
        System.out.println("Мамандығы: " + major);
    }

    public static void main(String[] args) {
        Mainthree s = new Mainthree("Айбек", 20, "Информатика");
        s.showInfo();
    }
}