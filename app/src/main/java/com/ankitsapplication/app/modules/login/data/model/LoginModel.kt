package com.ankitsapplication.app.modules.login.`data`.model

import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcometoHiDo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_to_hido)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignintocont: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_in_to_cont)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignin: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_don_t_have_an_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup31Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup30Value: String? = null
)
