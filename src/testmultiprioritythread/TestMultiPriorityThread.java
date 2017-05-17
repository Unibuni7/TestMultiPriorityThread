/*
 *  Developed by Abdulmuaz Alshaikhli
 * Slmnshukur1993@gmail.com
 * Student Easj.dk 2017. 
 MIT Licensed.
 */
package testmultiprioritythread;

/**
 *
 * @author slmns
 */
public class TestMultiPriorityThread extends Thread{
public void run(){
    System.out.println("running thread name is: " + Thread.currentThread().getName());
    System.out.println("running thread priority is: " + Thread.currentThread().getPriority());
}
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TestMultiPriorityThread m1 = new TestMultiPriorityThread();
        TestMultiPriorityThread m2 = new TestMultiPriorityThread();
        
        m1.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY);
        
        m1.start();
        m2.start();
    }
    
}
