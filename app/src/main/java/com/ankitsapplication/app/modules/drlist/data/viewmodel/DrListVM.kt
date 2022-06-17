package com.ankitsapplication.app.modules.drlist.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitsapplication.app.modules.drlist.`data`.model.DoctorsRowModel
import com.ankitsapplication.app.modules.drlist.`data`.model.DrListModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DrListVM : ViewModel(), KoinComponent {
  val drListModel: MutableLiveData<DrListModel> = MutableLiveData(DrListModel())

  var navArguments: Bundle? = null

  val doctorsList: MutableLiveData<MutableList<DoctorsRowModel>> = MutableLiveData(mutableListOf())
}
