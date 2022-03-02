package Calculator;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.FillLayout;

import javax.swing.JOptionPane;

import org.eclipse.core.internal.databinding.conversion.NumberToIntegerConverter;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.wb.swt.SWTResourceManager;
import swing2swt.layout.BoxLayout;
import org.eclipse.swt.custom.CBanner;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class MainCalculator {

	protected Shell shell;
	public double result;
	public String tempStr = "";
	public String tempStr2 = "";
	public String oparation;
	public String Stroparation;
	public boolean StateOp = false ;
	public String answer;
	public double var1 = 0 , var2 = 0;
	public String tempAnswer ;
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainCalculator window = new MainCalculator();
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
	 */
	
	protected void createContents() {
		shell = new Shell();
		shell.setSize(372, 382);
		shell.setTouchEnabled(true);
		shell.setModified(true);
		shell.setImage(null);
		shell.setBackground(SWTResourceManager.getColor(255, 255, 255));
		shell.setLayout(null);
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setBounds(10, 10, 348, 336);
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite.setLayout(null);
		
		Label lblShowText = new Label(composite, SWT.NONE);
		lblShowText.setAlignment(SWT.RIGHT);
		lblShowText.setFont(SWTResourceManager.getFont("Unispace", 20, SWT.BOLD));
		lblShowText.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblShowText.setBounds(10, 10, 327, 76);
		
		
		Label lblText1 = new Label(composite, SWT.NONE);
		lblText1.setBounds(10, 347, 55, 15);
		lblText1.setText("");
		
		Label lblText2 = new Label(composite, SWT.NONE);
		lblText2.setBounds(83, 347, 55, 15);
		lblText2.setText("");
		
		// button 0
		Button btnNum0 = new Button(composite, SWT.NONE);
		btnNum0.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String str = lblShowText.getText(); 
				if( tempStr != "" ) {
					if( StateOp == false ) {
						tempStr += btnNum0.getText();
						lblShowText.setText(tempStr);
						lblText1.setText(tempStr);
					}else {
						tempStr += btnNum0.getText();
						tempStr2 = tempStr2 + btnNum0.getText();
						lblShowText.setText(tempStr2);
						lblText2.setText(tempStr);
					}//end else
				} /*end if*/ 
			}
		});
		btnNum0.setText("0");
		btnNum0.setBounds(10, 272, 195, 54);
		
		// button 1
		Button btnNum1 = new Button(composite, SWT.NONE);
		btnNum1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String str = lblShowText.getText(); 
				if( StateOp == false ) {
					tempStr += btnNum1.getText();
					lblShowText.setText(tempStr);
					lblText1.setText(tempStr);
				}else {
					tempStr += btnNum1.getText();
					tempStr2 = tempStr2 + btnNum1.getText();
					lblShowText.setText(tempStr2);
					lblText2.setText(tempStr);
				}
			}
		});
		btnNum1.setText("1");
		btnNum1.setBounds(10, 212, 61, 54);
		
		// button 2
		Button btnNum2 = new Button(composite, SWT.NONE);
		btnNum2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String str = lblShowText.getText();
				if( StateOp == false ) {
					tempStr += btnNum2.getText();
					lblShowText.setText(tempStr);
					lblText1.setText(tempStr);
				}else {
					tempStr += btnNum2.getText();
					tempStr2 = tempStr2 + btnNum2.getText();
					lblShowText.setText(tempStr2);
					lblText2.setText(tempStr);
				}
			}
		});
		btnNum2.setText("2");
		btnNum2.setBounds(77, 212, 61, 54);
				
		// button 3
		Button btnNum3 = new Button(composite, SWT.NONE);
		btnNum3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String str = lblShowText.getText(); 
				if( StateOp == false ) {
					tempStr += btnNum3.getText();
					lblShowText.setText(tempStr);
					lblText1.setText(tempStr);
				}else {
					tempStr += btnNum3.getText();
					tempStr2 = tempStr2 + btnNum3.getText();
					lblShowText.setText(tempStr2);
					lblText2.setText(tempStr);
				}
			}
		});
		btnNum3.setText("3");
		btnNum3.setBounds(144, 212, 61, 54);
				
		// button 4
		Button btnNum4 = new Button(composite, SWT.NONE);
		btnNum4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String str = lblShowText.getText();
				if( StateOp == false ) {
					tempStr += btnNum4.getText();
					lblShowText.setText(tempStr);
					lblText1.setText(tempStr);
				}else {
					tempStr += btnNum4.getText();
					tempStr2 = tempStr2 + btnNum4.getText();
					lblShowText.setText(tempStr2);
					lblText2.setText(tempStr);
				}
			}
		});
		btnNum4.setText("4");
		btnNum4.setBounds(10, 152, 61, 54);
		
		// button 5
		Button btnNum5 = new Button(composite, SWT.NONE);
		btnNum5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String str = lblShowText.getText();
				if( StateOp == false ) {
					tempStr += btnNum5.getText();
					lblShowText.setText(tempStr);
					lblText1.setText(tempStr);
				}else {
					tempStr += btnNum5.getText();
					tempStr2 = tempStr2 + btnNum5.getText();
					lblShowText.setText(tempStr2);
					lblText2.setText(tempStr);
				}
			}
		});
		btnNum5.setText("5");
		btnNum5.setBounds(77, 152, 61, 54);
		
		// button 6
		Button btnNum6 = new Button(composite, SWT.NONE);
		btnNum6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String str = lblShowText.getText(); 
				if( StateOp == false ) {
					tempStr += btnNum6.getText();
					lblShowText.setText(tempStr);
					lblText1.setText(tempStr);
				}else {
					tempStr += btnNum6.getText();
					tempStr2 = tempStr2 + btnNum6.getText();
					lblShowText.setText(tempStr2);
					lblText2.setText(tempStr);
				}
			}
		});
		btnNum6.setText("6");
		btnNum6.setBounds(144, 152, 61, 54);
		
		// button 7 
		Button btnNum7 = new Button(composite, SWT.NONE);
		btnNum7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String str = lblShowText.getText();
				if( StateOp == false ) {
					tempStr += btnNum7.getText();
					lblShowText.setText(tempStr);
					lblText1.setText(tempStr);
				}else {
					tempStr += btnNum7.getText();
					tempStr2 = tempStr2 + btnNum7.getText();
					lblShowText.setText(tempStr2);
					lblText2.setText(tempStr);
				}
			}
		});
		btnNum7.setBounds(10, 92, 61, 54);
		btnNum7.setText("7");
		
		// button 8
		Button btnNum8 = new Button(composite, SWT.NONE);
		btnNum8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String str = lblShowText.getText(); 
				if( StateOp == false ) {
					tempStr += btnNum8.getText();
					lblShowText.setText(tempStr);
					lblText1.setText(tempStr);
				}else {
					tempStr += btnNum8.getText();
					tempStr2 = tempStr2 + btnNum8.getText();
					lblShowText.setText(tempStr2);
					lblText2.setText(tempStr);
				}
			}
		});
		btnNum8.setText("8");
		btnNum8.setBounds(77, 92, 61, 54);
		
		// button 9
		Button btnNum9 = new Button(composite, SWT.NONE);
		btnNum9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String str = lblShowText.getText(); 
				if( StateOp == false ) {
					tempStr += btnNum9.getText();
					lblShowText.setText(tempStr);
					lblText1.setText(tempStr);
				}else {
					tempStr += btnNum9.getText();
					tempStr2 = tempStr2 + btnNum9.getText();
					lblShowText.setText(tempStr2);
					lblText2.setText(tempStr);
				}
			}
		});
		btnNum9.setText("9");
		btnNum9.setBounds(144, 92, 61, 54);
		
		// button +
		Button btnPlus = new Button(composite, SWT.NONE);
		btnPlus.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if( tempStr != "" ) {
					oparation="+";
					StateOp = true;
					if( answer == null ) {
						tempStr2 = tempStr+oparation;
						Stroparation = tempStr2 + btnPlus.getText();
						tempStr = "";
						lblShowText.setText(tempStr2);
					} else {
						tempStr2 = answer + oparation;
						Stroparation = answer + btnPlus.getText();
						tempStr = "";
						lblShowText.setText(tempStr2);
					}
				} //end if
			}
		});
		btnPlus.setText("+");
		btnPlus.setBounds(211, 92, 61, 54);
		
		// button -
		Button btnMinus = new Button(composite, SWT.NONE);
		btnMinus.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if( tempStr != "" ) {
					oparation="-";
					StateOp = true;
					if( answer == null ) {
						tempStr2 = tempStr+oparation;
						Stroparation = tempStr2 + btnMinus.getText();
						tempStr = "";
						lblShowText.setText(tempStr2);
					} else {
						tempStr2 = answer + oparation;
						Stroparation = answer + btnMinus.getText();
						tempStr = "";
						lblShowText.setText(tempStr2);
					}
				} //end if
			}
		});
		btnMinus.setText("-");
		btnMinus.setBounds(278, 92, 61, 54);
		
		// button *
		Button btnMultiply = new Button(composite, SWT.NONE);
		btnMultiply.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if( tempStr != "" ) {
					oparation="*";
					StateOp = true;
					if( answer == null ) {
						tempStr2 = tempStr+oparation;
						Stroparation = tempStr2 + btnMultiply.getText();
						tempStr = "";
						lblShowText.setText(tempStr2);
					} else {
						tempStr2 = answer + oparation;
						Stroparation = answer + btnMultiply.getText();
						tempStr = "";
						lblShowText.setText(tempStr2);
					}//end else
				} //end if
			}
		});
		btnMultiply.setText("*");
		btnMultiply.setBounds(211, 152, 61, 54);
		
		// button /
		Button btnDivide = new Button(composite, SWT.NONE);
		btnDivide.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if( tempStr != "" ) {
					oparation="/";
					StateOp = true;
					if( answer == null ) {
						tempStr2 = tempStr+oparation;
						Stroparation = tempStr2 + btnDivide.getText();
						tempStr = "";
						lblShowText.setText(tempStr2);
					}/* end if */ else {
						tempStr2 = answer + oparation;
						Stroparation = answer + btnDivide.getText();
						tempStr = "";
						lblShowText.setText(tempStr2);
					} // end else 
				}// end if
			}
		});
		btnDivide.setText("/");
		btnDivide.setBounds(278, 152, 61, 54);
		
		// button =
		Button btnTotal = new Button(composite, SWT.NONE);
		btnTotal.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//String tempAnswer ;
				if( answer == null ) {
					if( oparation == "+" ) {
						result = Double.parseDouble(lblText1.getText()) + Double.parseDouble(lblText2.getText()) ;
						answer = String.format("%.2f", result);
						lblShowText.setText( lblText1.getText() + " + " + lblText2.getText() + " = " +  "\n" + answer );
					} else if( oparation == "-" ) {
						result = Double.parseDouble(lblText1.getText()) - Double.parseDouble(lblText2.getText()) ;
						answer = String.format("%.2f", result);
						lblShowText.setText( lblText1.getText() + " - " + lblText2.getText() + " = " +  "\n" + answer );
					} else if( oparation == "*" ) {
						result = Double.parseDouble(lblText1.getText()) * Double.parseDouble(lblText2.getText()) ;
						answer = String.format("%.2f", result);
						lblShowText.setText( lblText1.getText() + " * " + lblText2.getText() + " = " +  "\n" + answer );
					} else if( oparation == "/" ) {
						result = Double.parseDouble(lblText1.getText()) / Double.parseDouble(lblText2.getText()) ;
						answer = String.format("%.2f", result);
						lblShowText.setText( lblText1.getText() + " / " + lblText2.getText() + " = " +  "\n" + answer );
					} 
				}else {
					if( oparation == "+" ) {
						tempAnswer = answer;
						result = Double.parseDouble(answer) + Double.parseDouble(lblText2.getText()) ;
						answer = String.format("%.2f", result);
						lblShowText.setText( tempAnswer + " + " + lblText2.getText() + " = " +  "\n" + answer );
					}else if( oparation == "-" ) {
						tempAnswer = answer;
						result = Double.parseDouble(answer) - Double.parseDouble(lblText2.getText()) ;
						answer = String.format("%.2f", result);
						lblShowText.setText( tempAnswer + " - " + lblText2.getText() + " = " +  "\n" + answer );
					}else if( oparation == "*" ) {
						tempAnswer = answer;
						result = Double.parseDouble(answer) * Double.parseDouble(lblText2.getText()) ;
						answer = String.format("%.2f", result);
						lblShowText.setText( tempAnswer + " * " + lblText2.getText() + " = " +  "\n" + answer );
					}else if( oparation == "/" ) {
						tempAnswer = answer;
						result = Double.parseDouble(answer) / Double.parseDouble(lblText2.getText()) ;
						answer = String.format("%.2f", result);
						lblShowText.setText( tempAnswer + " / " + lblText2.getText() + " = " +  "\n" + answer );
					}
				}// end else 
				//lblText1.setText("");
				lblText2.setText("");
				StateOp = false;
			}// end method 
		});
		btnTotal.setText("=");
		btnTotal.setBounds(211, 212, 126, 114);
	}
}
