package tr.com.emrahkahraman.customlistview;

import java.util.List;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ModelArrayAdapter extends ArrayAdapter<Model> 
{
	private final Context context;
	private List<Model> values;

	public ModelArrayAdapter(Context context, List<Model> tvalues) 
	{
		super(context, R.layout.list_item, tvalues);
		this.context = context;
		this.values = tvalues;
	}

	@Override
	public View getView(final int position, View convertView, ViewGroup parent) 
	{
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		View rowView = inflater.inflate(R.layout.list_item, parent,
				false);
		TextView tv_Ad = (TextView) rowView.findViewById(R.id.tv_Ad);
     	TextView tv_Soyad = (TextView) rowView.findViewById(R.id.tv_Soyad);
     	TextView tv_tcKimlik = (TextView) rowView.findViewById(R.id.tv_tcKimlik);
     	TextView tv_Dogum = (TextView) rowView.findViewById(R.id.tv_Dogum);

	    Model model = ((Model) values.get(position));
	    tv_Ad.setText(model.getAd());
	    tv_Soyad.setText(model.getSoyad());
	    tv_tcKimlik.setText(model.getTcNo());
	    tv_Dogum.setText(model.getDogumTarihi());
	    
		return rowView;
	}
}