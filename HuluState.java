package StateDesignPattern;

public class HuluState implements State {
    private TV tv;

    @Override
    public void pressHomebutton() {
        System.out.println("Loading Home Screen...");
        tv.setState(tv.getHomeState());
        
    }

    @Override
    public void pressNetflixButton() {
        System.out.println("Loading Netflix...");
        tv.setState(tv.getNetflixState());
    }

    @Override
    public void pressHuluButton() {
        System.out.println("TV is already on Hulu");
        
    }

    @Override
    public void pressMovieButton() {
        System.out.println("Loading Home Screen...");
        tv.setState(tv.getHomeState());
        
    }

    @Override
    public void pressTVButton() {
        System.out.println("Loading Home Screen...");
        tv.setState(tv.getHomeState());
        
    }
    
}
