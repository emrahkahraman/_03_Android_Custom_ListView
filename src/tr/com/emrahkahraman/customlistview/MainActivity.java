package tr.com.emrahkahraman.customlistview;

import java.util.ArrayList;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	ArrayList<Model> liste=new ArrayList<Model>();
	ListView listemiz=null;
	Model model=null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		listemiz=(ListView) findViewById(R.id.listView1);
		getList();
		
		listemiz.setAdapter(new ModelArrayAdapter(getApplicationContext(), liste));
		
	    listemiz.setOnItemClickListener(new OnItemClickListener()
	    {
				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) 
				{
					Toast.makeText(MainActivity.this, "Listeye týklandý", Toast.LENGTH_LONG).show();
				}
	    });
	}
	
	
	public void getList()
	{
		Model m1= new Model();
		m1.setAd("Emrah");
		m1.setSoyad("Kahraman");
		m1.setTcNo("12345678911");
		m1.setDogumTarihi("01/01/1984");
		
		Model m2= new Model();
		m2.setAd("Hakan");
		m2.setSoyad("Mert");
		m2.setTcNo("12345678912");
		m2.setDogumTarihi("01/01/1983");
		
		liste.add(m1);
		liste.add(m2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings)
		{
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
