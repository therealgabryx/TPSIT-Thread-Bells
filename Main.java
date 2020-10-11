class Main {
    public static void main(String[] args) {
        Semaforo[] sem = new Semaforo[3];
        sem[0] = new Semaforo(1);
        
        for(int i = 1; i < 3; i++) {
            sem[i] = new Semaforo(0);
        }

        Thread[] bells = new Thread[3];

        bells[0] = new Thread(new Bell(sem[0],sem[1],"Din"));
        bells[1] = new Thread(new Bell(sem[1],sem[2],"Don"));
        bells[2] = new Thread(new Bell(sem[2],sem[0],"Dan"));

        bells[0].start();
        bells[1].start();
        bells[2].start();
    }
}