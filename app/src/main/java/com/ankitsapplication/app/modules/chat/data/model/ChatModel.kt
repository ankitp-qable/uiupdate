package com.ankitsapplication.app.modules.chat.`data`.model

import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ChatModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDrMarcusHori: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dr_marcus_hori)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConsultionStar: String? =
      MyApp.getInstance().resources.getString(R.string.msg_consultion_star)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYoucanconsult: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_can_consult)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDrMarcusHori1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dr_marcus_hori)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_min_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.msg_i_have_sufferin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDrMarcusHori2: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dr_marcus_hori)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime1: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_min_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChat3: String? = MyApp.getInstance().resources.getString(R.string.msg_ok_do_you_have)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIdonthavean: String? =
      MyApp.getInstance().resources.getString(R.string.msg_i_don_t_have_an2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDrMarcusHori3: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dr_marcus_hori)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnline: String? = MyApp.getInstance().resources.getString(R.string.lbl_online)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etChatboxValue: String? = null
)
