package com.ankitsapplication.app.modules.drlist.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ankitsapplication.app.R
import com.ankitsapplication.app.databinding.RowDoctorsBinding
import com.ankitsapplication.app.modules.drlist.`data`.model.DoctorsRowModel
import kotlin.Int
import kotlin.collections.List

class DoctorsAdapter(
  var list: List<DoctorsRowModel>
) : RecyclerView.Adapter<DoctorsAdapter.RowDoctorsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDoctorsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_doctors,parent,false)
    return RowDoctorsVH(view)
  }

  override fun onBindViewHolder(holder: RowDoctorsVH, position: Int) {
    val doctorsRowModel = DoctorsRowModel()
    // TODO uncomment following line after integration with data source
    // val doctorsRowModel = list[position]
    holder.binding.doctorsRowModel = doctorsRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<DoctorsRowModel>) {
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
      item: DoctorsRowModel
    ) {
    }
  }

  inner class RowDoctorsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowDoctorsBinding = RowDoctorsBinding.bind(itemView)
    init {
      binding.linearGroup.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, DoctorsRowModel())
      }
    }
  }
}
