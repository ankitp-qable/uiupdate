package com.ankitsapplication.app.modules.settigns.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitsapplication.app.modules.settigns.`data`.model.Group198RowModel
import com.ankitsapplication.app.modules.settigns.`data`.model.Group199RowModel
import com.ankitsapplication.app.modules.settigns.`data`.model.SettignsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SettignsVM : ViewModel(), KoinComponent {
  val settignsModel: MutableLiveData<SettignsModel> = MutableLiveData(SettignsModel())

  var navArguments: Bundle? = null

  val group198List: MutableLiveData<MutableList<Group198RowModel>> =
      MutableLiveData(mutableListOf())

  val group199List: MutableLiveData<MutableList<Group199RowModel>> =
      MutableLiveData(mutableListOf())
}
