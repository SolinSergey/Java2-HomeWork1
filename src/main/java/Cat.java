public class Cat implements Actions,IParticipant {
    String name;
    int limitRun;
    int limitJump;
    public Cat (String name,int limitRun,int limitJump){
        this.name=name;
        this.limitRun=limitRun;
        this.limitJump=limitJump;
    }
    public void run(int distance) {
        System.out.println("Кот пробежал " + distance);
    }

    public void jump() {
        System.out.println("Кот умеет прыгать \n");
    }
}
