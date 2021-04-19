package StateDesignPattern;
/**
 * The main TV class
 * @author Michael Sana
 */
public class TV {
    private State HomeState;
    private State NetflixState;
    private State HuluState;
    private State state;

    //Initialized each of the states and sets the default state to the home screen
    public TV(){
        HomeState = new HomeState(this);
        NetflixState = new NetflixState(this);
        HuluState = new HuluState(this);
        state = getHomeState();
    }

    //initialzies the press home button action
    public void pressHomeButton(){
        state.pressHomebutton();
    }

    //initializes the press netflix button action
    public void pressNetflixButton(){
        state.pressNetflixButton();
        
    }

    //initializes the press hulu button action
    public void pressHuluButton(){
        state.pressHuluButton();
        
    }

    //initializes the press Movie button action
    public void pressMovieButton(){
        state.pressMovieButton();
    }

    //initializes the press TV button action
    public void pressTVButton(){
        state.pressTVButton();
    }

    //sets the state
    public State setState(State state){
        this.state = state;
        return state;
    }
    
    public State getHomeState(){
        return HomeState;
    }

    public State getNetflixState(){
        return NetflixState;
    }

    public State getHuluState(){
        return HuluState;
    }
}
