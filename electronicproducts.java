public class electronicproducts extends product {
    protected String brand ;
    protected int warrantyPeriod;
electronicproducts(int productid,float price,String name,String barnd ,int warrantyPeriod){
    productid=productId;
    this.price = price ;
    this.name = name ;
    this.brand = brand ;
    this.warrantyPeriod=warrantyPeriod;
}
    public void setBrand(String brand){
        this.brand = brand ;
    }
    public void setWarrantyPeriod(int warrantyPeriod){
        if (warrantyPeriod>0){
            this.warrantyPeriod=warrantyPeriod;
        }
        else {
            this.warrantyPeriod=Math.abs(warrantyPeriod);
        }
    }
    public int getWarrantyPeriod(){
       return warrantyPeriod;
    }
    public String getBrand(){
        return brand;
    }
}
