package lap3;

import java.util.Scanner;
import java.util.Stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stack {

	public stack() {
		// TODO Auto-generated constructor stub
	}

	public static void empty(Stack<String> box) {
		System.out.println("isEmpty");
        boolean status = false;
        status = box.isEmpty();
        System.out.print("---| ");
        if(status == true ) {
        	System.out.println("Yes");
        }else {
        	System.out.println("No");
        }//empty
	}
	
	
	public static void size(Stack<String> box,int size) {
		box.setSize(size);//size
	}
	
	
	public static void top(Stack<String> box) {
		System.out.println("Top");
        String top = box.peek();
        if (top == null) {
        	System.out.println("NULL");
        }else {
        	System.out.println("---| Top ="+box.peek());
        }//top
	}
	
	
	public static void push(Stack<String> box,String txt ) {
		box.push(txt);
	}
	
	
	public static void ChackStack(Stack<String> box) {
		System.out.println("ChackStack");
        System.out.println("---| Stack :" + box);
	}
	
	
	public static void pop(Stack<String> box) {
		System.out.println("Pop");
        box.pop();
        
	}
	
	
//-------------------------------------------------------------------------------------------------------------------------------------	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int userIn = 0 ; 
        System.out.print( "SetStackSize : " );
        try {
            userIn = Integer.parseInt( br.readLine() );  // Read user input
        } catch ( NumberFormatException nfe) {
            System.err.println( "Invalid Format!" );
        }
        System.out.println( "-----------------------"); 
        int i = 0 ;
        int size = userIn;
        Stack<String> box = new Stack<String>();
        
        
        System.out.println("SetStackSize( " + size + " )");
        
        empty(box);
        
        size(box, size);
        
        top(box);
        
        box.setSize(0);
        
        for (int z = 0 ; z < size ; z++ ) {
	        Scanner sc  = new Scanner(System.in);
	        System.out.print("Push : " );
	        String txt = sc.nextLine();
	        int maxsize = size ;
	        if ( maxsize == i ) {
	            System.out.println("Stack overflow");
	            break;
	        }else{
	            push(box, txt);
	            i++;
	        }
	        ChackStack(box);
	        
        }//push
        
        top(box);
        
        pop(box);
       	i--;
        ChackStack(box);
        //pop
        
        empty(box);
        
        while ( i < size ) {
	        Scanner sc  = new Scanner(System.in);
	        System.out.print("Push : " );
	        String txt = sc.nextLine();
	        int maxsize = size ;
	        if ( maxsize == i ) {
	            System.out.println("Stack overflow");
	            break;
	        }else{
	        	push(box, txt);
	            i++;
	        }
	        ChackStack(box);
	        
        }//push
        
	        Scanner sc  = new Scanner(System.in);
	        System.out.print("Push : " );
	        String txt = sc.nextLine();
	        int maxsize = size ;
	        if ( maxsize == i ) {
	            System.out.println("Stack overflow");
	        }else{
	        	push(box, txt);
	            i++;
	        }
	        ChackStack(box);
	        
	}// end main

}
