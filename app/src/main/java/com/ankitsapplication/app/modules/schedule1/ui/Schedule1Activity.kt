package com.ankitsapplication.app.modules.schedule1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.base.BaseActivity
import com.ankitsapplication.app.databinding.ActivitySchedule1Binding
import com.ankitsapplication.app.modules.schedule1.`data`.viewmodel.Schedule1VM
import com.google.android.material.tabs.TabLayoutMediator
import kotlin.String
import kotlin.Unit

class Schedule1Activity : BaseActivity<ActivitySchedule1Binding>(R.layout.activity_schedule1) {
  private val viewModel: Schedule1VM by viewModels<Schedule1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.schedule1VM = viewModel
    val adapter = Schedule1ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerGroup148.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup13,binding.viewPagerGroup148) { tab, position ->
      tab.text = Schedule1ActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "SCHEDULE1ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, Schedule1Activity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
