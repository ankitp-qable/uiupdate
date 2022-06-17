package com.ankitsapplication.app.modules.settigns.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.base.BaseActivity
import com.ankitsapplication.app.databinding.ActivitySettignsBinding
import com.ankitsapplication.app.modules.settigns.`data`.model.Group198RowModel
import com.ankitsapplication.app.modules.settigns.`data`.model.Group199RowModel
import com.ankitsapplication.app.modules.settigns.`data`.viewmodel.SettignsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SettignsActivity : BaseActivity<ActivitySettignsBinding>(R.layout.activity_settigns) {
  private val viewModel: SettignsVM by viewModels<SettignsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val group198Adapter = Group198Adapter(viewModel.group198List.value?:mutableListOf())
    binding.recyclerGroup198.adapter = group198Adapter
    group198Adapter.setOnItemClickListener(
    object : Group198Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Group198RowModel) {
        onClickRecyclerGroup198(view, position, item)
      }
    }
    )
    viewModel.group198List.observe(this) {
      group198Adapter.updateData(it)
    }
    val group199Adapter = Group199Adapter(viewModel.group199List.value?:mutableListOf())
    binding.recyclerGroup199.adapter = group199Adapter
    group199Adapter.setOnItemClickListener(
    object : Group199Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Group199RowModel) {
        onClickRecyclerGroup199(view, position, item)
      }
    }
    )
    viewModel.group199List.observe(this) {
      group199Adapter.updateData(it)
    }
    binding.settignsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerGroup198(
    view: View,
    position: Int,
    item: Group198RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerGroup199(
    view: View,
    position: Int,
    item: Group199RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SETTIGNS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SettignsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
