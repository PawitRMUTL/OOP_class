package lab12;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.net.Socket;
import java.net.SocketException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class lab12 {
	
	public static BigDecimal addOne(Object obj){
		BigDecimal a = (BigDecimal)obj;
		return a.add(BigDecimal.ONE);
	}
	
	public static void a() { b(); }
	public static void b() { c(); }
	public static void c() {
		throw new IllegalStateException("Just a test");
	}
	
	
	private static void createConnection() throws Exception, IOException {
		 
        String host = null;
		int port = 0;
		Socket socket = new Socket(host, port);

	}

	private static void initiateIO() throws IOException {
   
        Socket socket = null;
		PrintWriter outbound = new PrintWriter(socket.getOutputStream(), true);
    
	}
	
	public static void check(int i){  
		
        if (i == 0)  
            return;  
        else {  
            check(i++);  
        }  
    } 
	
	
	public static void main( String[] args ) throws Exception {
		
		
		try {
			String a = "1234 ";
			Integer.parseInt(a);
		}catch(Exception e) {
			System.out.println("Exception");
		}// End try..catch ---| Exception
		
			try {
				int[] arrayin = {1,2,3};
				System.out.println(arrayin[10]);
			}catch(RuntimeException e) {
				System.out.println("  This is RuntimeException");
			}// End try..catch ---| RuntimeException
			
				try {
					String objStr = "123";
					BigDecimal result = addOne(objStr);
					System.out.println(result);
				}catch( ClassCastException e ) {
					System.out.println("   ----| This is ClassCastException");
				} // End try..catch ---| ClassCastException
				
				try {
					a();
				} catch (IllegalStateException e) {
					System.out.println("   ----|_ This is IllegalStateException");
				}// End try..catch ---| IllegalStateException
				
				try {
					String a = "1234 ";
					Integer.parseInt(a);
				}catch(NumberFormatException e) {
					System.out.println("        |----> This is NumberFormatException");
				}// End try..catch ---| NumberFormatException
				
				try {
					int a = 5;
					int b = 0;
					int ans = a / b ;
				}catch(ArithmeticException e) {
					System.out.println("   ----| This is ArithmeticException");
				}// End try..catch ---| ArithmeticException
				
				try {
					int[] arrayin = {1,2,3};
					System.out.println(arrayin[10]);
				}catch(IndexOutOfBoundsException e) {
					System.out.println("   ----|_ This is IndexOutOfBoundsException");
				}// End try..catch ---| IndexOutOfBoundsException
				
				try {
					int[] arrayin = {1,2,3};
					System.out.println(arrayin[10]);
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("        |----> This is ArrayIndexOutOfBoundsException");
				}// End try..catch ---| ArrayIndexOutOfBoundsException
				
				try {
					String st = "aun";
					System.out.println(st.charAt(4));
				}catch(StringIndexOutOfBoundsException e) {
					System.out.println("        |----> This is StringIndexOutOfBoundsException");
				}// End try..catch ---| StringIndexOutOfBoundsException
				
				try {
					Path file = null;
					Files.delete(file);
				} catch (NullPointerException e) {
						System.out.println("   ----| This is NullPointerException");
				}// End try..catch ---| NullPointerException
				
			
		try {
			FileInputStream f = new FileInputStream("code.txt");
			}catch(IOException e) {
				System.out.println("  This is IOException");
			}// End try..catch ---| IOException
				
					try {
				        createConnection();
				        System.out.println("Second test");
				        initiateIO();
					}catch(SocketException e) {
							 System.out.println("   ----| This is SocketException");
					}// End try..catch ---| SocketException
					
					
					try {
					FileInputStream f = new FileInputStream("code.txt");
					}catch(FileNotFoundException e) {
						System.out.println("   ----| This is FileNotFoundException");
					}// End try..catch ---| FileNotFoundException
					
					try {
					DataInputStream dis = new DataInputStream(new FileInputStream("D:\\test001.txt"));
					while (true) {
						char ch ;
						ch = dis.readChar();
						System.out.println(ch);
					}
					}catch(EOFException e) {
						System.out.println("   ----| This is EOFException");
					}// End try..catch ---| EOFException
			System.out.println("______________________________________________________");
		
			
			try {
				check(5);
			}catch(Error e) {
				System.out.println("Error");
			}// End try..catch ---| Error
			
			
			System.out.println("  This is LinkageError");
			
			
			try {
				check(5);
			}catch(VirtualMachineError e) {
				System.out.println("  This is VirtualMachineError");
			}// End try..catch ---| VirtualMachineError
				
				try {
					int arrSize = 15;  
			        long memoryConsumed = 0;  
			        
			        long[] memoryAllocated = null;    
			        for (int loop = 0; loop < Integer.MAX_VALUE; loop++) {  
			            memoryAllocated = new long[arrSize];  
			            memoryAllocated[0] = 0;  
			            memoryConsumed += arrSize * Long.SIZE;  
			            arrSize *= arrSize * 2;  
			            Thread.sleep(100);  
					}
				}catch(OutOfMemoryError e) {
					System.out.println("   ----| This is OutOfMemoryError");
				}// End try..catch ---| OutOfMemoryError
			
				try {
					check(5);
				}catch(StackOverflowError e) {
					System.out.println("   ----| This is StackOverflowError");
				}// End try..catch ---| StackOverflowError
		
	}

	
}