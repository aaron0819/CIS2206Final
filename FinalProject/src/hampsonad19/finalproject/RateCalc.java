/**
 * RateCalc.java by Aaron Hampson 11/30/13
 * @author Aaron Hampson
 * @version 1.0
 * 
 * RateCalc is the back end for ratecalc.xml that performs the 
 * calculations made in ratecalc.xml.
 */


package hampsonad19.finalproject;

import java.text.DecimalFormat;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class RateCalc extends Activity {
	double convertibleRate = 45.0;
	double hybridRate = 65.0;
	double luxuryRate = 120.0;
	double sedanRate = 55.00;
	double suvRate = 70.0;
	double truckRate = 70.0;
	double vanRate = 60.0;
	double wagonRate = 55.0;
	int daysEntered = 0;
	double totalCost = 0.0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ratecalc);
        final EditText days = (EditText) findViewById(R.id.edtTxtDays);
        final RadioButton convertible = (RadioButton) findViewById(R.id.radConvertible);
        final RadioButton hybrid = (RadioButton) findViewById(R.id.radHybrid);
        final RadioButton luxury = (RadioButton) findViewById(R.id.radLuxury);
        final RadioButton sedan = (RadioButton) findViewById(R.id.radSedan);
        final RadioButton suv = (RadioButton) findViewById(R.id.radSUV);
        final RadioButton truck = (RadioButton) findViewById(R.id.radTruck);
        final RadioButton van = (RadioButton) findViewById(R.id.radVan);
        final RadioButton wagon = (RadioButton) findViewById(R.id.radWagon);
        final TextView result = (TextView) findViewById(R.id.txtConversion);
        Button convert = (Button)findViewById(R.id.btnConvert);

        convert.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				
		    	if(Integer.parseInt(days.getText().toString()) <= 0){
		    		Toast.makeText(RateCalc.this,"Days must be a minumum of 1.", Toast.LENGTH_SHORT).show();
		    	} else {
			    	daysEntered = Integer.parseInt(days.getText().toString());
	
			    	DecimalFormat currency = new DecimalFormat("$###,###,###,###.##");
			    	if(convertible.isChecked()){
			    		if (daysEntered <= 30){
			    			totalCost = daysEntered * convertibleRate;
							result.setText(currency.format(totalCost));
			    		}else {
				    		
				    	}
				    	if(hybrid.isChecked()){
				    		if (daysEntered <= 30){
				    			totalCost = daysEntered * hybridRate;
								result.setText(currency.format(totalCost));
				    		}else {
				    			Toast.makeText(RateCalc.this,"You can rent a car for a maximum of 30 days.", Toast.LENGTH_SHORT).show();
				    		}
				    	}
				    	if(luxury.isChecked()){
				    		if (daysEntered <= 30){
				    			totalCost = daysEntered * luxuryRate;
								result.setText(currency.format(totalCost));
				    		}else {
				    			Toast.makeText(RateCalc.this,"You can rent a car for a maximum of 30 days.", Toast.LENGTH_SHORT).show();
				    		}
				    	}
				    	if(sedan.isChecked()){
				    		if (daysEntered <= 30){
				    			totalCost = daysEntered * sedanRate;
								result.setText(currency.format(totalCost));
				    		}else {
				    			Toast.makeText(RateCalc.this,"You can rent a car for a maximum of 30 days.", Toast.LENGTH_SHORT).show();
				    		}
				    	}
				    	if(suv.isChecked()){
				    		if (daysEntered <= 30){
				    			totalCost = daysEntered * suvRate;
								result.setText(currency.format(totalCost));
				    		}else {
				    			Toast.makeText(RateCalc.this,"You can rent a car for a maximum of 30 days.", Toast.LENGTH_SHORT).show();
				    		}
				    	}
				    	if(truck.isChecked()){
				    		if (daysEntered <= 30){
				    			totalCost = daysEntered * truckRate;
								result.setText(currency.format(totalCost));
				    		}else {
				    			Toast.makeText(RateCalc.this,"You can rent a car for a maximum of 30 days.", Toast.LENGTH_SHORT).show();
				    		}
				    	}
				    	if(van.isChecked()){
				    		if (daysEntered <= 30){
				    			totalCost = daysEntered * vanRate;
								result.setText(currency.format(totalCost));
				    		}else {
				    			Toast.makeText(RateCalc.this,"You can rent a car for a maximum of 30 days.", Toast.LENGTH_SHORT).show();
				    		}
				    	}
				    	if(wagon.isChecked()){
				    		if (daysEntered <= 30){
				    			totalCost = daysEntered * wagonRate;
								result.setText(currency.format(totalCost));
				    		}else {
				    			Toast.makeText(RateCalc.this,"You can rent a car for a maximum of 30 days.", Toast.LENGTH_SHORT).show();
				    		}
				    	}
					}
		    	}
		    };
    });
}
}

