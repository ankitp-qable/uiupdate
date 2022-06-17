package com.ankitsapplication.app.modules.message.`data`.model

import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MessageRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDrMarcusHori: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dr_marcus_hori)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_24)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIdonthavean: String? =
      MyApp.getInstance().resources.getString(R.string.msg_i_don_t_have_an)

)
