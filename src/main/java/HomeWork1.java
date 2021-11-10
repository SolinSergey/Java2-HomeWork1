public class HomeWork1 {
    public static void main(String[] args) {
        Participant[] participants = new Participant[5];//{new Robot("Робот-полицейский",100,3)};
        participants[0]=new Human("Вася",500,1);
        participants[1]=new Cat("Барсик",30,2);
        participants[2]=new Cat("Муся",20,1);
        participants[3]=new Robot("Р2Д2",5,0);
        participants[4]=new Robot("Робот-полицейский",100,3);

        Obstacle[] obstacles = new Obstacle[4];
        obstacles[0] = new Wall(1);
        obstacles[1] = new JoggingTrack(30);
        obstacles[2] = new JoggingTrack(120);
        obstacles[3] = new Wall(7);

        for (int i=0;i<4;i++){
            for (int j=0;j<5;j++){
               if (!participants[j].getStopStatus()){
                   if (obstacles[i] instanceof Wall){
                       ((Wall) obstacles[i]).execute((Actions)participants[j]);
                   }
                   else if (obstacles[i] instanceof JoggingTrack){
                       ((JoggingTrack)obstacles[i]).execute((Actions)participants[j]);
                   }
               }
            }
            System.out.println();
        }

    }

}

