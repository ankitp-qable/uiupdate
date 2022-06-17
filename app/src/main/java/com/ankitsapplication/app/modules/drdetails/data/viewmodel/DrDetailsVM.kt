package com.ankitsapplication.app.modules.drdetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitsapplication.app.modules.drdetails.`data`.model.DrDetailsModel
import com.ankitsapplication.app.modules.drdetails.`data`.model.DrDetailsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DrDetailsVM : ViewModel(), KoinComponent {
  val drDetailsModel: MutableLiveData<DrDetailsModel> = MutableLiveData(DrDetailsModel())

  var navArguments: Bundle? = null

  val drDetailsList: MutableLiveData<MutableList<DrDetailsRowModel>> =
      MutableLiveData(mutableListOf())
}
