
    /**
 *
 * @author Jordan Sinclair
 * Superclass
 */
public abstract class Disc
{
    // ***** Instance Variables *****
    private String sku;
    private String title;
    private float price;
    private boolean used;

    // ***** Static Variable *****
    private static int count;

    // ***** 4-variable Constructors *****
    public void MovieDVD(String sku, String title, float price, boolean u)
    {
        this.sku = sku;
        this.title = title;
        this.price = price;
        used = u;
    } 

    public Disc()
    {
        sku = "00000";
        title = "Generic Disc";
        price = 0.0f;
        used = false;
    }
    
    // ***** Abstract Method *****
    public abstract String readDiscInfo();
    
    // ***** Static Methods *****
    public static void incrCount()
    {
        count++;
    }

    public static int readCount()
    {
        return count;
    }
    
    // ***** Getters and Setters *****
    public String getSKU()
    {
        return sku;
    }

    public void setSKU(String sku)
    {
        this.sku = sku;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(float price)
    {
        this.price = price;
    }

    public boolean getUsed()
    {
        return used;
    }

    public void setUsed(boolean u)
    {
        used = u;
    }
}
