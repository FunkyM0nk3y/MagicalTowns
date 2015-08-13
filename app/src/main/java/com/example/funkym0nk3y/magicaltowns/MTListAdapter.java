package com.example.funkym0nk3y.magicaltowns;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.util.List;

/**
 * Created by FunkyM0nk3y on 8/8/15.
 */
public class MTListAdapter extends BaseAdapter {
  Context context;
  List<MagicalTown> rowItems;

  public MTListAdapter(Context context, List<MagicalTown> rowItems) {
    this.context = context;
    this.rowItems = rowItems;
  }

  @Override
  public int getCount() {
    return rowItems.size();
  }

  @Override
  public Object getItem(int position) {
    return rowItems.get(position);
  }

  @Override
  public long getItemId(int position) {
    return rowItems.indexOf(getItem(position));
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    if(convertView == null){
      LayoutInflater lay = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
      convertView = lay.inflate(R.layout.list_view, parent, false);
    }

    TextView nombre = (TextView)convertView.findViewById(R.id.txtNombre);
    TextView estado = (TextView)convertView.findViewById(R.id.txtEstado);
    ImageView imgFoto = (ImageView) convertView.findViewById(R.id.imgFoto);

    nombre.setTextColor(Color.BLACK);
    estado.setTextColor(Color.BLACK);

    MagicalTown mt = rowItems.get(position);
    nombre.setText(mt.getNombre());
    estado.setText(mt.getEstado());
    File imgFile = new File("/res/drawable/" + imgFoto);
    if ( imgFile.exists() ) {
      imgFoto.setImageURI(Uri.fromFile(imgFile));
    }

    return convertView;
  }
}
