package com.baranonat.recyclerviewsuperkahraman

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.baranonat.recyclerviewsuperkahraman.databinding.FragmentMainBinding
import com.baranonat.recyclerviewsuperkahraman.databinding.FragmentTanitimBinding


class TanitimFragment : Fragment() {
    private var _binding: FragmentTanitimBinding? = null

    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTanitimBinding.inflate(inflater, container, false)
        val view = binding.root
        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val secilenKahraman=MySingleton.secilenKahraman
        arguments?.let {


            binding.textViewIsim.text=secilenKahraman!!.isim
            binding.textView2Meslek.text=secilenKahraman.meslek
            binding.imageView.setImageResource(secilenKahraman.gorsel)
            /*
            val isim = TanitimFragmentArgs.fromBundle(it).secilenKahraman.isim
             binding.textViewIsim.text=isim

            val meslek = TanitimFragmentArgs.fromBundle(it).secilenKahraman.meslek
            binding.textView2Meslek.text=meslek

            val gorsel =TanitimFragmentArgs.fromBundle(it).secilenKahraman.gorsel
            binding.imageView.setImageResource(gorsel)
*/
        }


    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}