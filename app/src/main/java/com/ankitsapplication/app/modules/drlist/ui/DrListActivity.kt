package com.ankitsapplication.app.modules.drlist.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.base.BaseActivity
import com.ankitsapplication.app.databinding.ActivityDrListBinding
import com.ankitsapplication.app.modules.drdetails.ui.DrDetailsActivity
import com.ankitsapplication.app.modules.drlist.`data`.model.DoctorsRowModel
import com.ankitsapplication.app.modules.drlist.`data`.viewmodel.DrListVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DrListActivity : BaseActivity<ActivityDrListBinding>(R.layout.activity_dr_list) {
  private val viewModel: DrListVM by viewModels<DrListVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val doctorsAdapter = DoctorsAdapter(viewModel.doctorsList.value?:mutableListOf())
    binding.recyclerDoctors.adapter = doctorsAdapter
    doctorsAdapter.setOnItemClickListener(
    object : DoctorsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DoctorsRowModel) {
        onClickRecyclerDoctors(view, position, item)
      }
    }
    )
    viewModel.doctorsList.observe(this) {
      doctorsAdapter.updateData(it)
    }
    binding.drListVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerDoctors(
    view: View,
    position: Int,
    item: DoctorsRowModel
  ): Unit {
    when(view.id) {
      R.id.linearGroup -> {
        val destIntent = DrDetailsActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "DR_LIST_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DrListActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
