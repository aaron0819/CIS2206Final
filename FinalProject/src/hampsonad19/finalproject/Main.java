/**
 * Main.java by Aaron Hampson 11/30/13
 * @author Aaron Hampson
 * @version 1.0
 */


package hampsonad19.finalproject;

import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.app.TabActivity;
import android.content.Intent;

/**
 *Main.java loads all of the tabs to be used in main.xml.
 */
@SuppressWarnings("deprecation")
public class Main extends TabActivity {
/**
 * onCreate loads main.mxl and initializes TabHost and TabSpec.
 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		TabHost tabHost = getTabHost();
		/**
		 * vehiclespec initializes the first tab and starts a new intent
		 * with Tab1.class.
		 */
		TabSpec vehiclespec = tabHost.newTabSpec("View Available Vehicles");
		vehiclespec.setIndicator("View Available Vehicles");
		Intent photosIntent = new Intent(this, Tab1.class);
		vehiclespec.setContent(photosIntent);

		/**
		 * ratecalcspec initializes the second tab and starts a new intent
		 * with RateCalc.class.
		 */
		TabSpec ratecalcspec = tabHost.newTabSpec("Rate Calculator");
		ratecalcspec.setIndicator("Rate Calculator");
		Intent ratecalcIntent = new Intent(this, RateCalc.class);
		ratecalcspec.setContent(ratecalcIntent);
		
		/**aboutspec initializes the third tab and starts a new intent
		 * with About.class.
		 */
		TabSpec aboutspec = tabHost.newTabSpec("About");
		aboutspec.setIndicator("About");
		Intent tourIntent = new Intent(this, About.class);
		aboutspec.setContent(tourIntent);

		/**
		 * addTab adds each of the 3 tabs to the tab host.
		 */
		tabHost.addTab(vehiclespec);	
		tabHost.addTab(ratecalcspec);
		tabHost.addTab(aboutspec);
	}
}

