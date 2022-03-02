import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;

public class main{

    protected Shell shell;
    private Text tbShowHour;
    private Text tbShowMinute;
    private Text tbShowSecond;

    /*
     * Launch the application.
     * @param args
     */
    public static void main(String[] args) {

        try {
            main window = new main();
            window.open();
            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
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
protected void createContents() {

        shell = new Shell();
        shell.setSize(423, 325);
        shell.setText("Digitalclock");

        Button btnNormal = new Button(shell, SWT.NONE);
        btnNormal.addSelectionListener(new SelectionAdapter() {
        	@Override
        	public void widgetSelected(SelectionEvent e) {
        		currenttime form2 = new currenttime();
        		form2.open();
        	}
        });
        btnNormal.setBounds(61, 152, 136, 44);
        btnNormal.setText("Normal");

        Button btnCountdown = new Button(shell, SWT.NONE);
        btnCountdown.setBounds(116, 202, 176, 44);
        btnCountdown.setText("Countdown");

        Button btnAlert = new Button(shell, SWT.NONE);
        btnAlert.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
            		
            }
        });
        btnAlert.setBounds(203, 152, 136, 44);
        btnAlert.setText("Alert");

        Label lblShowTitleHour = new Label(shell, SWT.NONE);
        lblShowTitleHour.setBounds(61, 42, 55, 15);
        lblShowTitleHour.setText("Hour");

        Label lblShowTitleMinute = new Label(shell, SWT.NONE);
        lblShowTitleMinute.setBounds(184, 42, 55, 15);
        lblShowTitleMinute.setText("Minute");

        Label lblShowTitleSecond = new Label(shell, SWT.NONE);
        lblShowTitleSecond.setBounds(300, 42, 55, 15);
        lblShowTitleSecond.setText("Second");

        tbShowHour = new Text(shell, SWT.BORDER);
        tbShowHour.setBackground(SWTResourceManager.getColor(255, 255, 255));
        tbShowHour.setBounds(42, 63, 76, 60);

        tbShowMinute = new Text(shell, SWT.BORDER);
        tbShowMinute.setBounds(167, 63, 76, 60);

        tbShowSecond = new Text(shell, SWT.BORDER);
        tbShowSecond.setBounds(279, 63, 76, 60);
        setTime();


    }
protected void Hide() {
	// TODO Auto-generated method stub
	
}

public void setTime() {
		currenttime form2 = new currenttime();
		
        LocalDateTime localDate = LocalDateTime.now(ZoneId.of("GMT+07:00"));
        DateTimeFormatter hh = DateTimeFormatter.ofPattern("hh");
        tbShowHour.setText(hh.format(localDate));

        LocalDateTime localDate_mm = LocalDateTime.now();
        DateTimeFormatter mm = DateTimeFormatter.ofPattern("mm");
        tbShowMinute.setText(mm.format(localDate_mm));

        LocalDateTime localDate_ss = LocalDateTime.now();
        DateTimeFormatter ss = DateTimeFormatter.ofPattern("ss");
        tbShowSecond.setText(ss.format(localDate_ss));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
    }
public void Re() {
	
}

}