public class JoggingTrack implements Obstacle{
    int value;

    public JoggingTrack(int value){
        this.value=value;
    }

    public void execute (Actions actions){
        actions.run(value);
    }
}
