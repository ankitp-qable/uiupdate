package com.ankitsapplication.app.modules.article.`data`.model

import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ArticleModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtArticles: String? = MyApp.getInstance().resources.getString(R.string.lbl_articles)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPopularArticle: String? =
      MyApp.getInstance().resources.getString(R.string.msg_popular_article)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCovidninteeng: String? = MyApp.getInstance().resources.getString(R.string.lbl_covid_19)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDietgroup: String? = MyApp.getInstance().resources.getString(R.string.lbl_diet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFitnessgroup: String? = MyApp.getInstance().resources.getString(R.string.lbl_fitness)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTrendingArticl: String? =
      MyApp.getInstance().resources.getString(R.string.msg_trending_articl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeall: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRelatedArticle: String? =
      MyApp.getInstance().resources.getString(R.string.msg_related_article)
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
