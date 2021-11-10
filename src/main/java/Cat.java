public class Cat implements Actions {
    String name;
    public int limitRun;
    public int limitJump;
    public boolean stopStatus=false;
    public Cat (String name,int limitRun,int limitJump){
        this.name=name;
        this.limitRun=limitRun;
        this.limitJump=limitJump;
    }
    public void run(int distance) {
        if (distance <= limitRun){
            System.out.println("Кот " + name + " пробежал " + distance + " метров");
            return;
        }
        else{
            System.out.println("Кот "+ name + " не может пробежать дистанцию " + distance + " метров");
            stopStatus=true;
        }

    }

    public void jump(int height) {
        if (height <= limitJump){
            System.out.println("Кот " + name + " прыгнул через стену высотой " + height + " метров");
            return;
        }
        else{
            System.out.println("Кот "+ name + " не может прыгать через стены высотой " + height + " метров");
            stopStatus=true;
        }
    }
    public boolean getStopStatus (){
        return stopStatus;
    }
}
