/**
 * Created by degget on 29.06.2017.
 */
public class Human extends LabourGroup {
    private String name;
    private int age;
    static int experience = 0;

    public Human(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        ++factGroupVolume;
    }

    void humanInfo() {
        System.out.println("Human name is " + name);
        System.out.println("Human age is " + age);
        System.out.println("Human experience is " + experience);
    }

    @Override
    void printGroupName() {
        super.printGroupName();
    }

    void printExp(){
        System.out.println("Human experience is " + experience);
    }
}
