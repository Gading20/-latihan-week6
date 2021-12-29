package com.example.week6

import android.os.Bundle
import android.renderscript.ScriptGroup
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.week6.databinding.Fragment2Binding
import com.example.week6.databinding.FragmentFirstBinding

class Fragment2 : Fragment() {
    // pesen memory
    private lateinit var binding: Fragment2Binding
    private lateinit var com: Communicator
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // mengisi memori pesenan sesuai type
        binding = Fragment2Binding.inflate(layoutInflater)

        val dataOutput = arguments?.getString("Kunci")
        binding.edtInput.text = dataOutput
        return binding.root
    }
}
