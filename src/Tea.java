public class Tea extends Beverage{

    private boolean wantsExtras;
    //------------Boil Water--------------
    @Override
    public void boilWater() {
        System.out.println("Boiling water");
    }
    //------------Pour in cup---------------
    @Override
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
    //------------Add Extras---------------
    @Override
    public void addExtras() {
        System.out.println("Adding sugar and milk");
    }
    //------------Brew-----------------
    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
    }


}
