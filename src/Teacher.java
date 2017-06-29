/**
 * Created by degget on 29.06.2017.
 */
public class Teacher extends Human {
    private String name;
    private int age;
    static int experiance = 2;
    private int sessionMark;

    public Teacher(String name, int age, int experience, int sessionMark) {
        super(name, age, experience);
        this.sessionMark = sessionMark;
        ++factGroupVolume;
    }

    public int getSessionMark() {
        return sessionMark;
    }
}
