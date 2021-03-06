package com.siliconlabs.bledemo.Adapters;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.siliconlabs.bledemo.Bluetooth.BLE.BluetoothDeviceInfo;

public abstract class DeviceInfoViewHolder<T extends BluetoothDeviceInfo> extends RecyclerView.ViewHolder implements View.OnClickListener {

    private View.OnClickListener onClickListener;

    public abstract void setData(T info, int position, int size);

    public DeviceInfoViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void onClick(View v) {
        if (onClickListener != null) {
            onClickListener.onClick(v);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public abstract static class Generator {

        private int layoutResId;

        public Generator(int resId) {
            this.layoutResId = resId;
        }

        public DeviceInfoViewHolder generate(ViewGroup parent) {
            final LayoutInflater li = LayoutInflater.from(parent.getContext());
            View itemView = li.inflate(layoutResId, parent, false);
            return generate(itemView);
        }

        public abstract DeviceInfoViewHolder generate(View itemView);
    }

}
