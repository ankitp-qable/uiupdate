package com.ankitsapplication.app.modules.settigns.`data`.model

import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Group198RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeartrate: String? = MyApp.getInstance().resources.getString(R.string.lbl_heart_rate)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHeartratecoun: String? = MyApp.getInstance().resources.getString(R.string.lbl_215bpm)

)
