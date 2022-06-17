package com.ankitsapplication.app.modules.pharmacy.`data`.model

import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PharmacyModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPharmacy: String? = MyApp.getInstance().resources.getString(R.string.lbl_pharmacy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrderquicklyw: String? =
      MyApp.getInstance().resources.getString(R.string.msg_order_quickly_w)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUploadPrescrip: String? =
      MyApp.getInstance().resources.getString(R.string.msg_upload_prescrip)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPopularProduct: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_popular_product)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeall: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProductonSale: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_product_on_sale)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeall1: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etSearchValue: String? = null
)
