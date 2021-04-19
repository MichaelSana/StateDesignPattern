package StateDesignPattern;
/**
 * The main NetflixState class
 * @author Michael Sana
 * @implements State
 */
public class NetflixState implements State {
    private TV tv;
    /**
     * Sets the tv to the current tv
     * @param tv
     */
    public NetflixState (TV tv){
        this.tv = tv;
    }
   
    //does the home button action
    @Override
    public void pressHomebutton() {
        System.out.println("Loading the Home Screen...\n");
        tv.setState(tv.getHomeState());
        
    }

    // does the netflix button action
    @Override
    public void pressNetflixButton() {
        System.out.println("TV is already on Netflix\n");
        
    }

    //does the hulu button action
    @Override
    public void pressHuluButton() {
        System.out.println("Loading Hulu...\n");
        tv.setState(tv.getHuluState());

        
    }

    //does the movie button action
    @Override
    public void pressMovieButton() {
        System.out.println("Netflix Movies:\n - The Land Before Time\n - Frozen\n- The Little Mermaid\n- Ice Age\n");
        
    }

    //does the tv button action
    @Override
    public void pressTVButton() {
        System.out.println("Netflix TV Shows:\n- Peppa Pig\n- My Little Pony\n- Garfield\n- Teenage Mutant Ninja Turtles\n");
    }
    
}
