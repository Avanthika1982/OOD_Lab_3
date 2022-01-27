package facade;

public class BeverageMaker {
    private Coffe coffe;
    private Tea tea;

    public BeverageMaker() {
        this.coffe = new Coffe();
        this.tea = new Tea();
    }

    public void makeCoffe() {
        coffe.make();
    }
    public void makeTea() {
        tea.make();
    }
}
