class Main {
    public static void main(String[] args) {
        Semaforo[] sem = new Semaforo[3];
        sem[0] = new Semaforo(1);
        
        for(int i=1;i<3;i++)
        {
            sem[i]=new Semaforo(0);
        }

        Thread[] Bell = new Thread[3];

        Bell[0] = new Thread(new bell(sem[0],sem[1],"Din"));
        Bell[1] = new Thread(new bell(sem[1],sem[2],"Don"));
        Bell[2] = new Thread(new bell(sem[2],sem[0],"Dan"));

        Bell[0].start();
        Bell[1].start();
        Bell[2].start();
        
    }
}