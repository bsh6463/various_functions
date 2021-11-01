package decorator;

public abstract class Decorator extends Coffee{

    Coffee coffee;
    public Decorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override //데코레이터가 하는 일
    public void brewing() {
        coffee.brewing();
    }
}
