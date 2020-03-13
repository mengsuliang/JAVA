public class Test03 { 
 
public static void main(String[] args) { 
 
	TicketWindow1 w1=new TicketWindow1(); 
	Thread t1=new Thread(w1); 
	Thread t2=new Thread(w1); 
	t1.start(); 
	t2.start();  
	}     
} 
class TicketWindow1 implements Runnable{ 
	private int totalTickets=10; 
	public void saleTicket(){ 
		if (totalTickets>0){ 

			try {  

				Thread.sleep(100); 
				
			} catch (Exception e) {  
				e.printStackTrace(); 
			}  
			synchronized (this) {
				System.out.println("当前在出售第"+totalTickets+"张票"); 
				totalTickets--;  
			}
		} 
		else 
			System.exit(1); 
		} 
 
	@Override  
	public void run() {   
	while (true){  
		saleTicket(); 
	}//while 	 
} 
 
} 