package entities;

public class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // set
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // get

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getData() {
        return "Seu nome é " + name + " e você tem " + age + " anos";
    }

}
