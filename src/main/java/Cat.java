public class Cat implements Actions {
    String name;
    int limitRun;
    int limitJump;
    public Cat (String name,int limitRun,int limitJump){
        this.name=name;
        this.limitRun=limitRun;
        this.limitJump=limitJump;
    }
    public void run() {
        System.out.println("Кот умеет бегать \n");
    }

    public void jump() {
        System.out.println("Кот умеет прыгать \n");
    }
}
