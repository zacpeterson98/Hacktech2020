public class Main {
    public static void main(String[] args) {

    }

    //Delete in final release
    public static void testProfileSelection(){
        ProfileSelection ps = new ProfileSelection();

        for (int i = 0; i < 2; ++i){
            ps.createNewProfile();
        }
        ps.printAllProfiles();

    }
}
