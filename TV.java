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
        state.pressHomebutton();
    }

    public void pressNetflixButton(){
        state.pressHomebutton();
    }

    public void pressHuluButton(){
        state.pressHuluButton();
    }

    public void pressMovieButton(){
        state.pressHomebutton();
    }

    public void pressTVButton(){
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
