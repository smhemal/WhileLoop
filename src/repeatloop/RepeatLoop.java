package repeatloop;
//Import APIs needed
import javax.swing.JOptionPane;

public class RepeatLoop {
    public static void main(String[] args) {
        String response;
        do {
            JOptionPane.showMessageDialog(null, 
                    " Missile Launched >>>>>>>>> !!!!!","Alert",
                    JOptionPane.WARNING_MESSAGE );
            response = JOptionPane.showInputDialog(null, "Enamy Stopped? (Y or N)");
        } while (response.equals("N"));
        JOptionPane.showMessageDialog(null,"Enamy Finished");
        System.out.println("Enamy Finished");
    }
}
