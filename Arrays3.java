package operators;


import java.util.Scanner;

public class Arrays3 {

	
	
	public void Insert(int flightCount, int flightId[], String flightName[], String flightFrom[], String flightTo[], double flightPrice[]){
		Scanner s = new Scanner(System.in);

			for(int i=0;i<flightCount;i++){
				
				System.out.println("enter flightId" +(i+1));
				flightId[i]=s.nextInt();
				
				
				System.out.println("enter flightName" +(i+1));
				flightName[i]=s.next();
				
				System.out.println("enter flightFrom" +(i+1));
				flightFrom[i]=s.next();
				
				System.out.println("enter flightTo" +(i+1));
				flightTo[i]=s.next();
				
				System.out.println("enter flightPrice" +(i+1));
				flightPrice[i]=s.nextDouble();

				
			}

					
		
	}
	public void Display(int flightCount,int flightId[], String flightName[], String flightFrom[], String flightTo[], double flightPrice[]){
	
		for(int i=0;i<flightCount;i++){
		
		System.out.println("the" +(i+1)+" flightId is" +flightId[i]+ " of "+(i+1));

	
	
		System.out.println("the flightName is" +flightName[i]+ " of "+(i+1));
	
		System.out.println("the flightFrom is" +flightFrom[i]+" of "+(i+1));


		System.out.println("the flightTo is"+flightTo[i]+ " of "+(i+1));
		

		System.out.println("the flightPrice is" +flightPrice[i]+" of "+ (i+1));

		
		}
	}
	public void Search(int flightCount,int flightId[], String flightName[], String flightFrom[], String flightTo[], double flightPrice[]  ){
		
		Scanner s = new Scanner(System.in);
//		System.out.println("enter flightId" );
//		 int t=s.nextInt();
		
		 System.out.println("enter flightName");
		 
		String str = s.next();
		
		for(int i=0;i<flightCount;i++){
			
			if(str == flightName[i]){
				
				System.out.println("flightNameis found" +flightName[i]);
				
				}
			
			else{
				
				System.out.println("flightName  is not found");	
				}
	}
		
//		for(int i=0; i<flightId.length;i++){
//			
//			if(t == flightId[i]){
//				
//				
//				System.out.println("flightId is found");
//				
//				System.out.println("the" +(i+1)+" flightId is" +flightId[i]+ " of "+(i+1));
//
//				System.out.println("the flightName is" +flightName[i]+ " of "+(i+1));
//			
//				System.out.println("the flightFrom is" +flightFrom[i]+" of "+(i+1));
//
//
//				System.out.println("the flightTo is"+flightTo[i]+ " of "+(i+1));
//				
//
//				System.out.println("the flightPrice is" +flightPrice[i]+" of "+ (i+1));
//
//				break;
//			}
//		
//			
//			else{
//			
//			
//		
//			}
//			      
//		
//		}
	
			 
			
	}
		

	
		
		 



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=0;
		
  

		Scanner s = new Scanner(System.in);
	      System.out.println("enter number of flights ");
	      	int flightCount = s.nextInt();
	      	
	      	
	      	
			int flightId[] = new int[flightCount];
			String flightName[] = new String[flightCount];
			String flightFrom[] =  new String[flightCount];
			String flightTo[] =  new String[flightCount];
			double flightPrice[]= new double[flightCount];
			

		Arrays3 obj = new Arrays3();
		
		while(n!=4)
			
		{
			System.out.println(" 1 - insert ");
			System.out.println(" 2 - display");
			System.out.println(" 3 - search");
			System.out.println(" 4 - exit");
				
			System.out.println("choose option");
			
			  n =s.nextInt();

			  
			  switch (n){
			  
			  case 1 :

	      		
				  obj.Insert(flightCount, flightId, flightName, flightFrom, flightTo, flightPrice);
				  
				  
				  break;
			  case 2 :
				  obj.Display(flightCount,flightId, flightName, flightFrom, flightTo, flightPrice);
				  break;
			  case 3 :
				  obj.Search(flightCount,flightId, flightName, flightFrom, flightTo, flightPrice);
				
				  break;
			  case 4:
				  System.out.println("exit");
			
				  break;
			  default:
					System.out.println("out of choice");
		}
	}
			  
			  
			

	}

}

