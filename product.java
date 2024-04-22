public class product {
    int productId;
     String name ;
   float  price ;
    //remember that the price is float
    public void setPrice(float price) {
        if (price > 0) {
            this.price = price;
        } else {
            this.price = Math.abs(price);
        }
    }
    public void setName(String name){
        this.name = name ;
    }
    public void setProductId(int productId){
        if (productId > 0){
            this.productId=productId;
        }
        else {
            this.productId=Math.abs(productId);
        }
    }
    public int getProductId(){
        return productId;
    }
    public  float getPrice(){
        return price ;
    }
    public  String getName (){
        return name ;
    }
}
