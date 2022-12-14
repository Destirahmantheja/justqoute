package com.si5b.justquote.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.si5b.justquote.Model.QuoteModel;
import com.si5b.justquote.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterQuote extends RecyclerView.Adapter<AdapterQuote.ViewHolder> {
    private List<QuoteModel> ListQuote = new ArrayList<>();
    private Context ctx;

    public AdapterQuote (List<QuoteModel> listQuote, Context ctx) {
        this.ListQuote = listQuote;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public AdapterQuote.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterQuote.ViewHolder holder, int position) {
        QuoteModel QM = ListQuote.get(position);
        holder.tvText.setText(QM.getText());
        holder.tvAuthor.setText(QM.getAuthor());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvText, tvAuthor;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvText = itemView.findViewById(R.id.tv_text);
            tvAuthor = itemView.findViewById(R.id.tv_author);
        }
    }
}

