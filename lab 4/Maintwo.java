public class Maintwo {
    public static void main(String[] args){}
    String name;
    int age;
    String major;

    public Maintwo() {
        this.name = "Белгісіз";
        this.age = 0;
        this.major = "Белгісіз";
        System.out.println("Әдепкі конструктор шақырылды");
    }
    public Maintwo(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
        System.out.println("Параметрлі конструктор шақырылды");
    }
}
