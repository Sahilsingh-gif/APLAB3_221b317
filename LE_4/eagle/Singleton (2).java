public class Singleton
{
    static int x=0;
    private static Singleton uniqueInstance;
    private Singleton(){x++;}
    public static Singleton getInstance()
    {
        if(uniqueInstance==null)
            uniqueInstance=new Singleton();
        System.out.println(x);
        return uniqueInstance;
    }
}