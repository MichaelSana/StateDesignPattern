package StateDesignPattern;
/**
 * The main class for the Home State
 * @author Michael Sana
 * @implements State
 */
public class HomeState implements State {
    private TV tv;
    /**
     * Sets the tv to the current tv
     * @param tv
     */
    public HomeState(TV tv){
        this.tv = tv;
    }

    //does the home button action
    @Override
    public void pressHomebutton() {
        System.out.println("TV is already on the home screen\n");
        
    }

    //does the netflix button action
    @Override
    public void pressNetflixButton() {
        System.out.println("Loading Netflix...\n");
        tv.setState(tv.getNetflixState());
        
    }

    //does the hulu button action
    @Override
    public void pressHuluButton() {
        System.out.println("Loading Hulu...");
        tv.setState(tv.getHuluState());
        
    }

    //does the movie button action
    @Override
    public void pressMovieButton() {
        System.out.println("Loading Home Screen...");
    }

    //dpoes the tv button action
    @Override
    public void pressTVButton() {
        System.out.println("Loading Home Screen...");
    }

 
    
}
