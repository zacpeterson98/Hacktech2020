public class Main {
    public static void main(String[] args) {
        ProfileSelection ps = new ProfileSelection();

        for (int i = 0; i < 5; ++i){
            ps.createNewProfile();
        }

        ps.printAllProfiles();
    }
}
