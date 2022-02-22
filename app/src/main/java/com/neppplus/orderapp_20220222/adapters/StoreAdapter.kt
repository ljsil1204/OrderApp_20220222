package com.neppplus.orderapp_20220222.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.neppplus.orderapp_20220222.R
import com.neppplus.orderapp_20220222.datas.StoreData

class StoreAdapter(
    val mContext : Context,
    resId : Int,
    val mList : ArrayList<StoreData>,
) : ArrayAdapter<StoreData>(mContext, resId, mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var temRow = convertView

        if (temRow == null) {
            temRow = LayoutInflater.from(mContext).inflate(R.layout.store_list_item, null)
        }

        val row = temRow!!

        return row

    }

}