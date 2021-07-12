public class BookApplication {
    public static void main(String[] args){
        //printing using setter and get_display_text
        Book harry_potter = new Book();
        harry_potter.set_author("J.K. Rowling");
        harry_potter.set_title("Harry Potter and the Philosopher's Stone");
        harry_potter.set_description("Harry Potter goes to wizard school and does stuff");
        harry_potter.set_price(20.00);
        harry_potter.set_is_in_stock(false);

        //printing assigning values and printing using overloaded constructor
        Book lord_of_the_rings = new Book("J.R.R Tolkien", "Lord of the Rings: The Fellowship of the ring", "There is this ring and stuff happens", 20.00, true);


        double lotr_cost = lord_of_the_rings.pricing(5);
        if (lotr_cost != 0) {
            System.out.println("Cost of 5 Lord of the Rings books: $" + lord_of_the_rings.pricing(5));
        }

        double hp_cost = harry_potter.pricing(10);
        if (hp_cost != 0) {
            System.out.println("Cost of 10 Harry Potter books: $" + lord_of_the_rings.pricing(10));
        }
    }
}