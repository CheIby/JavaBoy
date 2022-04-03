package Week6;

public class Pro2_64010845 {
    public static void main(String[] args) {
        Course course = new Course("Test");
        course.addStudent("oot");
        course.addStudent("aaa");
        course.addStudent("bbb");
        course.addStudent("ccc");
        course.addStudent("ddd");
        course.addStudent("eee");
        course.addStudent("fff");
        course.addStudent("ggg");
        course.dropStudent("eee");
        course.dropStudent("oot");
        System.out.println(course.getCount());
        for (int i = 0; i < course.getCount(); i++) {
            System.out.println(course.getName()[i]);
        }
        course.clear();
        for (int i = 0; i < course.getCount(); i++) {
            System.out.println(course.getName()[i]);
        }
    }
}

class Course {
    private String[] student;
    private int countStudent = 0;
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
        this.student = new String[3];
        this.countStudent = 0;
    }

    public void addStudent(String name) {
        if (countStudent >= this.student.length) {
            String[] temp = new String[student.length * 2];
            System.arraycopy(student, 0, temp, 0, student.length);
            this.student = temp;
        }
        this.student[countStudent++] = name;
    }

    public void dropStudent(String name) {
        for (int i = 0; i < countStudent; i++) {
            if (student[i].equals(name)) {
                System.arraycopy(student, i + 1, student, i, student.length - i - 1);
                student[countStudent - i] = null;
                break;
            }
        }
        this.countStudent--;
    }

    public void clear() {
        this.student = new String[3];
        this.countStudent = 0;
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getName() {
        return this.student;
    }

    public int getCount() {
        return this.countStudent;
    }
}