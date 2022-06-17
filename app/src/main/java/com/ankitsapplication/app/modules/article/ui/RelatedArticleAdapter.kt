package com.ankitsapplication.app.modules.article.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ankitsapplication.app.R
import com.ankitsapplication.app.databinding.RowRelatedarticleBinding
import com.ankitsapplication.app.modules.article.`data`.model.RelatedarticleRowModel
import kotlin.Int
import kotlin.collections.List

class RelatedArticleAdapter(
  var list: List<RelatedarticleRowModel>
) : RecyclerView.Adapter<RelatedArticleAdapter.RowRelatedarticleVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowRelatedarticleVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_relatedarticle,parent,false)
    return RowRelatedarticleVH(view)
  }

  override fun onBindViewHolder(holder: RowRelatedarticleVH, position: Int) {
    val relatedarticleRowModel = RelatedarticleRowModel()
    // TODO uncomment following line after integration with data source
    // val relatedarticleRowModel = list[position]
    holder.binding.relatedarticleRowModel = relatedarticleRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<RelatedarticleRowModel>) {
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
      item: RelatedarticleRowModel
    ) {
    }
  }

  inner class RowRelatedarticleVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowRelatedarticleBinding = RowRelatedarticleBinding.bind(itemView)
  }
}
