import Item.Perishable;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

//TODO: Read files and save files
public class ProfileSelection {
    public ArrayList<Profile>profiles;
    Profile activeprofile;

    public ProfileSelection(){
        profiles = new ArrayList<>();
    }

    public void createNewProfile(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = input.nextLine();

        Profile newProfile = new Profile(name);
        profiles.add(newProfile);
        activeprofile = newProfile;

        // Testing only, delete in final
//        for (int i = 0; i < 3; ++i){
//            newProfile.addIngredient();
//        }
    }

    public void setActiveprofile(Profile activeprofile) {
        this.activeprofile = activeprofile;
    }

    public void setActiveprofile(int profileNumber) {
        this.activeprofile = profiles.get(profileNumber);
    }

    public Profile getActiveprofile() {
        return activeprofile;
    }

    @Override
    public String toString() {
        return "Active profile: " + activeprofile.getName();
    }

    public void printAllProfiles(){
        for (Profile i: profiles){
            System.out.println(i.toString());
        }
    }

//    public void saveProfiles(){
//        for (Profile i: profiles){
//            FileOutputStream fOut = new FileOutputStream("./Saves/profiles" + i.getName() + ".dat");
//        }
//    }
}
