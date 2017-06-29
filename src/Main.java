/**
 * Created by degget on 29.06.2017.
 */
public class Main {
    public static void main(String[] args) {

        LabourGroup group = new LabourGroup();
        group.printGroupName();
        System.out.println();

        Human man1 = new Student("Piter", 20,0,5);
        man1.humanInfo();
        System.out.println();

        Human man2 = new Student("John",25,3,6);
        man2.printExp();
        System.out.println();

        Human teach = new Teacher("Poligraf",40,20,12);
        teach.groupInfo();
        System.out.println();

        group.groupInfo();
        System.out.println();
    }
}
