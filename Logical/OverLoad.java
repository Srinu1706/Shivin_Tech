package Logical;
public class OverLoad {
    public static void main(String[] args) {
        System.out.println("hello from main methode");
        OverLoad overLoad = new OverLoad();
        overLoad.main();
    }
    public  void main() {
        System.out.println("hello from overloaded methode");
    }
}
