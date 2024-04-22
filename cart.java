public class cart {
    protected static int nproducts;
   protected  product[] products ;
    protected int costumerId ;


    public void setCostumerId(int costumerId) {
        this.costumerId=costumerId;
    }
    public void setNproducts(int nproducts) {
        System.out.println("the number of products are set successfully ");
        this.nproducts = nproducts;
        products=new product[nproducts];
    }
    public void addProducts(product p) {

        for (int i = 0; i < products.length ; i++) {
            if (products[i]==null)
                products[i] = p;
        }
    }

    public int getCostumerId() {
        return costumerId;
    }


    //remember i need a scanner for adding

    public product [] removeproduct (product p){
        product [] newarr = new product[nproducts-1];
        for (int i =0 ; i<products.length ; i++){
            if (products[i]!= null &&products[i]==p){
                continue ;
            }
            else {
                System.out.println("there are no products ");
            }
            for(int j =0 ;j<products.length-1 ; j++){
                newarr[j]=products[i];
                j++;
            }

        }
        return newarr ;
    }
    public  float calculatePrice() {
        float price = 0;
        for (int i = 0; i < products.length; i++) {
           price += products[i].getPrice();
        }
        return price;
    }
}
