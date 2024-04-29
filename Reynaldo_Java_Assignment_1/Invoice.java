
public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    // constructor
    public Invoice (String partNumber, String partDescription, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = (quantity > 0) ? quantity : 0; 
        this.price = (price > 0.0) ? price : 0.0; 
    }
   
    // set methods for instance variables
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }
    public void setQuantity(int quantity) {
        this.quantity = (quantity > 0) ? quantity : 0; 
    }
    public void setPricePerItem(double price) {
        this.price = (price > 0.0) ? price : 0.0; 
    }

    // get methods for instance variables
    public String getPartNumber() {
        return partNumber;
    }
    public String getPartDescription() {
        return partDescription;
    }    
    public int getQuantity() {
        return quantity;
    }
    public double getPrice() {
        return price;
    }

    // calculating invoice amount
    public double getInvoiceAmount() {
        return quantity * price;
    }
}