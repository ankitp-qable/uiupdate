package com.ankitsapplication.app.modules.bookanappointment.`data`.model

import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BookAnAppointmentModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtApointment: String? = MyApp.getInstance().resources.getString(R.string.lbl_apointment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDrMarcusHori: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dr_marcus_hori)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChardiologist: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_chardiologist)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRatting: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.lbl_800m_away)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChange: String? = MyApp.getInstance().resources.getString(R.string.lbl_change)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReason: String? = MyApp.getInstance().resources.getString(R.string.lbl_reason)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChange1: String? = MyApp.getInstance().resources.getString(R.string.lbl_change)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentDetail: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_detail)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConsultation: String? = MyApp.getInstance().resources.getString(R.string.lbl_consultation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_60_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAdminFee: String? = MyApp.getInstance().resources.getString(R.string.lbl_admin_fee)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice1: String? = MyApp.getInstance().resources.getString(R.string.lbl_01_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAditionalDisco: String? =
      MyApp.getInstance().resources.getString(R.string.msg_aditional_disco)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotal: String? = MyApp.getInstance().resources.getString(R.string.lbl_total)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice2: String? = MyApp.getInstance().resources.getString(R.string.lbl_61_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentMethod: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_method)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVISA: String? = MyApp.getInstance().resources.getString(R.string.lbl_visa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChange2: String? = MyApp.getInstance().resources.getString(R.string.lbl_change)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotal1: String? = MyApp.getInstance().resources.getString(R.string.lbl_total)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice3: String? = MyApp.getInstance().resources.getString(R.string.lbl_61_002)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup22Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPriceValue: String? = null
)
