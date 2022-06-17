package com.ankitsapplication.app.modules.message1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.base.BaseActivity
import com.ankitsapplication.app.databinding.ActivityMessage1Binding
import com.ankitsapplication.app.modules.message1.`data`.viewmodel.Message1VM
import com.google.android.material.tabs.TabLayoutMediator
import kotlin.String
import kotlin.Unit

class Message1Activity : BaseActivity<ActivityMessage1Binding>(R.layout.activity_message1) {
  private val viewModel: Message1VM by viewModels<Message1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.message1VM = viewModel
    val adapter = Message1ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerGroup124.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup4,binding.viewPagerGroup124) { tab, position ->
      tab.text = Message1ActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "MESSAGE1ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, Message1Activity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
