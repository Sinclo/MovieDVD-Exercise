
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jordan
 */
public class MovieDVD extends Disc
{
    String format;
    int runTime;
    boolean newRelease;
    
    public MovieDVD(String sku, String title, float price, boolean u, String format, int time, boolean nr)
    {
        MovieDVD(sku, title, price, u);
        this.format = format;
        this.runTime = time;
        this.newRelease = nr;
    }
    
    public String getFormat()
    {
        return format;
    }
    
    public void setFormat(String format)
    {
        this.format = format;
    }
    
    public int getRunTime()
    {
        return runTime;
    }
    
    public void setFormat(int time)
    {
        this.runTime = time;
    }
    
    public boolean getNewRelease()
    {
        return newRelease;
    }
    
    public void setNewRelease(boolean nr)
    {
        this.newRelease = nr;
    }

    @Override
    public String readDiscInfo() 
    {
         Driver discInfo = new Driver();
         DecimalFormat dollar = new DecimalFormat("$#,##0.00"); // Set currency format
         String release;
         String condition;
         
         
         if (this.getNewRelease() == false)
         {
             release = "";
         }
         else
         {
             release = "\nNew Release!";
         }
         
         if(this.getUsed() == false)
         {
             condition = "used";
         }
         else
         {
             condition = "new";
         }
            JOptionPane.showMessageDialog(null, "Movie DVD \n\n" + // Displays output
                  "SKU: "+ getSKU() + "\n" + 
                  getTitle() + " (" + getFormat() + ")" + "\n" + 
                  getRunTime() + " minutes" +
                  release + 
                  "\nBuy " + condition + " for " + dollar.format(getPrice()));
            
           return null;
    }
}
