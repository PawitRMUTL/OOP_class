package Factoria;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;

import java.security.PublicKey;
import java.util.Stack;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class mainGUI {

	protected Shell shell;
	private Text tbShowText;
	private Label lblStack1;
	private Label lblStack2;
	private Label lblStack4;
	private Label lblStack3;
	private Label lblStack5;
	private Label lblPush;
	private Label lblPop;
	private Label lblFac;
	private Label lblFac_1;
	private Label lblShowCal;
	private Label lblShowSumFac;
	private Label lblShowFinish;
	
	public 	int i = 0 ;
	public 	int answer = 1 ;
	public 	int temp ; 
	public 	int tempStack ; 
	public 	int state = 0 ;
	public 	int popStack = 1;
	public	int []num = new int[5] ;
	public	Stack<Integer> stackA 	= new Stack<>();
	public	Stack<Integer> stackFac = new Stack<>(); 
	private Label arrowPop;
	private Label arrowPop2;
	private Label arrowPush;
	private Label arrowPush1;
	private Text lblPopFac;
	
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			mainGUI window = new mainGUI();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 * @return 
	 */
	
	public int calFac( Stack<Integer> stackA ) {
		for(int i = 1 ; i <= temp ; i++ ) {
			answer *= stackA.pop();
		}
		System.out.println("fac  = "+answer);
		return answer;
	}
	
	protected void createContents() {
		shell = new Shell();
		shell.setSize(243, 134);
		shell.setText("SWT Application");
		inputGUI Form2 = new inputGUI();
		
		Button btnNextToEnterNumber = new Button(shell, SWT.NONE);
		btnNextToEnterNumber.setFont(SWTResourceManager.getFont("Comic Sans MS", 10, SWT.NORMAL));
		btnNextToEnterNumber.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.setVisible(false);//ปิดหน้าเจอ form1
				Form2.open(); //เปิดหน้าเจอ form2
				temp = Form2.getNumberFactoria();
				tempStack = temp;
					//System.out.print(temp+"!");
				tbShowText.setText(Form2.getNumberFactoria() +"!");
				shell.setVisible(true);//เปิดหน้าเจอ form1
				tbShowText.setText( tempStack + "!" );
				btnNextToEnterNumber.setVisible(false);
				shell.setSize(1000, 600);
					//System.out.print(temp);
			}// end method
		});
		btnNextToEnterNumber.setBounds(30, 22, 176, 59);
		btnNextToEnterNumber.setText("Enter Factoria Number");
		
		Button btnRun = new Button(shell, SWT.NONE);
		btnRun.setTouchEnabled(true);
		btnRun.setFont(SWTResourceManager.getFont("Comic Sans MS", 14, SWT.NORMAL));
		btnRun.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if( state != 1 ) {
					arrowPush.setVisible(true);
					arrowPush1.setVisible(true);
					switch ( tempStack ) {
					  case 1:
						  if( state == 2 ) {
							  lblStack1.setText( lblStack2.getText() );
							  lblStack2.setText( lblStack3.getText() );
							  lblStack3.setText( lblStack4.getText() );
							  lblStack4.setText( lblStack5.getText() );
							  lblStack5.setText( tempStack + "" );
						  } /*end if */ else {
							  lblStack5.setText( tempStack + "" );
						  } // end else
						  state = 1;
						  stackA.push(1);
						  //System.out.print(stack.pop());
						  tbShowText.setVisible(false);
						  lblPush.setVisible(false);
						  tempStack-- ;
					    break;
					  case 2:
						  if( state == 3 ) {
							  lblStack2.setText( lblStack3.getText() );
							  lblStack3.setText( lblStack4.getText() );
							  lblStack4.setText( lblStack5.getText() );
							  lblStack5.setText( tempStack + "" );
						  }/*end if */ else {
							  lblStack5.setText( tempStack + "" );
						  }// end else
						  stackA.push(2);
						  state = 2;
						  lblPush.setVisible(true);
						  tempStack-- ;
					    break;
					  case 3:
						  if( state == 4 ) {
							  lblStack3.setText( lblStack4.getText() );
							  lblStack4.setText( lblStack5.getText() );
							  lblStack5.setText( tempStack + "" );
						  }/*end if */ else {
							  lblStack5.setText( tempStack + "" );
						  }// end else
						  stackA.push(3);
						  state = 3;
						  lblPush.setVisible(true);
						  tempStack-- ;
					    break;
					  case 4:
						  if( state == 5 ) {
							  lblStack4.setText( lblStack5.getText() );
							  lblStack5.setText( tempStack + "" );
						  }/*end if */ else {
							  lblStack5.setText( tempStack + "" );
						  }// end else
						  stackA.push(4);
						  state = 4;
						  lblPush.setVisible(true);
						  tempStack-- ;
					    break;
					  case 5:
						  stackA.push(5);
						  state = 5;
						  lblStack5.setText( tempStack + "" );
						  lblPush.setVisible(true);
						  tempStack-- ;
					    break;
					} //end switch case
					
				}/* end if */ else {
					arrowPush.setVisible(false);
					arrowPush1.setVisible(false);
					if( i < temp ) {
						arrowPop.setVisible(true);
						arrowPop2.setVisible(true);
						i++;
						lblPop.setVisible(true);
						switch ( popStack ) {
						  case 1:
							  lblFac.setVisible( true );
							  lblShowCal.setVisible( true );
							  lblShowCal.setText( lblStack5.getText() );
							  lblPopFac.setText(  lblStack5.getText() + "!" );
							  lblStack5.setText( lblStack4.getText() );
							  lblStack4.setText( lblStack3.getText() );
							  lblStack3.setText( lblStack2.getText() );
							  lblStack2.setText( lblStack1.getText() );
							  lblStack1.setText( "" );
							  popStack++ ;
						    break;
						  case 2:
							  lblShowCal.setText( lblShowCal.getText() + " x " + lblStack5.getText() );
							  lblPopFac.setText(  lblStack5.getText() + "!" );
							  lblStack5.setText( lblStack4.getText() );
							  lblStack4.setText( lblStack3.getText() );
							  lblStack3.setText( lblStack2.getText() );
							  lblStack2.setText( "" );
							  popStack++ ;
						    break;
						  case 3:
							  lblShowCal.setText( lblShowCal.getText() + " x " + lblStack5.getText() );
							  lblPopFac.setText(  lblStack5.getText() + "!" );
							  lblStack5.setText( lblStack4.getText() );
							  lblStack4.setText( lblStack3.getText() );
							  lblStack3.setText( "" );
							  popStack++ ;
						    break;
						  case 4:
							  lblShowCal.setText( lblShowCal.getText() + " x " + lblStack5.getText() );
							  lblPopFac.setText(  lblStack5.getText() + "!" );
							  lblStack5.setText( lblStack4.getText() );
							  lblStack4.setText( "" );
							  popStack++ ;
						    break;
						  case 5:
							  lblShowCal.setText( lblShowCal.getText() + " x " + lblStack5.getText() );
							  lblPopFac.setText(  lblStack5.getText() + "!" );
							  lblStack5.setText( "" );
							  popStack++ ;
						    break;
						}//end switch case
					}/*end if */  
					if( i == temp ) {	
						btnRun.setEnabled(false);
						lblShowSumFac.setText( calFac( stackA ) + "" );
						lblShowFinish.setVisible(true);
						lblFac_1.setVisible(true);
						lblShowSumFac.setVisible(true);
					}//end if
				}//end else 
				tbShowText.setText( tempStack + "!" );
			}//end method
		});
		
		btnRun.setText("RUN");
		btnRun.setBounds(73, 461, 157, 77);
		
		Label border1 = new Label(shell, SWT.SEPARATOR | SWT.VERTICAL);
		border1.setBounds(383, 131, 18, 325);
		
		Label border2 = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL);
		border2.setBounds(393, 444, 176, 24);
		
		Label border3 = new Label(shell, SWT.SEPARATOR);
		border3.setBounds(564, 131, 18, 325);
		
		tbShowText = new Text(shell, SWT.CENTER);
		tbShowText.setFont(SWTResourceManager.getFont("Comic Sans MS", 24, SWT.NORMAL));
		tbShowText.setEnabled(false);
		tbShowText.setEditable(false);
		tbShowText.setBounds(232, 102, 76, 59);
		
		lblStack1 = new Label(shell, SWT.CENTER);
		lblStack1.setFont(SWTResourceManager.getFont("Comic Sans MS", 14, SWT.NORMAL));
		lblStack1.setBounds(407, 399, 150, 56);
		
		lblStack2 = new Label(shell, SWT.NONE);
		lblStack2.setFont(SWTResourceManager.getFont("Comic Sans MS", 14, SWT.NORMAL));
		lblStack2.setAlignment(SWT.CENTER);
		lblStack2.setBounds(407, 334, 150, 56);
		
		lblStack4 = new Label(shell, SWT.NONE);
		lblStack4.setFont(SWTResourceManager.getFont("Comic Sans MS", 14, SWT.NORMAL));
		lblStack4.setAlignment(SWT.CENTER);
		lblStack4.setBounds(407, 211, 150, 56);
		
		lblStack3 = new Label(shell, SWT.NONE);
		lblStack3.setFont(SWTResourceManager.getFont("Comic Sans MS", 14, SWT.NORMAL));
		lblStack3.setAlignment(SWT.CENTER);
		lblStack3.setBounds(407, 272, 150, 56);
		
		lblStack5 = new Label(shell, SWT.NONE);
		lblStack5.setFont(SWTResourceManager.getFont("Comic Sans MS", 14, SWT.NORMAL));
		lblStack5.setAlignment(SWT.CENTER);
		lblStack5.setBounds(407, 149, 150, 56);
		
		lblPush = new Label(shell, SWT.NONE);
		lblPush.setFont(SWTResourceManager.getFont("Comic Sans MS", 14, SWT.NORMAL));
		lblPush.setBounds(347, 36, 54, 24);
		lblPush.setText("Push");
		lblPush.setVisible(false);
		
		lblPop = new Label(shell, SWT.NONE);
		lblPop.setFont(SWTResourceManager.getFont("Comic Sans MS", 14, SWT.NORMAL));
		lblPop.setText("Pop");
		lblPop.setBounds(527, 36, 41, 31);
		lblPop.setVisible(false);
		
		lblFac = new Label(shell, SWT.NONE);
		lblFac.setFont(SWTResourceManager.getFont("Comic Sans MS", 14, SWT.NORMAL));
		lblFac.setText("Fac = ");
		lblFac.setBounds(622, 102, 55, 31);
		lblFac.setVisible(false);
		
		lblFac_1 = new Label(shell, SWT.NONE);
		lblFac_1.setFont(SWTResourceManager.getFont("Comic Sans MS", 14, SWT.NORMAL));
		lblFac_1.setAlignment(SWT.CENTER);
		lblFac_1.setText("=");
		lblFac_1.setBounds(646, 149, 41, 31);
		lblFac_1.setVisible(false);
		
		lblShowCal = new Label(shell, SWT.NONE);
		lblShowCal.setFont(SWTResourceManager.getFont("Comic Sans MS", 14, SWT.NORMAL));
		lblShowCal.setBounds(707, 102, 150, 34);
		lblShowCal.setVisible(false);
		
		lblShowSumFac = new Label(shell, SWT.NONE);
		lblShowSumFac.setFont(SWTResourceManager.getFont("Comic Sans MS", 14, SWT.NORMAL));
		lblShowSumFac.setBounds(707, 149, 150, 34);
		lblShowSumFac.setVisible(false);
		
		lblShowFinish = new Label(shell, SWT.CENTER);
		lblShowFinish.setAlignment(SWT.CENTER);
		lblShowFinish.setFont(SWTResourceManager.getFont("Comic Sans MS", 27, SWT.BOLD | SWT.ITALIC));
		lblShowFinish.setText("FINISH");
		lblShowFinish.setBounds(671, 252, 170, 59);
		lblShowFinish.setVisible(false);
		
		arrowPop = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL);
		arrowPop.setBounds(533, 85, 76, 8);
		arrowPop.setVisible(false);
		
		arrowPop2 = new Label(shell, SWT.SEPARATOR);
		arrowPop2.setBounds(534, 85, 5, 39);
		arrowPop2.setVisible(false);
		
		arrowPush = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL);
		arrowPush.setBounds(347, 85, 76, 8);
		arrowPush.setVisible(false);
		
		arrowPush1 = new Label(shell, SWT.SEPARATOR);
		arrowPush1.setBounds(422, 85, 5, 39);
		arrowPush1.setVisible(false);
		
		lblPopFac = new Text(shell, SWT.CENTER);
		lblPopFac.setFont(SWTResourceManager.getFont("Comic Sans MS", 24, SWT.NORMAL));
		lblPopFac.setEnabled(false);
		lblPopFac.setEditable(false);
		lblPopFac.setBounds(610, 20, 76, 59);

	}//end class
}
