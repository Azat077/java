public class main {


    static class Student {
        String name;
        int age;
        String major;


        Student() {
            name = "Белгісіз";
            age = 0;
            major = "Белгісіз";
            System.out.println("Әдепкі конструктор шақырылды");
        }

        Student(String name, int age, String major) {
            this.name = name;
            this.age = age;
            this.major = major;
            System.out.println("Параметрлі конструктор шақырылды");
        }

        void showInfo() {
            System.out.println("Аты: " + name);
            System.out.println("Жасы: " + age);
            System.out.println("Мамандығы: " + major);
            System.out.println("------------------");
        }

        void changeMajor(String newMajor) {
            this.major = newMajor;
        }

        void increaseAge() {
            this.age++;
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.showInfo();

        Student s2 = new Student("Азат", 19, "Информатика");
        Student s3 = new Student("Рома", 18, "Математика");

        s2.showInfo();
        s3.showInfo();

        s2.changeMajor("Бағдарламалау");
        s2.increaseAge();

        System.out.println("Өзгертілген студент:");
        s2.showInfo();
    }
}
