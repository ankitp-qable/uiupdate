package com.ankitsapplication.app.modules.ambulance.`data`.model

import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AmbulanceModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAmbulance: String? = MyApp.getInstance().resources.getString(R.string.lbl_ambulance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddress: String? = MyApp.getInstance().resources.getString(R.string.msg_2640_cabin_cree)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup67: String? = MyApp.getInstance().resources.getString(R.string.msg_confirm_locatio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etSearchValue: String? = null
)
