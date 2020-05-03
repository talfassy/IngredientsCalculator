package com.first.conversion;

public class Product_item {

    private String productName;
    private int productImage;

    public Product_item(String name, int image){
        this.productName = name;
        this.productImage=image;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }
}
