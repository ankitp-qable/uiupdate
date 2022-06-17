package com.ankitsapplication.app.modules.signup.`data`.model

import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignupModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLetsGetStart: String? =
      MyApp.getInstance().resources.getString(R.string.msg_let_s_get_start)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateannewa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_an_new_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignup: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_have_an_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup35Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup34Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup33Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup32Value: String? = null
)
