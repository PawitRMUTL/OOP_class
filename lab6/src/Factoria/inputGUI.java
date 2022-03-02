package Factoria;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;

public class inputGUI {

	protected Shell shlInput;
	private Text tbInputNumber;
	public int numberFactoriaInput;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			inputGUI window = new inputGUI();
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
		shlInput.open();
		shlInput.layout();
		while (!shlInput.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlInput = new Shell();
		shlInput.setSize(306, 164);
		shlInput.setText("Input For Number ( 1 - 5 )");
		
		tbInputNumber = new Text(shlInput, SWT.BORDER);
		tbInputNumber.setFont(SWTResourceManager.getFont("Comic Sans MS", 23, SWT.NORMAL));
		tbInputNumber.setBounds(26, 20, 240, 47);
		
		Button btnEnterNumber = new Button(shlInput, SWT.NONE);
		btnEnterNumber.setFont(SWTResourceManager.getFont("Comic Sans MS", 14, SWT.NORMAL));
		btnEnterNumber.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setNumberFactoria(Integer.parseInt(tbInputNumber.getText()));
				shlInput.close();
			}
		});
		btnEnterNumber.setBounds(42, 83, 208, 34);
		btnEnterNumber.setText("Enter");
		
	}//end method
	
	public void setNumberFactoria(int numberFactoriaInput) {
		this.numberFactoriaInput = numberFactoriaInput;
	}//end method
	
	public int getNumberFactoria() {
		return this.numberFactoriaInput ;
	}//end method
}
