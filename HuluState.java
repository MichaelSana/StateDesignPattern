package StateDesignPattern;

public class HuluState implements State {
    private TV tv;

    @Override
    public void pressHomebutton() {
        System.out.println("Loading Home Screen...\n");
        tv.setState(tv.getHomeState());
        
    }

    @Override
    public void pressNetflixButton() {
        System.out.println("Loading Netflix...\n");
        tv.setState(tv.getNetflixState());
    }

    @Override
    public void pressHuluButton() {
        System.out.println("TV is already on Hulu\n");
        
    }

    @Override
    public void pressMovieButton() {
        System.out.println("Hulu Movies:\n- Cars\n - Cinderella\n- Wall-E\n- ET\n");
        
    }

    @Override
    public void pressTVButton() {
        System.out.println("Hulu TV Shows:\n- sesame street\n- care bears\n- loney tunes\n");
        
    }
    
}
