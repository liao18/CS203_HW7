
/**
 * Each instance of this class describes a periodical that Uncle Phil sells.
 * 
 * @author Jonathan Liao
 * @version 3.1.2015
 */
public class Periodical
{
    private int idNumber;
    private String title;
    private int numInStock;
    private int numSold;
    private double coverPrice;
    private double totalSales;
    
    public void printSummary() {
        System.out.println("IDNumber: " + this.idNumber);
        System.out.println("Title: " + this.title);
        System.out.println("Number in Stock: " + this.numInStock);
        System.out.println("Number Sold: " + this.numSold);
        System.out.println("Cover Price: " + this.coverPrice);
        System.out.println("Total Sales: " + this.totalSales);
    }
    
    public int getId() {
        return idNumber;
    }
    
    public int getNumInStock() {
        return numInStock;
    }
    
    public void sellOneCopy(double price) {
        if(numInStock <= 0) {
            System.out.println("We are out of that copy");
        }
        else {
            totalSales += price;
            numSold++;
            numInStock--;
        }
    }
    
    public double getTotalSales() {
        return totalSales;
    }
    
    public Periodical(int initId, int initStock, String initTitle, double initCoverPrice) {
        idNumber = initId;
        numInStock = initStock;
        title = initTitle;
        coverPrice = initCoverPrice;
    }
}
