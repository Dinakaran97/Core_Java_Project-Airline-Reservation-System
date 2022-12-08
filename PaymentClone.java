import java.util.ArrayList;
import java.util.Scanner;




public class PaymentClone extends Userclone implements Runnable {
	String from,to,depdate,classes,duration,deptime,arrivaltime,status="booked",name;
	int passengers=0,gst=0,placenum,ticketfare,fare,payoption,payamount,val,refundamt,cc,cancel,camt;

	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("           "+"Book Domestic Flight Tickets");
		System.out.println();
		System.out.println("Places you can Fly");
		System.out.println();
		System.out.print(" Chennai "
				+ " Goa "
		        + " Mumbai "
				+ " Delhi "
				+ " Mysore "
				+"\n"
				+ " Hyderabad "
				+ " Bengaluru "
				+ " Pune "
				+ " Kochi "
				+ " Hubli "
				+ " Coimbatore"
				);
		
		System.out.println();
	    System.out.println();
	    System.out.println("Passenger Name:");
	    name=sc.nextLine();
		System.out.println("FROM:");
		from=sc.nextLine();
		System.out.println("TO:");
		to=sc.nextLine();
		System.out.println("Departure Date:");
		depdate=sc.nextLine();
		System.out.println("Class:(Economy/First/Business)");
		classes=sc.nextLine();
		System.out.println("Number of Tickets:");
		passengers=sc.nextInt();
		
		if(from.equalsIgnoreCase("chennai")|| 
				   from.equalsIgnoreCase("kochi")||
				   from.equalsIgnoreCase("coimbatore")||
				   from.equalsIgnoreCase("goa")||
				   from.equalsIgnoreCase("mumbai")||
				   from.equalsIgnoreCase("delhi")||
				   from.equalsIgnoreCase("hyderabad")||
				   from.equalsIgnoreCase("hubli")||
				   from.equalsIgnoreCase("mysore")||
				   from.equalsIgnoreCase("Kochi")||
				   from.equalsIgnoreCase("pune")
				
				) {
			
			if(
					to.equalsIgnoreCase("chennai")|| 
					   to.equalsIgnoreCase("kochi")||
					   to.equalsIgnoreCase("coimbatore")||
					   to.equalsIgnoreCase("goa")||
					   to.equalsIgnoreCase("mumbai")||
					   to.equalsIgnoreCase("delhi")||
					   to.equalsIgnoreCase("hyderabad")||
					   to.equalsIgnoreCase("hubli")||
					   to.equalsIgnoreCase("mysore")||
					   to.equalsIgnoreCase("Kochi")	||
					   to.equalsIgnoreCase("pune")
					
					
					) {
				
				if(classes.equalsIgnoreCase("economy")) {
					gst=875;
					 fare=5678;
					ticketfare=fare*passengers+gst;
					 duration="1h 30m";
					 deptime="20:30 pm";
					 arrivaltime="22:00 pm";
				
					ArrayList<Object> arr=new ArrayList<Object>();
					arr.add(name);
					arr.add(from);
					arr.add(to);
					arr.add(fare);
					arr.add(gst);
					arr.add(ticketfare);
					arr.add(duration);
					System.out.println("            "+"Flight Information");
					System.out.println();
					System.out.println();
					System.out.println("        Air India"+"\n"+from+" "+"Domestic Airport India");
					System.out.println();
					System.out.println();
					System.out.println(" Name:"+arr.get(0)+"\n"
							+" From: "+arr.get(1)+"\n"
							+ " To: "+arr.get(2)+"\n"
							+ " Fare:"+arr.get(3)+"\n"
							+ " Gst: "+arr.get(4)+"\n"
							+ " Ticketfare: "+arr.get(5)+"\n"
							+ " Duration: "+arr.get(6)+"\n"
							+ " departure Time: "+deptime+"\n"
							+ " Arrival Time: "+arrivaltime
							
							);
					System.out.println();
					System.out.println();
					System.out.println("pay using Upi id");
					System.out.println();
					
					Scanner sc3=new Scanner(System.in);
					System.out.println("Enter UPI ID:");
					 String upiid=sc3.nextLine();
					 System.out.println("Enter Pin");
					 String pin=sc3.nextLine();
					  
					
					System.out.println("enter the amount:");
					 payamount=sc3.nextInt();
					
				
					if(payamount==ticketfare) {
						
						try {
							System.out.println("payment processing.....");
							Thread.sleep(5000);
						}
						catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
						try {
							System.out.println("Loading please wait.....");
							Thread.sleep(5000);
						}
						catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
						try {
							System.out.println("Payment successful!");
							Thread.sleep(5000);
							System.out.println();
							
							System.out.println("Your e-Ticket has been sent to your Registered mail id");
							System.out.println();
							System.out.println("-------------------------------------------------------");
							System.out.println("Boarding Pass");
							System.out.println();
							System.out.println("Flight "+"  "+"Boarding Time"+"  "+"Gate"+"    "+"Seat");
							System.out.println();
							if(passengers==2) {
								System.out.println("AirIndia "+"  "+deptime+"     "+15+"    "+" 11A 12A");
							}
							else if(passengers==3) {
								System.out.println("AirIndia "+"  "+deptime+"     "+15+"    "+" 11A 12A 13A");
							}
							else {
								System.out.println("AirIndia "+"  "+deptime+"     "+15+"    "+" 11A ");
							}
							
							System.out.println();
							System.out.println("Passenger Name:"+name+"   "+"Class:"+classes);
							System.out.println();
							System.out.println("From:"+from+"   "+"To:"+to);
							System.out.println();
							System.out.println("Date:"+depdate+"   "+"Status:"+status);
							System.out.println();
							System.out.println("E-Ticket"+" "+Math.random());
							System.out.println();
							System.out.println("-------------------------------------------------------");
							
							if(payamount==ticketfare) {
								if(!Thread.currentThread().isInterrupted()) // Come out of run() method.
							{
								// System.out.println("Status of thread: " +!Thread.currentThread().isInterrupted());
								System.out.println("Enter the following numbers");
								System.out.println();
								 Scanner sc4=new Scanner(System.in);
								 System.out.println("1.Cancellation 2.Logout");
								 cancel=sc.nextInt();
								 switch(cancel) {
								 case 1:
									 cc=589;
									 System.out.println("Cancellation charges"+" "+589);
									 try {
											System.out.println("Cancellation in process.....");
											Thread.sleep(5000);
										}
										catch (Exception e) {
											// TODO: handle exception
											e.printStackTrace();
										}
									 try {
											System.out.println("Booking Cancelled.....");
											Thread.sleep(5000);
										}
										catch (Exception e) {
											// TODO: handle exception
											e.printStackTrace();
										}
									
									 
									 
									camt= ticketfare-cc;
									System.out.println(camt+" we be refunded to your bank account within 2-3 business days");
									break;
								 case 2:
									 System.out.println("Logged out successfully");
									 System.exit(0);
								 };
								 return;
								}//thread end
							}
							
							
								 
							
							
						}
						
							
						catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}

	                     PaymentClone p=new PaymentClone();
						Thread t1=new Thread(p);
						t1.setName("thread1");
						t1.start();
						
						

						
						
						
					}
					else {
					
				System.out.println("enter valid amount");	
				System.out.println("enter the amount:");
				 payamount=sc3.nextInt();
				 if(payamount==ticketfare) {
						
					 try {
							System.out.println("payment processing.....");
							Thread.sleep(5000);
						}
						catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
						try {
							System.out.println("Loading please wait.....");
							Thread.sleep(5000);
							
						}
						catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
						try {
							System.out.println("Payment successful!");
							Thread.sleep(5000);
							System.out.println();
							System.out.println("Your e-Ticket has been sent to your Registered mail id");
							System.out.println();
							System.out.println("-------------------------------------------------------");
							System.out.println("Boarding Pass");
							System.out.println();
							System.out.println("Flight "+"  "+"Boarding Time"+"  "+"Gate"+"    "+"Seat");
							System.out.println();
							if(passengers==2) {
								System.out.println("AirIndia "+"  "+deptime+"     "+15+"    "+" 11A 12A");
							}
							else if(passengers==3) {
								System.out.println("AirIndia "+"  "+deptime+"     "+15+"    "+" 11A 12A 13A");
							}
							else {
								System.out.println("AirIndia "+"  "+deptime+"     "+15+"    "+" 11A ");
							}
							
							System.out.println();
							System.out.println("Passenger Name:"+name+"   "+"Class:"+classes);
							System.out.println();
							System.out.println("From:"+from+"   "+"To:"+to);
							System.out.println();
							System.out.println("Date:"+depdate+"   "+"Status:"+status);
							System.out.println();
							System.out.println("E-Ticket"+" "+Math.random());
							System.out.println();
							System.out.println("-------------------------------------------------------");
							System.out.println();
							
							
							if(payamount==ticketfare) {
								if(!Thread.currentThread().isInterrupted()) // Come out of run() method.
								{
									// System.out.println("Status of thread: " +!Thread.currentThread().isInterrupted());
									System.out.println("Enter the following numbers");
									System.out.println();
									 Scanner sc4=new Scanner(System.in);
									 System.out.println("1.Cancellation 2.Logout");
									 cancel=sc.nextInt();
									 switch(cancel) {
									 case 1:
										 cc=589;
										 System.out.println("Cancellation charges"+" "+589);
										 try {
												System.out.println("Cancellation in process.....");
												Thread.sleep(5000);
											}
											catch (Exception e) {
												// TODO: handle exception
												e.printStackTrace();
											}
										 try {
												System.out.println("Booking Cancelled.....");
												Thread.sleep(5000);
											}
											catch (Exception e) {
												// TODO: handle exception
												e.printStackTrace();
											}
										
										 
										 
										camt= ticketfare-cc;
										System.out.println(camt+" we be refunded to your bank account within 2-3 business days");
										break;
									 case 2:
										 System.out.println("Logged out successfully");
										 System.exit(0);
									 };
									 return;
									}//thread end

							}
							
							
						}
						
							
						catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}

						PaymentClone p=new PaymentClone();
					Thread t1=new Thread(p);
					t1.setName("economy");
					t1.start();
					
						
						
						
						
					}
				}
				
					

					
				
				
				
				}//economy end
				
				if(classes.equalsIgnoreCase("first")) {
					gst=954;
					fare=7456;
					ticketfare=fare*passengers+gst;
					duration="2h 30m";
					deptime="11:30 pm";
					 arrivaltime="2:00 pm";
				
					ArrayList<Object> arr=new ArrayList<Object>();
					arr.add(name);
					arr.add(from);
					arr.add(to);
					arr.add(fare);
					arr.add(gst);
					arr.add(ticketfare);
					arr.add(duration);
					System.out.println("            "+"Flight Information");
					System.out.println();
					System.out.println();
					System.out.println("        Air India"+"\n"+from+" "+"Domestic Airport India");
					System.out.println();
					System.out.println();
					System.out.println(" Name:"+arr.get(0)+"\n"
							+" From: "+arr.get(1)+"\n"
							+ " To: "+arr.get(2)+"\n"
							+ " Fare:"+arr.get(3)+"\n"
							+ " Gst: "+arr.get(4)+"\n"
							+ " Ticketfare: "+arr.get(5)+"\n"
							+ " Duration: "+arr.get(6)+"\n"
							+ " departure Time: "+deptime+"\n"
							+ " Arrival Time: "+arrivaltime
							
							);
					System.out.println();
					System.out.println();
					System.out.println("pay using Upi id");
					System.out.println();
					
					Scanner sc3=new Scanner(System.in);
					System.out.println("Enter UPI ID:");
					 String upiid=sc3.nextLine();
					 System.out.println("Enter Pin");
					 String pin=sc3.nextLine();
					  
					
					System.out.println("enter the amount:");
					 payamount=sc3.nextInt();
					
				
					if(payamount==ticketfare) {
						
						try {
							System.out.println("payment processing.....");
							Thread.sleep(5000);
						}
						catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
						try {
							System.out.println("Loading please wait.....");
							Thread.sleep(5000);
						}
						catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
						try {
							System.out.println("Payment successful!");
							Thread.sleep(5000);
							System.out.println();
							
							System.out.println("Your e-Ticket has been sent to your Registered mail id");
							System.out.println();
							System.out.println("-------------------------------------------------------");
							System.out.println("Boarding Pass");
							System.out.println();
							System.out.println("Flight "+"  "+"Boarding Time"+"  "+"Gate"+"    "+"Seat");
							System.out.println();
							if(passengers==2) {
								System.out.println("AirIndia "+"  "+deptime+"     "+16+"    "+" 11A 12A");
							}
							else if(passengers==3) {
								System.out.println("AirIndia "+"  "+deptime+"     "+16+"    "+" 11A 12A 13A");
							}
							else {
								System.out.println("AirIndia "+"  "+deptime+"     "+16+"    "+" 11A ");
							}
							
							System.out.println();
							System.out.println("Passenger Name:"+name+"   "+"Class:"+classes);
							System.out.println();
							System.out.println("From:"+from+"   "+"To:"+to);
							System.out.println();
							System.out.println("Date:"+depdate+"   "+"Status:"+status);
							System.out.println();
							System.out.println("E-Ticket"+" "+Math.random());
							System.out.println();
							System.out.println("-------------------------------------------------------");
							
							if(payamount==ticketfare) {
								if(!Thread.currentThread().isInterrupted()) // Come out of run() method.
							{
								// System.out.println("Status of thread: " +!Thread.currentThread().isInterrupted());
								System.out.println("Enter the following numbers");
								System.out.println();
								 Scanner sc4=new Scanner(System.in);
								 System.out.println("1.Cancellation 2.Logout");
								 cancel=sc.nextInt();
								 switch(cancel) {
								 case 1:
									 cc=589;
									 System.out.println("Cancellation charges"+" "+765);
									 try {
											System.out.println("Cancellation in process.....");
											Thread.sleep(5000);
										}
										catch (Exception e) {
											// TODO: handle exception
											e.printStackTrace();
										}
									 try {
											System.out.println("Booking Cancelled.....");
											Thread.sleep(5000);
										}
										catch (Exception e) {
											// TODO: handle exception
											e.printStackTrace();
										}
									
									 
									 
									camt= ticketfare-cc;
									System.out.println(camt+" we be refunded to your bank account within 2-3 business days");
									break;
								 case 2:
									 System.out.println("Logged out successfully");
									 System.exit(0);
								 };
								 return;
								}//thread end
							}
							
							
								 
							
							
						}
						
							
						catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}

	                     PaymentClone p=new PaymentClone();
						Thread t1=new Thread(p);
						t1.setName("first");
						t1.start();
						
						

						
						
						
					}
					else {
					
				System.out.println("enter valid amount");	
				System.out.println("enter the amount:");
				 payamount=sc3.nextInt();
				 if(payamount==ticketfare) {
						
					 try {
							System.out.println("payment processing.....");
							Thread.sleep(5000);
						}
						catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
						try {
							System.out.println("Loading please wait.....");
							Thread.sleep(5000);
							
						}
						catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
						try {
							System.out.println("Payment successful!");
							Thread.sleep(5000);
							System.out.println();
							System.out.println("Your e-Ticket has been sent to your Registered mail id");
							System.out.println();
							System.out.println("-------------------------------------------------------");
							System.out.println("Boarding Pass");
							System.out.println();
							System.out.println("Flight "+"  "+"Boarding Time"+"  "+"Gate"+"    "+"Seat");
							System.out.println();
							if(passengers==2) {
								System.out.println("AirIndia "+"  "+deptime+"     "+16+"    "+" 11A 12A");
							}
							else if(passengers==3) {
								System.out.println("AirIndia "+"  "+deptime+"     "+16+"    "+" 11A 12A 13A");
							}
							else {
								System.out.println("AirIndia "+"  "+deptime+"     "+16+"    "+" 11A ");
							}
							
							System.out.println();
							System.out.println("Passenger Name:"+name+"   "+"Class:"+classes);
							System.out.println();
							System.out.println("From:"+from+"   "+"To:"+to);
							System.out.println();
							System.out.println("Date:"+depdate+"   "+"Status:"+status);
							System.out.println();
							System.out.println("E-Ticket"+" "+Math.random());
							System.out.println();
							System.out.println("-------------------------------------------------------");
							System.out.println();
							
							
							if(payamount==ticketfare) {
								if(!Thread.currentThread().isInterrupted()) // Come out of run() method.
								{
									// System.out.println("Status of thread: " +!Thread.currentThread().isInterrupted());
									System.out.println("Enter the following numbers");
									System.out.println();
									 Scanner sc4=new Scanner(System.in);
									 System.out.println("1.Cancellation 2.Logout");
									 cancel=sc.nextInt();
									 switch(cancel) {
									 case 1:
										 cc=589;
										 System.out.println("Cancellation charges"+" "+765);
										 try {
												System.out.println("Cancellation in process.....");
												Thread.sleep(5000);
											}
											catch (Exception e) {
												// TODO: handle exception
												e.printStackTrace();
											}
										 try {
												System.out.println("Booking Cancelled.....");
												Thread.sleep(5000);
											}
											catch (Exception e) {
												// TODO: handle exception
												e.printStackTrace();
											}
										
										 
										 
										camt= ticketfare-cc;
										System.out.println(camt+" we be refunded to your bank account within 2-3 business days");
										break;
									 case 2:
										 System.out.println("Logged out successfully");
										 System.exit(0);
									 };
									 return;
									}//thread end

							}
							
							
						}
						
							
						catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}

						PaymentClone p=new PaymentClone();
					Thread t1=new Thread(p);
					t1.setName("economy");
					t1.start();
					
						
						
						
						
					}
				}
				
					

					
				
				
				
				}//first end
				
				if(classes.equalsIgnoreCase("business")) {
					gst=1000;
					fare=9845;
					ticketfare=fare*passengers+gst;
					 duration="1h 10m";
					 deptime="20:00 pm";
					 arrivaltime="21:10 pm";
				
					ArrayList<Object> arr=new ArrayList<Object>();
					arr.add(name);
					arr.add(from);
					arr.add(to);
					arr.add(fare);
					arr.add(gst);
					arr.add(ticketfare);
					arr.add(duration);
					System.out.println("            "+"Flight Information");
					System.out.println();
					System.out.println();
					System.out.println("        Air India"+"\n"+from+" "+"Domestic Airport India");
					System.out.println();
					System.out.println();
					System.out.println(" Name:"+arr.get(0)+"\n"
							+" From: "+arr.get(1)+"\n"
							+ " To: "+arr.get(2)+"\n"
							+ " Fare:"+arr.get(3)+"\n"
							+ " Gst: "+arr.get(4)+"\n"
							+ " Ticketfare: "+arr.get(5)+"\n"
							+ " Duration: "+arr.get(6)+"\n"
							+ " departure Time: "+deptime+"\n"
							+ " Arrival Time: "+arrivaltime
							
							);
					System.out.println();
					System.out.println();
					System.out.println("pay using Upi id");
					System.out.println();
					
					Scanner sc3=new Scanner(System.in);
					System.out.println("Enter UPI ID:");
					 String upiid=sc3.nextLine();
					 System.out.println("Enter Pin");
					 String pin=sc3.nextLine();
					  
					
					System.out.println("enter the amount:");
					 payamount=sc3.nextInt();
					
				
					if(payamount==ticketfare) {
						
						try {
							System.out.println("payment processing.....");
							Thread.sleep(5000);
						}
						catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
						try {
							System.out.println("Loading please wait.....");
							Thread.sleep(5000);
						}
						catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
						try {
							System.out.println("Payment successful!");
							Thread.sleep(5000);
							System.out.println();
							
							System.out.println("Your e-Ticket has been sent to your Registered mail id");
							System.out.println();
							System.out.println("-------------------------------------------------------");
							System.out.println("Boarding Pass");
							System.out.println();
							System.out.println("Flight "+"  "+"Boarding Time"+"  "+"Gate"+"    "+"Seat");
							System.out.println();
							if(passengers==2) {
								System.out.println("AirIndia "+"  "+deptime+"     "+15+"    "+" 11A 12A");
							}
							else if(passengers==3) {
								System.out.println("AirIndia "+"  "+deptime+"     "+15+"    "+" 11A 12A 13A");
							}
							else {
								System.out.println("AirIndia "+"  "+deptime+"     "+15+"    "+" 11A ");
							}
							
							System.out.println();
							System.out.println("Passenger Name:"+name+"   "+"Class:"+classes);
							System.out.println();
							System.out.println("From:"+from+"   "+"To:"+to);
							System.out.println();
							System.out.println("Date:"+depdate+"   "+"Status:"+status);
							System.out.println();
							System.out.println("E-Ticket"+" "+Math.random());
							System.out.println();
							System.out.println("-------------------------------------------------------");
							
							if(payamount==ticketfare) {
								if(!Thread.currentThread().isInterrupted()) // Come out of run() method.
							{
								// System.out.println("Status of thread: " +!Thread.currentThread().isInterrupted());
								System.out.println("Enter the following numbers");
								System.out.println();
								 Scanner sc4=new Scanner(System.in);
								 System.out.println("1.Cancellation 2.Logout");
								 cancel=sc.nextInt();
								 switch(cancel) {
								 case 1:
									 cc=589;
									 System.out.println("Cancellation charges"+" "+940);
									 try {
											System.out.println("Cancellation in process.....");
											Thread.sleep(5000);
										}
										catch (Exception e) {
											// TODO: handle exception
											e.printStackTrace();
										}
									 try {
											System.out.println("Booking Cancelled.....");
											Thread.sleep(5000);
										}
										catch (Exception e) {
											// TODO: handle exception
											e.printStackTrace();
										}
									
									 
									 
									camt= ticketfare-cc;
									System.out.println(camt+" we be refunded to your bank account within 2-3 business days");
									break;
								 case 2:
									 System.out.println("Logged out successfully");
									 System.exit(0);
								 };
								 return;
								}//thread end
							}
							
							
								 
							
							
						}
						
							
						catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}

	                     PaymentClone p=new PaymentClone();
						Thread t1=new Thread(p);
						t1.setName("business");
						t1.start();
						
						

						
						
						
					}
					else {
					
				System.out.println("enter valid amount");	
				System.out.println("enter the amount:");
				 payamount=sc3.nextInt();
				 if(payamount==ticketfare) {
						
					 try {
							System.out.println("payment processing.....");
							Thread.sleep(5000);
						}
						catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
						try {
							System.out.println("Loading please wait.....");
							Thread.sleep(5000);
							
						}
						catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
						try {
							System.out.println("Payment successful!");
							Thread.sleep(5000);
							System.out.println();
							System.out.println("Your e-Ticket has been sent to your Registered mail id");
							System.out.println();
							System.out.println("-------------------------------------------------------");
							System.out.println("Boarding Pass");
							System.out.println();
							System.out.println("Flight "+"  "+"Boarding Time"+"  "+"Gate"+"    "+"Seat");
							System.out.println();
							if(passengers==2) {
								System.out.println("AirIndia "+"  "+deptime+"     "+12+"    "+" 11A 12A");
							}
							else if(passengers==3) {
								System.out.println("AirIndia "+"  "+deptime+"     "+12+"    "+" 11A 12A 13A");
							}
							else {
								System.out.println("AirIndia "+"  "+deptime+"     "+12+"    "+" 11A ");
							}
							
							System.out.println();
							System.out.println("Passenger Name:"+name+"   "+"Class:"+classes);
							System.out.println();
							System.out.println("From:"+from+"   "+"To:"+to);
							System.out.println();
							System.out.println("Date:"+depdate+"   "+"Status:"+status);
							System.out.println();
							System.out.println("E-Ticket"+" "+Math.random());
							System.out.println();
							System.out.println("-------------------------------------------------------");
							System.out.println();
							
							
							if(payamount==ticketfare) {
								if(!Thread.currentThread().isInterrupted()) // Come out of run() method.
								{
									// System.out.println("Status of thread: " +!Thread.currentThread().isInterrupted());
									System.out.println("Enter the following numbers");
									System.out.println();
									 Scanner sc4=new Scanner(System.in);
									 System.out.println("1.Cancellation 2.Logout");
									 cancel=sc.nextInt();
									 switch(cancel) {
									 case 1:
										 cc=589;
										 System.out.println("Cancellation charges"+" "+940);
										 try {
												System.out.println("Cancellation in process.....");
												Thread.sleep(5000);
											}
											catch (Exception e) {
												// TODO: handle exception
												e.printStackTrace();
											}
										 try {
												System.out.println("Booking Cancelled.....");
												Thread.sleep(5000);
											}
											catch (Exception e) {
												// TODO: handle exception
												e.printStackTrace();
											}
										
										 
										 
										camt= ticketfare-cc;
										System.out.println(camt+" we be refunded to your bank account within 2-3 business days");
										break;
									 case 2:
										 System.out.println("Logged out successfully");
										 System.exit(0);
									 };
									 return;
									}//thread end

							}
							
							
						}
						
							
						catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}

						PaymentClone p=new PaymentClone();
					Thread t1=new Thread(p);
					t1.setName("business");
					t1.start();
					
						
						
						
						
					}
				}
				
					

					
				
				
				
				}//business end	
				
				
		
	}//second if
			

}//main if
		
		else {
			System.out.println("Not specified"
					+ " destination please enter correct "
					+ "destination");
			run();
			
			
			
		}		
	
	}//run end
	}
