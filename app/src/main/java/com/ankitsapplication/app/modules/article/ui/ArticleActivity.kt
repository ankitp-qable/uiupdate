package com.ankitsapplication.app.modules.article.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.base.BaseActivity
import com.ankitsapplication.app.databinding.ActivityArticleBinding
import com.ankitsapplication.app.modules.article.`data`.model.RelatedarticleRowModel
import com.ankitsapplication.app.modules.article.`data`.model.TrendingsRowModel
import com.ankitsapplication.app.modules.article.`data`.viewmodel.ArticleVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ArticleActivity : BaseActivity<ActivityArticleBinding>(R.layout.activity_article) {
  private val viewModel: ArticleVM by viewModels<ArticleVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val trendingsAdapter = TrendingsAdapter(viewModel.trendingsList.value?:mutableListOf())
    binding.recyclerTrendings.adapter = trendingsAdapter
    trendingsAdapter.setOnItemClickListener(
    object : TrendingsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : TrendingsRowModel) {
        onClickRecyclerTrendings(view, position, item)
      }
    }
    )
    viewModel.trendingsList.observe(this) {
      trendingsAdapter.updateData(it)
    }
    val relatedArticleAdapter =
    RelatedArticleAdapter(viewModel.relatedArticleList.value?:mutableListOf())
    binding.recyclerRelatedArticle.adapter = relatedArticleAdapter
    relatedArticleAdapter.setOnItemClickListener(
    object : RelatedArticleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : RelatedarticleRowModel) {
        onClickRecyclerRelatedArticle(view, position, item)
      }
    }
    )
    viewModel.relatedArticleList.observe(this) {
      relatedArticleAdapter.updateData(it)
    }
    binding.articleVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerTrendings(
    view: View,
    position: Int,
    item: TrendingsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerRelatedArticle(
    view: View,
    position: Int,
    item: RelatedarticleRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ARTICLE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ArticleActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
