package rule.dependReverse;

public class Test {
    public static void main(String[] args) {
        Tom tom = new Tom();
        tom.setCourse(new JavaCourse());
        tom.study();
        tom.setCourse(new PythonCourse());
        tom.study();
    }
}
