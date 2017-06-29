/**
 * Created by degget on 29.06.2017.
 */
public class LabourGroup {


        String groupName = "Hillel Java group";
        private int groupRoominess = 15;
        static int factGroupVolume = 0;

        void groupInfo(){
            System.out.println("Hillel Java group Roominess " + groupRoominess + "students");
            System.out.println("Hillel Java group accommodates " + factGroupVolume);
        }

        void printGroupName(){
            System.out.println("Group name is " + groupName);
        }

    }


