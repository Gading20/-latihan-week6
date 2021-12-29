package com.example.week6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.week6.databinding.FragmentFirstBinding

class Fragment_first : Fragment() {
    private lateinit var binding:FragmentFirstBinding
    private lateinit var com:Communicator
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentFirstBinding.inflate(layoutInflater)
        com=activity as Communicator

        binding.btnInput.setOnClickListener {
            com.dataNama(binding.edtInput.text.toString())
        }


        return binding.root
    }

}