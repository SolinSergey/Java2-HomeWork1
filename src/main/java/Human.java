public class Human implements Actions{

    String name;
    int limitRun;
    int limitJump;
    public Human (String name,int limitRun,int limitJump){
        this.name=name;
        this.limitRun=limitRun;
        this.limitJump=limitJump;
    }

    public void run() {
        System.out.println("Человек умеет бегать \n");
    }

    public void jump() {
        System.out.println("Человек умеет прыгать \n");
    }
}
