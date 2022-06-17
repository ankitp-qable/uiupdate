package com.ankitsapplication.app.modules.drdetails.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ankitsapplication.app.R
import com.ankitsapplication.app.databinding.RowDrDetailsBinding
import com.ankitsapplication.app.modules.drdetails.`data`.model.DrDetailsRowModel
import kotlin.Int
import kotlin.collections.List

class DrDetailsAdapter(
  var list: List<DrDetailsRowModel>
) : RecyclerView.Adapter<DrDetailsAdapter.RowDrDetailsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDrDetailsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_dr_details,parent,false)
    return RowDrDetailsVH(view)
  }

  override fun onBindViewHolder(holder: RowDrDetailsVH, position: Int) {
    val drDetailsRowModel = DrDetailsRowModel()
    // TODO uncomment following line after integration with data source
    // val drDetailsRowModel = list[position]
    holder.binding.drDetailsRowModel = drDetailsRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<DrDetailsRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: DrDetailsRowModel
    ) {
    }
  }

  inner class RowDrDetailsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowDrDetailsBinding = RowDrDetailsBinding.bind(itemView)
    init {
      binding.btn0900Am.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, DrDetailsRowModel())
      }
      binding.btn1000Am.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, DrDetailsRowModel())
      }
      binding.btn1100Am.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, DrDetailsRowModel())
      }
    }
  }
}
