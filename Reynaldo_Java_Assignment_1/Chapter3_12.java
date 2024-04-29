
public class Chapter3_12 {
    public static void main(String[] args) {
        
        Invoice invoice = new Invoice("c-1025", "Cutter", 15, 10.50);
        System.out.println();

        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price Per Item: " + invoice.getPrice());

        System.out.println();
        System.out.println("Invoice Amount: $" + invoice.getInvoiceAmount());
        
    }
}
