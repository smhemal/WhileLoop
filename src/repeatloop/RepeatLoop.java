package repeatloop;
//Import APIs needed
import javax.swing.JOptionPane;

public class RepeatLoop {
    public static void main(String[] args) {
        String response;
        do {
            System.out.println("Missle Launched >>>>>>>>> !!!!!");
            response = JOptionPane.showInputDialog(null, "Enamy Stopped? (Y or N)");
        } while (response.equals("N"));
        System.out.println("Enamy Finished");
    }
}
