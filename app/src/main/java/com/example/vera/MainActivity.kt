package com.example.vera

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.AdapterView
import com.example.vera.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    companion object {
        const val COUNT = "COUNT"
    }

    private lateinit var binding: ActivityMainBinding
    private lateinit var listAdapter: ListAdapter
    private lateinit var listData: ListData
    var dataArrayList = ArrayList<ListData?>()

    @SuppressLint("ResourceType")

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val nameList = arrayOf("Гробы", "Венки", "Кресты", "Урны для праха", "Оставить заявку")

        val imageList = arrayOf(
            R.drawable.icon_grob,
            R.drawable.icon_venok,
            R.drawable.icon_krest,
            R.drawable.icon_urna,
            R.drawable.zayavka
        )
        for (i in imageList.indices) {
            listData = ListData(nameList[i], imageList[i])
            dataArrayList.add(listData)
        }
        listAdapter = ListAdapter(this@MainActivity, dataArrayList)
        binding.listView.adapter = listAdapter
        binding.listView.isClickable = true

        binding.listView.onItemClickListener =
            AdapterView.OnItemClickListener { adapterView, view, i, l ->
                val intent = Intent(this@MainActivity, DetailedActivity::class.java)

                intent.putExtra(COUNT, i)
                startActivity(intent)
            }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)

        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.about_menu_item -> {


                val intent = Intent(this,OProgrammeActivity::class.java)
                intent.putExtra("file_name","Опрограмме.txt")
                startActivity(intent)

            }

            R.id.reference_menu_item -> {
                val intent = Intent(this,SpravkaActivity::class.java)
                intent.putExtra("file_name_","Сведенье.txt")
                startActivity(intent)
            }

        }
        return super.onOptionsItemSelected(item)
    }



}

