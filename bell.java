public class bell implements Runnable{
    private Semaforo sem1;
    private Semaforo sem2;
    private String name;

    public bell(Semaforo s1, Semaforo s2, String name){
        sem1 = s1;
        sem2 = s2;
        this.name=name;
    }

    @Override
    public void run(){  

        while(true)
        {
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