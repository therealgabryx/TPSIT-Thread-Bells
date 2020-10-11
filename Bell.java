public class Bell implements Runnable {
    private Semaforo sem1;
    private Semaforo sem2;
    private String name;

    public Bell(Semaforo s1, Semaforo s2, String name) {
        this.sem1 = s1;
        this.sem2 = s2;
        this.name = name;
    }

    @Override
    public void run() {  

        while(true) {
            sem1.P();
            System.out.println(name);
            try {
                    Thread.sleep(500);
                } 
                catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                } 
            sem2.V();
        }
    } 
}