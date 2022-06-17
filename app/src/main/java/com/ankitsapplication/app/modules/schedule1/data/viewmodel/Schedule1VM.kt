package com.ankitsapplication.app.modules.schedule1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitsapplication.app.modules.schedule1.`data`.model.Schedule1Model
import org.koin.core.KoinComponent

class Schedule1VM : ViewModel(), KoinComponent {
  val schedule1Model: MutableLiveData<Schedule1Model> = MutableLiveData(Schedule1Model())

  var navArguments: Bundle? = null
}
