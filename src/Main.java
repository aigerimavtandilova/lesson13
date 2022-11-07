public class Main {
    public static void main(String[] args) {
        Student student=new Student("Aigul",18,33);
        Student student1=new Student("Bakyt",25,88);
        Course course=new Course("Java","Aizhamal",student);
        Course course1=new Course("JS","Maksat",student1);

        System.out.println(student.getName()+"\n"+student.getAge()+"\n"+student.getTyping());
        System.out.println(student1.getName()+"\n"+student1.getAge()+"\n"+student1.getTyping());
        System.out.println(course.getCoursesName()+"\n"+course.getTeachersName()+"\n"+course.getStudent().getName());
        System.out.println(course1.getCoursesName()+"\n"+course1.getTeachersName()+"\n"+course1.getStudent().getName());




    }
}