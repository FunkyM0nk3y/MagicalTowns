package com.example.funkym0nk3y.magicaltowns;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by FunkyM0nk3y on 8/8/15.
 */
public class FragmentDetails extends Fragment{
  public TextView txtFiestas, txtComida;

  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
    View view = inflater.inflate(R.layout.mt_details, container, false);
    txtFiestas = (TextView) view.findViewById(R.id.txtFiestas);
    txtComida = (TextView) view.findViewById(R.id.txtComida);

    return view;
  }

  public void setText(MagicalTown mt){
    txtFiestas.setText(mt.getFiestas());
    txtComida.setText(mt.getComida());
  }
}
