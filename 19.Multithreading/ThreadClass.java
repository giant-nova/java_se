public class ThreadClass extends Thread
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+" Hello");
            i++;
        }
    }
    public static void main(String[] args) {
        ThreadClass t=new ThreadClass();
        t.start();

        int i=1;
        while(true)
        {
            System.out.println(i+" World");
            i++;
        }
    }
}
