class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside Thread");
    }
}
class ThreadDemo2
{
    public static void main(String[] args)
    {
        System.out.println("Inside main");
        Demo dobj=new Demo();
        dobj.start();
        System.out.println("End of main");
       
    }
}