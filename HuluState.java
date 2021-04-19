package StateDesignPattern;
/**
 * The main hulu state class
 * @author Michael Sana
 * @implements State
 */
public class HuluState implements State {
    private TV tv;
    /**
     * sets the tv to the current tv
     * @param tv
     */
    public HuluState(TV tv){
        this.tv=tv;
    }

    //does the home button action
    @Override
    public void pressHomebutton() {
        System.out.println("Loading Home Screen...\n");
        tv.setState(tv.getHomeState());
        
    }

    // does the netflix button action
    @Override
    public void pressNetflixButton() {
        System.out.println("Loading Netflix...\n");
        tv.setState(tv.getNetflixState());
    }

    //does the hulu button action
    @Override
    public void pressHuluButton() {
        System.out.println("TV is already on Hulu\n");
        
    }

    //does the movie button action
    @Override
    public void pressMovieButton() {
        System.out.println("Hulu Movies:\n- Cars\n- Cinderella\n- Wall-E\n- ET\n");
        
    }

    //does the tv button action
    @Override
    public void pressTVButton() {
        System.out.println("Hulu TV Shows:\n- sesame street\n- care bears\n- loney tunes\n");
        
    }
    
}
