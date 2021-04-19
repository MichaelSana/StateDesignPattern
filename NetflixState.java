package StateDesignPattern;

public class NetflixState implements State {
    private TV tv;

    @Override
    public void pressHomebutton() {
        System.out.println("Loading the Home Screen...\n");
        tv.setState(tv.getHomeState());
        
    }

    @Override
    public void pressNetflixButton() {
        System.out.println("TV is already on Netflix\n");
        
    }

    @Override
    public void pressHuluButton() {
        System.out.println("Loading Hulu...\n");
        tv.setState(tv.getHuluState());

        
    }

    @Override
    public void pressMovieButton() {
        System.out.println("Netflix Movies:\n - The Land Before Time\n - Frozen\n- The Little Mermaid\n- Ice Age\n");
        
    }

    @Override
    public void pressTVButton() {
        System.out.println("Netflix TV Shows:\n - Peppa Pig\n- My Little Pony\n- Garfield\n- Teenage Mutant Ninja Turtles\n");
    }
    
}
