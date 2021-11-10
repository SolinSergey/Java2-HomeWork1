public class Wall implements Obstacle{
    public int value;

    public Wall (int value){
        this.value=value;
    }
    public void execute (Actions actions){
        actions.jump(value);
    }

}
