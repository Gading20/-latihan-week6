package com.example.week6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.week6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),Communicator {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setfragment(Fragment_first())
    }
    private fun setfragment(fragment:Fragment){
        supportFragmentManager.beginTransaction().add(R.id.edt_input,fragment).commit()
    }

    override fun dataNama(input: String) {
        val bundle:Bundle= Bundle()
        bundle.putString("Kunci",input)


        val fragment2=Fragment2()
        fragment2.arguments=bundle

        supportFragmentManager.beginTransaction().replace(R.id.edt_input,fragment2).commit()
    }
}