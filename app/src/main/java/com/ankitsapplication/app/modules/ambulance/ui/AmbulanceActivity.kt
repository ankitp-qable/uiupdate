package com.ankitsapplication.app.modules.ambulance.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.base.BaseActivity
import com.ankitsapplication.app.databinding.ActivityAmbulanceBinding
import com.ankitsapplication.app.modules.ambulance.`data`.viewmodel.AmbulanceVM
import kotlin.String
import kotlin.Unit

class AmbulanceActivity : BaseActivity<ActivityAmbulanceBinding>(R.layout.activity_ambulance) {
  private val viewModel: AmbulanceVM by viewModels<AmbulanceVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.ambulanceVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "AMBULANCE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AmbulanceActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
