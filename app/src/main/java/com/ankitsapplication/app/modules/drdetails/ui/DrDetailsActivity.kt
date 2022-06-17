package com.ankitsapplication.app.modules.drdetails.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.base.BaseActivity
import com.ankitsapplication.app.databinding.ActivityDrDetailsBinding
import com.ankitsapplication.app.modules.bookanappointment.ui.BookAnAppointmentActivity
import com.ankitsapplication.app.modules.chat.ui.ChatActivity
import com.ankitsapplication.app.modules.drdetails.`data`.model.DrDetailsRowModel
import com.ankitsapplication.app.modules.drdetails.`data`.viewmodel.DrDetailsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DrDetailsActivity : BaseActivity<ActivityDrDetailsBinding>(R.layout.activity_dr_details) {
  private val viewModel: DrDetailsVM by viewModels<DrDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val drDetailsAdapter = DrDetailsAdapter(viewModel.drDetailsList.value?:mutableListOf())
    binding.recyclerDrDetails.adapter = drDetailsAdapter
    drDetailsAdapter.setOnItemClickListener(
    object : DrDetailsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DrDetailsRowModel) {
        onClickRecyclerDrDetails(view, position, item)
      }
    }
    )
    viewModel.drDetailsList.observe(this) {
      drDetailsAdapter.updateData(it)
    }
    binding.drDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBookApointment.setOnClickListener {
      val destIntent = BookAnAppointmentActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageChatIcon.setOnClickListener {
      val destIntent = ChatActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerDrDetails(
    view: View,
    position: Int,
    item: DrDetailsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DR_DETAILS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DrDetailsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
