import javax.swing.JOptionPane;

public class Driver
{
    public static void main(String[] args)
    {
        String title = "Disc Info";

        Disc[] discs = new Disc[3];
        discs[0] = new MovieDVD("16005", "The Raid - Redemption", 15.99f, false,
                "DVD", 100, false);
        Disc.incrCount();

        discs[1] = new MovieDVD("09481", "Kungfu Panda", 12.99f, true,
                "Blue-Ray", 92, false);
        Disc.incrCount();

        discs[2] = new MovieDVD("25120", "Guardians of the Galaxy", 24.96f,
                false, "3D Blue-Ray", 121, true);
        Disc.incrCount();

        String discInfo = "";
        
/** Currently trying to figure out a solution to add a title for the message 
 * window that displays in the for loop.
 */
        for (int i = 0; i < discs.length; i++)
        {
            discInfo = discs[i].readDiscInfo();
/**
 * Currently have an issue where this portion pulls up a second blank window,
 * under the for loop with the String title "Disc Info".  
 * Have not yet figured out how to pull this title under the same window as 
 * where "discInfo" is mentioned.
 * 
            JOptionPane.showMessageDialog(null,
                discInfo, title,
                JOptionPane.INFORMATION_MESSAGE);
*/
        }
        
        JOptionPane.showMessageDialog(null,
            Disc.readCount() + " discs displayed.", title,
            JOptionPane.INFORMATION_MESSAGE);
    } 
}
