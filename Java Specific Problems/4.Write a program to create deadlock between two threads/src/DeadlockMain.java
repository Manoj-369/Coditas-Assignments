/*Deadlock is a Situation where two or More Threads are Blocked forever,Waiting for each other */


public class DeadlockMain {  
  public static void main(String[] args) {  
     String Name1 = "Manoj jadhav";  
     String Name2 = "Mayur Jadhav"; 
    
    
    // Here t1 tries to lock resource1 then Name2  
    
    Thread t1 = new Thread() {  
      public void run() {  
          synchronized (Name1) {  
           System.out.println("Thread 1: locked Name 1");  
  
           try { 
        	   Thread.sleep(100);
        	   
           } catch (Exception e) {
        	   
           }  
  
           synchronized (Name2) {  
            System.out.println("Thread 1: locked Name 2");  
           }  
         }  
      }  
    };  
  
    
    // t2 tries to lock resource2 then Name1  
    Thread t2 = new Thread() {  
      public void run() {  
        synchronized (Name2) {  
          System.out.println("Thread 2: locked Name 2");  
  
          try {
        	  Thread.sleep(100);
        	  } catch (Exception e) {
        		  
        	  }  
  
          synchronized (Name1) {  
            System.out.println("Thread 2: locked Namee 1 ");  
          }  
        }  
      }  
    };  
  
      
    t1.start();  
    t2.start();  
  }  
}  
