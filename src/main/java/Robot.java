public class Robot implements Actions,IParticipant {
    String name;
    int limitRun;
    int limitJump;
    public Robot (String name,int limitRun,int limitJump){
        this.name=name;
        this.limitRun=limitRun;
        this.limitJump=limitJump;
    }

    public void run(int distance){
        System.out.println("Робот пробежал" + distance);
    }

    public void jump(){
        System.out.println("Робот умеет прыгать \n");
    }

}
