 import java.util.Scanner ;
public class EcommerceSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        electronicproducts e = new electronicproducts(1,599.9F,"smartphone","sumsung",1);
        clothingproducts c1 = new clothingproducts();
        c1.setName("T-shirt");
        c1.setProductId(2);
        c1.setPrice(19.99f);
        c1.setSize("medium");
        c1.setFabric("cotton");

        bookproduct b1 = new bookproduct();
        b1.setName("OOP");
        b1.setProductId(3);
        b1.setPrice(39.99f);
        b1.setAuthor("O'Reilly");
        b1.setPublisher("X publications");

        costumer co = new costumer();
        System.out.println("welcom to the E-commerce System");
        System.out.println("plaese enter your Id :");
        int id = input.nextInt();
        co.setCostumerId(id);
        System.out.println("please enter your name :");
        String name = input.next();
        co.setName(name);
        System.out.println("please enter your address :");
        String address = input.next();
        co.setAddress(address);

        System.out.println("how many products you want to add to your cart?");
        int nproducts = input.nextInt();
        cart c = new cart();
        c.setNproducts(nproducts);
        for (int i = 0 ; i<nproducts ;i++){
            System.out.println("which product do you want to add ? 1-smartphone 2-T-shirt 3-OOP");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    c.addProducts(e);
                    break;
                case 2:
                    c.addProducts(c1);
                    break;
                case 3:
                    c.addProducts(b1);
                    break;
            }
        }
        System.out.println("your total price is :"+c.calculatePrice()+" would you like to palce the order? 1-yes 2-no");
        int choice2 = input.nextInt();
        if (choice2==2) {
            System.out.println("do you want to remove any product ?");
            System.out.println("1-yes  2-no");
            int choice3 = input.nextInt();
            if (choice3 == 1) {
                System.out.println("which product do you want to remove ? 1-smartphone 2-t-shirt 3-OOP");
                int choice4 = input.nextInt();
                switch (choice4) {
                    case 1:
                        c.removeproduct(e);
                        break;
                    case 2:
                        c.removeproduct(c1);
                        break;
                    case 3:
                        c.removeproduct(b1);
                        break;
                }
            } else {
                System.out.println("done");
            }
        }

            System.out.println("here is your orders summary :");
            //using order class
                Order order = new Order(9,c);
                order.PrintOrderinfo();


    }
}