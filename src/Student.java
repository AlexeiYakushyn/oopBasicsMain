/**
 * Created by degget on 29.06.2017.
 */
public class Student extends Teacher {
    private String name;
    private int age;
    static int experiance = 1;
    static int examMark;

    public Student(String name, int age, int experience, int sessionMark) {
        super(name, age, experience, sessionMark);
        ++factGroupVolume;
    }

    void setExamMark() {
        setExamMark(getSessionMark());
    }

    void setExamMark(int examMark){
        getSessionMark();
    }
}

