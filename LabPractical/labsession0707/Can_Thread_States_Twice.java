//  No, it is not possible to start a thread twice.
//  thread will run only once but for second time, 
//  it will throw an IllegalThreadStateException.

package labsession0707;

public class Can_Thread_States_Twice extends Thread
{
	public void run()
	{  
		   System.out.println("Thread is running...");  
	}  

	public static void main(String[] args) 
	{
		Can_Thread_States_Twice t1 = new Can_Thread_States_Twice();
		t1.start();  
		t1.start();  
	}

}

/*

OUTPUT :
Thread is running...
Exception in thread "main" java.lang.IllegalThreadStateException
	at java.base/java.lang.Thread.start(Thread.java:793)
	at labsession0707.Can_Thread_States_Twice.main(Can_Thread_States_Twice.java:18)
*/
