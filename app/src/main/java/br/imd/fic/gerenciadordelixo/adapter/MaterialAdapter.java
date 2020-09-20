package br.imd.fic.gerenciadordelixo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.imd.fic.gerenciadordelixo.R;
import br.imd.fic.gerenciadordelixo.dominio.Material;

public class MaterialAdapter extends RecyclerView.Adapter<MaterialAdapter.MaterialHolder> {

    private List<Material> materiais;
    private Context context;

    public MaterialAdapter(List<Material> materiais, Context context) {
        this.materiais = materiais;
        this.context = context;
    }

    @NonNull
    @Override
    public MaterialHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_material,parent,false);
        MaterialHolder materialHolder = new MaterialHolder(view);
        return materialHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MaterialHolder holder, int position) {

        Material material = materiais.get(position);

        holder.tipo.setText(material.getTipo());
        holder.quantidade.setText(material.getQuantidade());

    }

    @Override
    public int getItemCount() {
        return materiais.size();
    }

    public class MaterialHolder extends RecyclerView.ViewHolder
        implements View.OnClickListener, View.OnLongClickListener {

        public TextView tipo;
        public TextView quantidade;
        public ImageView ic_material;

        public MaterialHolder(View itemView) {
            super(itemView);

            tipo = itemView.findViewById(R.id.tipo);
            quantidade = itemView.findViewById(R.id.quantidade);
            ic_material = itemView.findViewById(R.id.ic_material);

            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int pos = getAdapterPosition();

            Toast.makeText(context, "OnClick "+pos, Toast.LENGTH_SHORT).show();
        }

        @Override
        public boolean onLongClick(View view) {
            int pos = getAdapterPosition();
            Toast.makeText(context, "OnLongClick "+pos, Toast.LENGTH_SHORT).show();
            return true;
        }
    }
}
