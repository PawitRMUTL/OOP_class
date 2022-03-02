import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class currenttime {

	protected Shell shell;
	private Text txtGmt;
	public String txt = "";

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			currenttime window = new currenttime();
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
		Text  gmt ;
		
		shell = new Shell();
		shell.setSize(423, 325);
		shell.setText("Normal Setting");
		
		txtGmt = new Text(shell, SWT.BORDER);
		txtGmt.setText("GMT+01:00");
		txtGmt.setBounds(210, 56, 131, 91);
		
		Label lblYourGmt = new Label(shell, SWT.NONE);
		lblYourGmt.setFont(SWTResourceManager.getFont("Segoe UI Historic", 21, SWT.NORMAL));
		lblYourGmt.setBounds(52, 82, 151, 46);
		lblYourGmt.setText("Your GMT ");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				main form1 = new main();
				form1.open();
			}
		});
		btnNewButton.setBounds(55, 171, 301, 60);
		btnNewButton.setText("Submit Normal Setting");
		
		Label lblExexmpleGmt = new Label(shell, SWT.NONE);
		lblExexmpleGmt.setBounds(210, 22, 120, 28);
		lblExexmpleGmt.setText("Exemple : GMT+02:30");

	}
}
