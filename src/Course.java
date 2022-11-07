public class Course {
    private String coursesName, teachersName;
    private Student student;

    public Course(String coursesName, String teachersName, Student student) {
        if (coursesName.length()>=2) {
            this.coursesName = coursesName;
        }else{
            System.out.println("Courses name shoul consist of 2 or more letter!");
        }
        this.teachersName = teachersName;
        this.student = student;
    }

    public String getCoursesName() {
        return coursesName;
    }

    public String getTeachersName() {
        return teachersName;
    }

    public Student getStudent() {
        return student;
    }
}
