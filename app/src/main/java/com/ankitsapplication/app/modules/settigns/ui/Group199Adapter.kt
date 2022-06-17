package com.ankitsapplication.app.modules.settigns.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ankitsapplication.app.R
import com.ankitsapplication.app.databinding.RowGroup199Binding
import com.ankitsapplication.app.modules.settigns.`data`.model.Group199RowModel
import kotlin.Int
import kotlin.collections.List

class Group199Adapter(
  var list: List<Group199RowModel>
) : RecyclerView.Adapter<Group199Adapter.RowGroup199VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGroup199VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_group199,parent,false)
    return RowGroup199VH(view)
  }

  override fun onBindViewHolder(holder: RowGroup199VH, position: Int) {
    val group199RowModel = Group199RowModel()
    // TODO uncomment following line after integration with data source
    // val group199RowModel = list[position]
    holder.binding.group199RowModel = group199RowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Group199RowModel>) {
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
      item: Group199RowModel
    ) {
    }
  }

  inner class RowGroup199VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGroup199Binding = RowGroup199Binding.bind(itemView)
  }
}
