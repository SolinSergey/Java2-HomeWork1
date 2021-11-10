public class Human implements Actions{
    String name;
    public int limitRun;
    public int limitJump;
    public boolean stopStatus=false;
    public Human (String name,int limitRun,int limitJump){
        this.name=name;
        this.limitRun=limitRun;
        this.limitJump=limitJump;
    }
    public void run(int distance) {
        if (distance <= limitRun){
            System.out.println("Человек " + name + " пробежал " + distance + " метров");
            return;
        }
        else{
            System.out.println("Человек "+ name + " не может пробежать дистанцию " + distance + " метров");
            stopStatus=true;
        }

    }

    public void jump(int height) {
        if (height <= limitJump){
            System.out.println("Человек " + name + " прыгнул через стену высотой " + height + " метров");
            return;
        }
        else{
            System.out.println("Человек "+ name + " не может прыгать через стены высотой " + height + " метров");
            stopStatus=true;
        }
    }
    public boolean getStopStatus (){
        return stopStatus;
    }
}
