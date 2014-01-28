package com.formation.adapter;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MonActivite extends Activity {
    
	ListView lvListe;
	List<Livre> maBibliotheque = new ArrayList<Livre>();
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        lvListe = (ListView)findViewById(R.id.lvListe);
        
        RemplirLaBibliotheque();
       
        LivreAdapter adapter = new LivreAdapter(this, maBibliotheque);
        
        lvListe.setAdapter(adapter);
        
        adapter.notifyDataSetChanged();
    }
    
    private void RemplirLaBibliotheque() {
    	maBibliotheque.clear();
    	maBibliotheque.add(new Livre("Starcraft 2 : Les diables du ciel", "William-C Dietz"));
    	maBibliotheque.add(new Livre("L'art du développement Androïd", "Mark Murphy"));
    	maBibliotheque.add(new Livre("Le seuil des ténèbres", "Karen Chance"));
    }
}