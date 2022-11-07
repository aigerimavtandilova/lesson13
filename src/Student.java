public class Student {
    private String name;
    private int age, typing;

    public Student(String name, int age, int typing) {

        this.name = name;
        if (age>16){
            this.age = age;
        }else {
            System.out.println(name+"- okuuga mumkunchulugu jok!");
        }

        this.typing = typing;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getTyping() {
        return typing;
    }
}