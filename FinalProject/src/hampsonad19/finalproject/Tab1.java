package hampsonad19.finalproject;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.app.Activity;
import android.content.Intent;

public class Tab1 extends Activity implements OnClickListener {
	ImageButton convertible1, convertible2, convertible3, convertible4, hybrid1, hybrid2,
		hybrid3, hybrid4, luxury1, luxury2, luxury3, luxury4, luxury5, luxury6,
		luxury7, luxury8, luxury9, luxury10, sedan1, sedan2, sedan3, sedan4, sedan5,
		sedan6, sedan7, sedan8, sedan9, suv1, suv2, suv3, suv4, suv5, suv6, truck1,
		van1, van2, wagon1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab1);
		
		convertible1 = (ImageButton) findViewById(R.id.btnConvertible1);
		convertible2 = (ImageButton) findViewById(R.id.btnConvertible2);
		convertible3 = (ImageButton) findViewById(R.id.btnConvertible3);
		convertible4 = (ImageButton) findViewById(R.id.btnConvertible4);
		
		convertible1.setOnClickListener(this);	
		convertible2.setOnClickListener(this);	
		convertible3.setOnClickListener(this);	
		convertible4.setOnClickListener(this);	
		
		hybrid1 = (ImageButton) findViewById(R.id.btnHybrid1);
		hybrid2 = (ImageButton) findViewById(R.id.btnHybrid2);
		hybrid3 = (ImageButton) findViewById(R.id.btnHybrid3);
		hybrid4 = (ImageButton) findViewById(R.id.btnHybrid4);
		
		hybrid1.setOnClickListener(this);	
		hybrid2.setOnClickListener(this);	
		hybrid3.setOnClickListener(this);	
		hybrid4.setOnClickListener(this);	
		
		luxury1 = (ImageButton) findViewById(R.id.btnLuxury1);
		luxury2 = (ImageButton) findViewById(R.id.btnLuxury2);
		luxury3 = (ImageButton) findViewById(R.id.btnLuxury3);
		luxury4 = (ImageButton) findViewById(R.id.btnLuxury4);
		luxury5 = (ImageButton) findViewById(R.id.btnLuxury5);
		luxury6 = (ImageButton) findViewById(R.id.btnLuxury6);
		luxury7 = (ImageButton) findViewById(R.id.btnLuxury7);
		luxury8 = (ImageButton) findViewById(R.id.btnLuxury8);
		luxury9 = (ImageButton) findViewById(R.id.btnLuxury9);
		luxury10 = (ImageButton) findViewById(R.id.btnLuxury10);
		
		luxury1.setOnClickListener(this);	
		luxury2.setOnClickListener(this);	
		luxury3.setOnClickListener(this);	
		luxury4.setOnClickListener(this);	
		luxury5.setOnClickListener(this);	
		luxury6.setOnClickListener(this);	
		luxury7.setOnClickListener(this);	
		luxury8.setOnClickListener(this);	
		luxury9.setOnClickListener(this);	
		luxury10.setOnClickListener(this);	
		
		sedan1 = (ImageButton) findViewById(R.id.btnSedan1);
		sedan2 = (ImageButton) findViewById(R.id.btnSedan2);
		sedan3 = (ImageButton) findViewById(R.id.btnSedan3);
		sedan4 = (ImageButton) findViewById(R.id.btnSedan4);
		sedan5 = (ImageButton) findViewById(R.id.btnSedan5);
		sedan6 = (ImageButton) findViewById(R.id.btnSedan6);
		sedan7 = (ImageButton) findViewById(R.id.btnSedan7);
		sedan8 = (ImageButton) findViewById(R.id.btnSedan8);
		sedan9 = (ImageButton) findViewById(R.id.btnSedan9);
		
		sedan1.setOnClickListener(this);	
		sedan2.setOnClickListener(this);	
		sedan3.setOnClickListener(this);	
		sedan4.setOnClickListener(this);	
		sedan5.setOnClickListener(this);	
		sedan6.setOnClickListener(this);	
		sedan7.setOnClickListener(this);	
		sedan8.setOnClickListener(this);	
		sedan9.setOnClickListener(this);
		
		suv1 = (ImageButton) findViewById(R.id.btnSUV1);
		suv2 = (ImageButton) findViewById(R.id.btnSUV2);
		suv3 = (ImageButton) findViewById(R.id.btnSUV3);
		suv4 = (ImageButton) findViewById(R.id.btnSUV4);
		suv5 = (ImageButton) findViewById(R.id.btnSUV5);
		suv6 = (ImageButton) findViewById(R.id.btnSUV6);
		
		suv1.setOnClickListener(this);	
		suv2.setOnClickListener(this);	
		suv3.setOnClickListener(this);	
		suv4.setOnClickListener(this);	
		suv5.setOnClickListener(this);	
		suv6.setOnClickListener(this);	
		
		truck1 = (ImageButton) findViewById(R.id.btnTruck1);
		
		truck1.setOnClickListener(this);
		
		van1 = (ImageButton) findViewById(R.id.btnVan1);
		van2 = (ImageButton) findViewById(R.id.btnVan2);
		
		van1.setOnClickListener(this);	
		van2.setOnClickListener(this);
		
		wagon1 = (ImageButton) findViewById(R.id.btnWagon1);	
		
		wagon1.setOnClickListener(this);	



	}

	@Override
	
		public void onClick(View v) {
			switch(v.getId()){
				case R.id.btnConvertible1 :
					startActivity(new Intent(this, Convertible1.class));
					break;
				case R.id.btnConvertible2 :
					startActivity(new Intent(this, Convertible2.class));
					break;
				case R.id.btnConvertible3 :
					startActivity(new Intent(Tab1.this, Convertible3.class));
					break;
				case R.id.btnConvertible4 :
					startActivity(new Intent(Tab1.this, Convertible4.class));
					break;
				case R.id.btnHybrid1 :
					startActivity(new Intent(Tab1.this, Hybrid1.class));
					break;
				case R.id.btnHybrid2 :
					startActivity(new Intent(Tab1.this, Hybrid2.class));
					break;
				case R.id.btnHybrid3 :
					startActivity(new Intent(Tab1.this, Hybrid3.class));
					break;
				case R.id.btnHybrid4 :
					startActivity(new Intent(Tab1.this, Hybrid4.class));
					break;
				case R.id.btnLuxury1 :
					startActivity(new Intent(this, Luxury1.class));
					break;
				case R.id.btnLuxury2 :
					startActivity(new Intent(this, Luxury2.class));
					break;
				case R.id.btnLuxury3 :
					startActivity(new Intent(Tab1.this, Luxury3.class));
					break;
				case R.id.btnLuxury4 :
					startActivity(new Intent(Tab1.this, Luxury4.class));
					break;
				case R.id.btnLuxury5 :
					startActivity(new Intent(Tab1.this, Luxury5.class));
					break;
				case R.id.btnLuxury6 :
					startActivity(new Intent(Tab1.this, Luxury6.class));
					break;
				case R.id.btnLuxury7 :
					startActivity(new Intent(Tab1.this, Luxury7.class));
					break;
				case R.id.btnLuxury8 :
					startActivity(new Intent(Tab1.this, Luxury8.class));
					break;	
				case R.id.btnLuxury9 :
					startActivity(new Intent(this, Luxury9.class));
					break;
				case R.id.btnLuxury10 :
					startActivity(new Intent(this, Luxury10.class));
					break;
				case R.id.btnSedan1 :
					startActivity(new Intent(Tab1.this, Sedan1.class));
					break;
				case R.id.btnSedan2:
					startActivity(new Intent(Tab1.this, Sedan2.class));
					break;
				case R.id.btnSedan3 :
					startActivity(new Intent(Tab1.this, Sedan3.class));
					break;
				case R.id.btnSedan4 :
					startActivity(new Intent(Tab1.this, Sedan4.class));
					break;
				case R.id.btnSedan5 :
					startActivity(new Intent(Tab1.this, Sedan5.class));
					break;
				case R.id.btnSedan6 :
					startActivity(new Intent(Tab1.this, Sedan6.class));
					break;
				case R.id.btnSedan7 :
					startActivity(new Intent(this, Sedan7.class));
					break;
				case R.id.btnSedan8 :
					startActivity(new Intent(this, Sedan8.class));
					break;
				case R.id.btnSedan9 :
					startActivity(new Intent(Tab1.this, Sedan9.class));
					break;
				case R.id.btnSUV1:
					startActivity(new Intent(Tab1.this, SUV1.class));
					break;
				case R.id.btnSUV2 :
					startActivity(new Intent(Tab1.this, SUV2.class));
					break;
				case R.id.btnSUV3 :
					startActivity(new Intent(Tab1.this, SUV3.class));
					break;
				case R.id.btnSUV4 :
					startActivity(new Intent(Tab1.this, SUV4.class));
					break;
				case R.id.btnSUV5 :
					startActivity(new Intent(Tab1.this, SUV5.class));
					break;
				case R.id.btnSUV6 :
					startActivity(new Intent(this, SUV6.class));
					break;
				case R.id.btnTruck1 :
					startActivity(new Intent(this, Truck1.class));
					break;
				case R.id.btnVan1 :
					startActivity(new Intent(Tab1.this, Van1.class));
					break;
				case R.id.btnVan2 :
					startActivity(new Intent(Tab1.this, Van2.class));
					break;
				case R.id.btnWagon1 :
					startActivity(new Intent(Tab1.this, Wagon1.class));
					break;
		}
	}
}

