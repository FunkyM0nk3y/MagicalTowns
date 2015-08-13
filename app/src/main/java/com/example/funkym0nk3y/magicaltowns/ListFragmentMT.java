package com.example.funkym0nk3y.magicaltowns;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by FunkyM0nk3y on 8/8/15.
 */
public class ListFragmentMT extends ListFragment {
  private MTListAdapter adapter;

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }

  @Override
  public void onActivityCreated(Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);

    ArrayList<MagicalTown> p =new ArrayList<MagicalTown>();
    p.add(new MagicalTown("Angangueo",
            "Michoacan",
            "angangeo.png",
            "Angangueo's parties",
            "Angangueo's food"));
    p.add(new MagicalTown("Alamos",
            "Sonora",
            "alamos.png",
            "Alamos parties",
            "Alamos food"));
    p.add(new MagicalTown("Palizada",
            "Campeche",
            "palizada.png",
            "Palizada's parties",
            "Palizada's food"));
    p.add(new MagicalTown("Real de Asientos",
            "Aguascalientes",
            "realdeasientos.jpg",
            "Real de Asientos parties",
            "Real de Asientos food"));
    p.add(new MagicalTown("Real de Monte",
            "Hidalgo",
            "realdelmonte.jpg",
            "Real del Monte's parties",
            "Real del Monte's food"));
    p.add(new MagicalTown("San Sebastian del Oeste",
            "Jalisco",
            "sansebastiandeloeste.jpg",
            "San Sebastian del Oeste's parties",
            "San Sebastian del Oeste's food"));
    p.add(new MagicalTown("Tapalpa",
            "Jalisco",
            "tapalpa.jpg",
            "Tapalpa's parties",
            "Tapalpa's food"));
    p.add(new MagicalTown("Taxco de Alarcon",
            "Guerrero",
            "taxcodealarcon.jpg",
            "Taxco de Alarcon's parties",
            "Taxco de Alarcon's food"));
    p.add(new MagicalTown("Tepotzotlan",
            "State of Mexico",
            "tepotzotlan.jpg",
            "Tepotzotlan's parties",
            "Tepotzotlan's food"));
    p.add(new MagicalTown("Valle de Bravo",
            "State of Mexico",
            "valledebravo.jpg",
            "Valle de Bravo's parties",
            "Valle de Bravo's food"));

    adapter = new MTListAdapter(getActivity(),p);
    setListAdapter(adapter);
  }

  @Override
  public void onListItemClick(ListView l, View v, int position, long id) {
    super.onListItemClick(l, v, position, id);
    MagicalTown mt = (MagicalTown) getListAdapter().getItem(position);
    FragmentDetails df = (FragmentDetails) this.getFragmentManager().findFragmentById(R.id.mtDetails);
    if ( df!=null && df.isInLayout() ){
      df.setText(mt);
    }
  }
}
