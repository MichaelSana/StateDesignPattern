package StateDesignPattern;

public class TV {
    private State HomeState;
    private State NetflixState;
    private State HuluState;
    private State state;

    public TV(){
        HomeState = new HomeState();
        NetflixState = new NetflixState();
        HuluState = new HuluState();
    }

    public void pressHomeButton(){
        state = new HomeState();
        state.pressHomebutton();
    }

    public void pressNetflixButton(){
        state = new NetflixState();
        state.pressNetflixButton();
        
    }

    public void pressHuluButton(){
        state = new HuluState();
        state.pressHuluButton();
    }

    public void pressMovieButton(){
        state = new HomeState();
        state.pressHomebutton();
    }

    public void pressTVButton(){
        state = new HomeState();
        state.pressHomebutton();
    }

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
