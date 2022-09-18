public class Main {
    
    public static void main(String[] args) {

        double ITEM = 20;
        double TAX = .05;
        double calctax, totalprice;



        calctax = ITEM * TAX;

        totalprice = ITEM + calctax;

        System.out.println("The price of the item is: " + ITEM);
        System.out.println("The tax of the item is: " + TAX);
        System.out.println("The total price of the item with tax is: " + totalprice);


    }

}