package com.ankitsapplication.app.modules.pharmacy.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.base.BaseActivity
import com.ankitsapplication.app.databinding.ActivityPharmacyBinding
import com.ankitsapplication.app.modules.drugdetails.ui.DrugDetailsActivity
import com.ankitsapplication.app.modules.pharmacy.`data`.model.Drugs1RowModel
import com.ankitsapplication.app.modules.pharmacy.`data`.model.DrugsRowModel
import com.ankitsapplication.app.modules.pharmacy.`data`.viewmodel.PharmacyVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PharmacyActivity : BaseActivity<ActivityPharmacyBinding>(R.layout.activity_pharmacy) {
  private val viewModel: PharmacyVM by viewModels<PharmacyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val drugsAdapter = DrugsAdapter(viewModel.drugsList.value?:mutableListOf())
    binding.recyclerDrugs.adapter = drugsAdapter
    drugsAdapter.setOnItemClickListener(
    object : DrugsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DrugsRowModel) {
        onClickRecyclerDrugs(view, position, item)
      }
    }
    )
    viewModel.drugsList.observe(this) {
      drugsAdapter.updateData(it)
    }
    val drugs1Adapter = Drugs1Adapter(viewModel.drugs1List.value?:mutableListOf())
    binding.recyclerDrugs1.adapter = drugs1Adapter
    drugs1Adapter.setOnItemClickListener(
    object : Drugs1Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Drugs1RowModel) {
        onClickRecyclerDrugs1(view, position, item)
      }
    }
    )
    viewModel.drugs1List.observe(this) {
      drugs1Adapter.updateData(it)
    }
    binding.pharmacyVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerDrugs(
    view: View,
    position: Int,
    item: DrugsRowModel
  ): Unit {
    when(view.id) {
      R.id.linearGroup -> {
        val destIntent = DrugDetailsActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  fun onClickRecyclerDrugs1(
    view: View,
    position: Int,
    item: Drugs1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PHARMACY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PharmacyActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
