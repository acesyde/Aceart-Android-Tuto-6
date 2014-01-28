package com.formation.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class LivreAdapter extends BaseAdapter {

	List<Livre> biblio;
	LayoutInflater inflater;
	
	public LivreAdapter(Context context,List<Livre> biblio) {
		inflater = LayoutInflater.from(context);
		this.biblio = biblio;
	}
	
	@Override
	public int getCount() {
		return biblio.size();
	}

	@Override
	public Object getItem(int position) {
		return biblio.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}
	
	private class ViewHolder {
		TextView tvTitre;
		TextView tvAuteur;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		
		if(convertView == null) {
			holder = new ViewHolder();
			convertView = inflater.inflate(R.layout.itemlivre, null);
			holder.tvTitre = (TextView)convertView.findViewById(R.id.tvTitre);
			holder.tvAuteur = (TextView)convertView.findViewById(R.id.tvAuteur);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		
		holder.tvTitre.setText(biblio.get(position).getTitre());
		holder.tvAuteur.setText(biblio.get(position).getAuteur());
		
		return convertView;
	}

}
