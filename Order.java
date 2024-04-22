public class Order {
    int costumerId;
     int OrderId;
   product[]products;
   //for using the methods without inheritance or keyword static
    float totalPrice;
    Order(int OrderId,cart c ){
        this.OrderId=OrderId;
        products=c.products;
    }
    public void setOrderId(int OrderId){
        if (OrderId>0){
           this.OrderId=OrderId;
        }
        else {
            this.OrderId=Math.abs(OrderId);
        }
    }
    public float getTotalPrice(){
        float price = 0;
        for (int i = 0; i < products.length; i++) {
            price += products[i].getPrice();
        }
        return price;
    }

    public  int getOrderId(){
        return OrderId;
    }
    public int getCostumerId(){
        return costumerId;
    }
    public  void PrintOrderinfo (){
        System.out.println("costumerId:"+costumer.getCostumerId());
        System.out.println("OrderId :"+getOrderId());
        System.out.println("products :");
        for (int i = 0 ; i<products.length ; i++){
            System.out.println("product name :"+products[i].getName());
            System.out.println("price :"+products[i].getPrice());
        }
        totalPrice=0;

        for(int i =0 ; i<products.length ;i++){
            totalPrice+=products[i].getPrice();
        }
        System.out.println("total price :"+totalPrice);
    }
}