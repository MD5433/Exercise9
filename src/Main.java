public class Main {
    public static void main(String[] args) {
        ToEmail emailing1 = new ToEmail("Mariah", "nightcore.addiction01@gmail.com.");
        ToCall calling1 = new ToCall("M'cole",6145998751L);

        emailing1.contact();
        calling1.contact();


    }
}