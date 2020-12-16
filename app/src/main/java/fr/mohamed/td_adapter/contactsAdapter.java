package fr.mohamed.td_adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class contactsAdapter extends RecyclerView.Adapter<contactsAdapter.ViewHolder> {

    private final ArrayList<Contact> contacts;

    public contactsAdapter(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView icon_item_view;
        TextView nom_item_view;
        TextView prenom_item_view;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            this.icon_item_view = itemView.findViewById(R.id.icon_item);
            this.prenom_item_view = itemView.findViewById(R.id.prenom_item);
            this.nom_item_view = itemView.findViewById(R.id.nom_item);
        }
    }

    @NonNull
    @Override
    public contactsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(contactView);
    }



    @Override
    public void onBindViewHolder(@NonNull contactsAdapter.ViewHolder holder, int position) {
           Contact item = this.contacts.get(position);
           TextView firstName_view = holder.prenom_item_view;
           TextView lastName_view = holder.nom_item_view;
           ImageView icon_item_view = holder.icon_item_view;

           String firstName = item.getPrenom();
           String lastName = item.getNom();
           String icon_item = item.getImageUrl();

           firstName_view.setText(firstName);
           lastName_view.setText(lastName);
           RequestOptions roptions = new RequestOptions().fitCenter();
            Glide.with(icon_item_view.getContext())
                    .load(icon_item)
                    .apply(roptions)
                    .into(icon_item_view);
//            icon_item_view.setImageURI(Uri.parse("https://histoire-image.org/sites/default/jeanne-arc-sacre-charlesvii.jpg"));




    }

    @Override
    public int getItemCount() {
        return this.contacts.size();
    }
}
