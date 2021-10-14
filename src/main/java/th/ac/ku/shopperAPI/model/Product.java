package th.ac.ku.shopperAPI.model;

public class Product {

    private String nameProduct;
    private float price;
    private String size;
    private String category; // หมวดหมู่
    private int quantity;


    public Product(String nameProduct, float price, String size, String category, int quantity) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.size = size;
        this.category = category;
        this.quantity = quantity;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public float getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }


    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", category='" + category + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
