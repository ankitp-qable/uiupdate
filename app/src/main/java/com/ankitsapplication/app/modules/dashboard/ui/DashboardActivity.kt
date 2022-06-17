package com.ankitsapplication.app.modules.dashboard.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.base.BaseActivity
import com.ankitsapplication.app.databinding.ActivityDashboardBinding
import com.ankitsapplication.app.modules.ambulance.ui.AmbulanceActivity
import com.ankitsapplication.app.modules.article.ui.ArticleActivity
import com.ankitsapplication.app.modules.dashboard.`data`.model.DoctorRowModel
import com.ankitsapplication.app.modules.dashboard.`data`.viewmodel.DashboardVM
import com.ankitsapplication.app.modules.drlist.ui.DrListActivity
import com.ankitsapplication.app.modules.pharmacy.ui.PharmacyActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DashboardActivity : BaseActivity<ActivityDashboardBinding>(R.layout.activity_dashboard) {
  private val viewModel: DashboardVM by viewModels<DashboardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val doctorAdapter = DoctorAdapter(viewModel.doctorList.value?:mutableListOf())
    binding.recyclerDoctor.adapter = doctorAdapter
    doctorAdapter.setOnItemClickListener(
    object : DoctorAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DoctorRowModel) {
        onClickRecyclerDoctor(view, position, item)
      }
    }
    )
    viewModel.doctorList.observe(this) {
      doctorAdapter.updateData(it)
    }
    binding.dashboardVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtSeeall1.setOnClickListener {
      val destIntent = ArticleActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageMedicineIcon.setOnClickListener {
      val destIntent = PharmacyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageDoctorIcon.setOnClickListener {
      val destIntent = DrListActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageAmbulanceIcon.setOnClickListener {
      val destIntent = AmbulanceActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerDoctor(
    view: View,
    position: Int,
    item: DoctorRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DASHBOARD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DashboardActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
