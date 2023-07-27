package fr.doranco.flash.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import fr.doranco.flash.R;
import fr.doranco.flash.adapter.PaysRecyclerViewAdapter;
import fr.doranco.flash.databinding.FragmentPaysListBinding;
import fr.doranco.flash.entity.Pays;


public class PaysListFragment extends Fragment {

    private FragmentPaysListBinding binding;

    public PaysListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPaysListBinding.inflate(inflater,container,false);

        List<Pays> paysList = new ArrayList<>();

        paysList.add(new Pays("France","Paris",67391582,"https://flagcdn.com/w320/fr.png"));
        paysList.add(new Pays("Canada","Ottawa",38005238,"https://flagcdn.com/w320/ca.png"));
        paysList.add(new Pays("Brazil","Brazilia",212559409,"https://flagcdn.com/w320/br.png"));

        // créer le Adpater pour le recyclerView
        PaysRecyclerViewAdapter adapter = new PaysRecyclerViewAdapter(getContext(),paysList);
        // affichage de la liste en grid
        binding.recyclerViewFragmentPaysList.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.recyclerViewFragmentPaysList.setAdapter(adapter);

        return binding.getRoot();
    }
}