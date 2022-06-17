package com.ankitsapplication.app.modules.message1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitsapplication.app.modules.message1.`data`.model.Message1Model
import org.koin.core.KoinComponent

class Message1VM : ViewModel(), KoinComponent {
  val message1Model: MutableLiveData<Message1Model> = MutableLiveData(Message1Model())

  var navArguments: Bundle? = null
}
