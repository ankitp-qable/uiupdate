package com.ankitsapplication.app.modules.settigns.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ankitsapplication.app.R
import com.ankitsapplication.app.databinding.RowGroup198Binding
import com.ankitsapplication.app.modules.settigns.`data`.model.Group198RowModel
import kotlin.Int
import kotlin.collections.List

class Group198Adapter(
  var list: List<Group198RowModel>
) : RecyclerView.Adapter<Group198Adapter.RowGroup198VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGroup198VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_group198,parent,false)
    return RowGroup198VH(view)
  }

  override fun onBindViewHolder(holder: RowGroup198VH, position: Int) {
    val group198RowModel = Group198RowModel()
    // TODO uncomment following line after integration with data source
    // val group198RowModel = list[position]
    holder.binding.group198RowModel = group198RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Group198RowModel>) {
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
      item: Group198RowModel
    ) {
    }
  }

  inner class RowGroup198VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGroup198Binding = RowGroup198Binding.bind(itemView)
  }
}
