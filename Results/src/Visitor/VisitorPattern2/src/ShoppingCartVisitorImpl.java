public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    @Override
    public double visit(Book book) {
        //free $5 off coupon in weekly ad!
        double cost = book.getPrice() - 5;
        cost = Math.round(cost*100.0)/100.0;
        System.out.println("Book: " + book.getTitle() + ", cost = $" + cost);
        return cost;
    }

    @Override
    public double visit(Fruit fruit) {
        double cost = fruit.getPricePerlb() * fruit.getWeight();
        cost = Math.round(cost*100.0)/100.0;
        System.out.println(fruit.getName() + ", cost = $" + cost);
        return cost;
    }
}