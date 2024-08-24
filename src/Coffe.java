public class Coffe extends Beverage{
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
        System.out.println("Adding vanilla syrup");
    }
    //------------Brew-----------------
    @Override
    public void brew() {
        System.out.println("Dripping coffee through filter");
    }
    //---------Add Condiments-------------
    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
    // ----------sets  Wants Extras-------------

}
