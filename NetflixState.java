package StateDesignPattern;

public class NetflixState implements State {
    private TV tv;

    @Override
    public void pressHomebutton() {
        System.out.println("Loading the Home Screen...");
        tv.setState(tv.getHomeState());
        
    }

    @Override
    public void pressNetflixButton() {
        System.out.println("TV is already on Netflix");
        
    }

    @Override
    public void pressHuluButton() {
        System.out.println("Loading Hulu...");
        tv.setState(tv.getHuluState());

        
    }

    @Override
    public void pressMovieButton() {
        System.out.println("Loading the Home Screen...");
        tv.setState(tv.getHomeState());
    }

    @Override
    public void pressTVButton() {
        System.out.println("Loading the Home Screen...");
        tv.setState(tv.getHomeState());
    }
    
}
