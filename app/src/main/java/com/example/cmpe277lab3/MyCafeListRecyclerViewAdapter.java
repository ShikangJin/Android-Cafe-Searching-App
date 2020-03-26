package com.example.cmpe277lab3;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.cmpe277lab3.CafeListFragment.OnListFragmentInteractionListener;
import java.util.List;

public class MyCafeListRecyclerViewAdapter extends RecyclerView.Adapter<MyCafeListRecyclerViewAdapter.ViewHolder> {

    private final List<Cafe> mValues;
    private final OnListFragmentInteractionListener mListener;

    public MyCafeListRecyclerViewAdapter(List<Cafe> items, OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // HERE IS THE VIEW FOR ONE LIST ITEM!!!!
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_cafe, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        // HERE IS THE VIEW FOR ONE LIST ITEM!!!!
        holder.mItem = mValues.get(position);
        holder.mRatingView.setText("Rate: " + Double.toString(mValues.get(position).rating));
        holder.mContentView.setText(mValues.get(position).content);
        holder.mAddressView.setText(mValues.get(position).address);

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction((List<Cafe>) holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mContentView;
        public final TextView mRatingView;
        public final TextView mAddressView;
        public Cafe mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mRatingView = (TextView) view.findViewById(R.id.rating);
            mContentView = (TextView) view.findViewById(R.id.content);
            mAddressView = view.findViewById(R.id.address);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}
