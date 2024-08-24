public abstract class Beverage {
    public abstract void boilWater();
    public abstract void pourInCup();
    public abstract void addExtras();
    public abstract void brew();
    public abstract void addCondiments();
    private boolean wantsExtras;
    public  void setWantsExtras(boolean wantsExtras){
        this.wantsExtras=wantsExtras;
    }
    public  void finalTemplateMethod(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if(wantsExtras) {
            addExtras();
        }
    }
}
