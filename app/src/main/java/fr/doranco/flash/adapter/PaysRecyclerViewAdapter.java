package fr.doranco.flash.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import fr.doranco.flash.R;
import fr.doranco.flash.entity.Pays;

/**
 * 1 - créer une classe qui extends Viewholder qui initialise les composants de la vue
 * 2 -extends la classe RecyclerView.Adapter et implementer les methodes
 * 3- la methode onCreateViewHolder permet de créer la vue a partir du fichier xml. Cette sera utilisée par la methode
 *    onBindViewHolder afin d'afficher la donnée
 *    la methode onBindViewHolderpermet d'associer les données à la vue précedemmment créée.
 *    La methode getItemCount permet de definir le nombre de vue à generer par le Adapter
 */
public class PaysRecyclerViewAdapter extends RecyclerView.Adapter<PaysRecyclerViewAdapter.PaysViewHolder> {

    private Context context;
    private List<Pays> paysList;

    public PaysRecyclerViewAdapter(Context context, List<Pays> paysList) {
        this.context = context;
        this.paysList = paysList;
    }

    @NonNull
    @Override
    public PaysViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(context)
                .inflate(R.layout.recycler_view_item_pays,parent, false);
        return new PaysViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PaysViewHolder holder, int position) {
        Pays pays = paysList.get(position);
        holder.textView.setText(pays.getNom());
    }

    @Override
    public int getItemCount() {
        return paysList.size();
    }

    protected class PaysViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public TextView textView;


        public PaysViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewRecyclerViewItemPays);
            textView = itemView.findViewById(R.id.textViewRecyclerViewItemPays);
        }
    }
}

