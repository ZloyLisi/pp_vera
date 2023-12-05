package com.example.vera

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.vera.databinding.ActivityDetailedBinding

class DetailedActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityDetailedBinding
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailedBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_detailed)
        var count = 0
        val argument:Bundle? = intent.extras

        val firstFragment = coffin()
        val wreathsFragment = wreaths()
        val thirdFragment = cross()
        val fourthFragment = urns()




        if (argument != null){
            count = argument.getInt(MainActivity.COUNT)
        }

        when(count){
            0 -> {
                launchFragment(firstFragment)
            }
            1 -> {
                launchFragment(wreathsFragment)
            }
            2 -> {
                launchFragment(thirdFragment)
            }
            3 -> {
                launchFragment(fourthFragment)
            }
            4 -> {
               val intent = Intent (this@DetailedActivity , ZakazUserActivity::class.java)
                startActivity(intent)
                finish()
            }


        }

    }
    val fragmentManager = supportFragmentManager

    fun launchFragment(fragment: Fragment) {
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.frame, fragment)
        transaction.commit()
    }
}