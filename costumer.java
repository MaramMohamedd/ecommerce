public class costumer {
    protected static int costumerId;
    protected String name ;
    protected String address;
    public void setCostumerId(int costumerId){
        if (costumerId>0){
            this.costumerId=costumerId ;
        }
        else{
            this.costumerId=Math.abs(costumerId);
        }
    }
    public void setName(String name){
        this.name = name ;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public static int getCostumerId(){
        return costumerId;
    }
    public String getName(){
        return name ;
    }
    public String getAddress(){
        return address;
    }
}
