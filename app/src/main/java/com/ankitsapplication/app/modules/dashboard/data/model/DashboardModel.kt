package com.ankitsapplication.app.modules.dashboard.`data`.model

import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DashboardModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFindyourdesir: String? =
      MyApp.getInstance().resources.getString(R.string.msg_find_your_desir)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEarlyprotectio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_early_protectio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLearnmorebutt: String? = MyApp.getInstance().resources.getString(R.string.lbl_learn_more)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTopDoctor: String? = MyApp.getInstance().resources.getString(R.string.lbl_top_doctor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeall: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHealtarticle: String? = MyApp.getInstance().resources.getString(R.string.lbl_healt_article)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeall1: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTheHealthiest: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_25_healthie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_jun_10_20212)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_5min_read2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMessages: String? = MyApp.getInstance().resources.getString(R.string.lbl_messages)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAppointment: String? = MyApp.getInstance().resources.getString(R.string.lbl_appointment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etSearchValue: String? = null
)
