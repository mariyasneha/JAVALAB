class Product {
    int pcode;
    String pname;
    double price;
}
public class MainProduct {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        
        p1.pcode = 101;
        p1.pname = "Laptop";
        p1.price = 50000;
        
        p2.pcode = 102;
        p2.pname = "Phone";
        p2.price = 20000;
        
        p3.pcode = 103;
        p3.pname = "Headphones";
        p3.price = 1500;
        
        if (p1.price < p2.price && p1.price < p3.price) {
            System.out.println("Product p1 has lowest price");
        }
        else if(p2.price < p1.price && p2.price < p3.price){
            System.out.println("Product p2 has lowest price");
        }
        else{
            System.out.println("Product p3 has lowest price");
        }
    }
}
