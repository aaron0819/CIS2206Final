/**
 * SUV5.java by Aaron Hampson 11/30/13
 * @author Aaron Hampson
 * @version 1.0
 * 
 * SUV loads suv5.xml and also handles the onClick function and 
 * calendar that is used.
 */

package hampsonad19.finalproject;

import java.util.Calendar;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class SUV5 extends Activity {
	
	private int currentYear;
	private int currentMonth;
	private int currentDay;
	static final int DATE_DIALOG_ID = 0;
	private Button btDate;
	private TextView reservation;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.suv5);
		btDate = (Button) findViewById(R.id.btnBook);
		reservation = (TextView) findViewById(R.id.txtReservation);
		
		btDate.setOnClickListener(new OnClickListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void onClick(View v) {
				showDialog(DATE_DIALOG_ID);
			}
		});
		final Calendar c = Calendar.getInstance();
		currentYear = c.get(Calendar.YEAR);
		currentMonth = c.get(Calendar.MONTH);
		currentDay = c.get(Calendar.DAY_OF_MONTH);
	}
	protected Dialog onCreateDialog(int id) {
		switch(id) {
		case DATE_DIALOG_ID:
			return new DatePickerDialog(this, reservationDate, currentYear,
					currentMonth, currentDay);
		}
		return null;
	}
	private DatePickerDialog.OnDateSetListener reservationDate =
			new DatePickerDialog.OnDateSetListener() {

				@Override
				public void onDateSet(DatePicker view, int year,
						int month, int day) {
					reservation.setText ("Your reservation is set for " + 
						(month + 1) + ("-") + day + ("-") + year);
				}
	};
}