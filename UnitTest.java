public class UnitTest {
    public static void main(String[] args) {
        
        //Testing constructors
        Customer Joe = new Customer("Joe", 8, true, true);
        Customer Ryan = new Customer("Ryan", 12, false, false);
        Customer Sam = new Customer("Sam", 10, false, true);
        Customer Xian = new Customer("Xian", 5, true, false);
        
        Periodical NYT = new Periodical(1, 5, "New York Times", 3.75);
        Periodical RT = new Periodical(2, 5, "Russia Today", 8.95);
        Periodical TOR = new Periodical(3, 12, "The Oregonian", 1.25);
        Periodical TWP = new Periodical(4, 3, "The Washington Post", 5.45);
        Periodical LPR = new Periodical(5, 2, "Local Post Record", 2.50);
        Periodical ADP = new Periodical(6, 99, "Adam's Daily Patriarchy", 9.75);
        
        //Testing methods
            //customers
        Joe.printSummary();
        Sam.printSummary();
        Xian.printSummary();
        
        System.out.println("Ryan visits daily? " + Ryan.isDaily());
        
        Ryan.fillDescription("He's tall and likes his newspaper quickly");
        System.out.println("Ryan's description: " + Ryan.getDescription());
        Ryan.setVisitTime(19);
        Ryan.printSummary();
        
        System.out.println();
        
            //periodicals
        System.out.println("New York Times Paper ID: " + NYT.getId());
        System.out.println("We have this many Russia Today newspapers in stock: " + RT.getNumInStock());
        
        RT.sellOneCopy(1.25);  
        System.out.println("We now have this many Russia Today newspapers in stock: " + RT.getNumInStock());
        System.out.println("We have made $" + RT.getTotalSales() + " in RT newspapers.");
        
    }
}