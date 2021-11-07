public class Robot implements Actions {
    String name;
    int limitRun;
    int limitJump;
    public Robot (String name,int limitRun,int limitJump){
        this.name=name;
        this.limitRun=limitRun;
        this.limitJump=limitJump;
    }

    public void run(){
        System.out.println("Робот умеет бегать \n");
    }

    public void jump(){
        System.out.println("Робот умеет прыгать \n");
    }

}
