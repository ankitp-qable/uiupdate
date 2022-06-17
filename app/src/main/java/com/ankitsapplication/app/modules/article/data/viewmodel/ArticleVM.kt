package com.ankitsapplication.app.modules.article.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitsapplication.app.modules.article.`data`.model.ArticleModel
import com.ankitsapplication.app.modules.article.`data`.model.RelatedarticleRowModel
import com.ankitsapplication.app.modules.article.`data`.model.TrendingsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ArticleVM : ViewModel(), KoinComponent {
  val articleModel: MutableLiveData<ArticleModel> = MutableLiveData(ArticleModel())

  var navArguments: Bundle? = null

  val trendingsList: MutableLiveData<MutableList<TrendingsRowModel>> =
      MutableLiveData(mutableListOf())

  val relatedArticleList: MutableLiveData<MutableList<RelatedarticleRowModel>> =
      MutableLiveData(mutableListOf())
}
