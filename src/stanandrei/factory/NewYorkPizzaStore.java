package stanandrei.factory;

public class NewYorkPizzaStore extends PizzaStore {
    protected Pizza createPizza() {
        return new CheesePizza();
    }
}