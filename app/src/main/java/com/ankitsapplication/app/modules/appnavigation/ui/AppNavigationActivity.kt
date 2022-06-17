package com.ankitsapplication.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.base.BaseActivity
import com.ankitsapplication.app.databinding.ActivityAppNavigationBinding
import com.ankitsapplication.app.modules.ambulance.ui.AmbulanceActivity
import com.ankitsapplication.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.ankitsapplication.app.modules.article.ui.ArticleActivity
import com.ankitsapplication.app.modules.bookanappointment.ui.BookAnAppointmentActivity
import com.ankitsapplication.app.modules.cart.ui.CartActivity
import com.ankitsapplication.app.modules.chat.ui.ChatActivity
import com.ankitsapplication.app.modules.dashboard.ui.DashboardActivity
import com.ankitsapplication.app.modules.drdetails.ui.DrDetailsActivity
import com.ankitsapplication.app.modules.drlist.ui.DrListActivity
import com.ankitsapplication.app.modules.drugdetails.ui.DrugDetailsActivity
import com.ankitsapplication.app.modules.login.ui.LoginActivity
import com.ankitsapplication.app.modules.message1.ui.Message1Activity
import com.ankitsapplication.app.modules.pharmacy.ui.PharmacyActivity
import com.ankitsapplication.app.modules.schedule1.ui.Schedule1Activity
import com.ankitsapplication.app.modules.settigns.ui.SettignsActivity
import com.ankitsapplication.app.modules.signup.ui.SignupActivity
import com.ankitsapplication.app.modules.splashscreen.ui.SplashScreenActivity
import kotlin.String
import kotlin.Unit

class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearDrugDetails.setOnClickListener {
      val destIntent = DrugDetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLogin.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearBookAnAppointment.setOnClickListener {
      val destIntent = BookAnAppointmentActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearArticle.setOnClickListener {
      val destIntent = ArticleActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCart.setOnClickListener {
      val destIntent = CartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearMessage.setOnClickListener {
      val destIntent = Message1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDashboard.setOnClickListener {
      val destIntent = DashboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearChat.setOnClickListener {
      val destIntent = ChatActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDrDetails.setOnClickListener {
      val destIntent = DrDetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSplashScreen.setOnClickListener {
      val destIntent = SplashScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPharmacy.setOnClickListener {
      val destIntent = PharmacyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSettigns.setOnClickListener {
      val destIntent = SettignsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSignup.setOnClickListener {
      val destIntent = SignupActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDrList.setOnClickListener {
      val destIntent = DrListActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAmbulance.setOnClickListener {
      val destIntent = AmbulanceActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSchedule.setOnClickListener {
      val destIntent = Schedule1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APP_NAVIGATION_ACTIVITY"

  }
}
