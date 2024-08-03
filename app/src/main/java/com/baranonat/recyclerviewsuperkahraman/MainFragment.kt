package com.baranonat.recyclerviewsuperkahraman

import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.baranonat.recyclerviewsuperkahraman.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    private lateinit var superKahramanListesi:ArrayList<SuperKahraman>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val batman=SuperKahraman("Batman","Futbol",R.drawable.batman)
        val superman=SuperKahraman("Superman","Yazılım",R.drawable.superman)
        val ironman=SuperKahraman("İronman","Holding Sahibi",R.drawable.ironman)
        val aquman=SuperKahraman("Aquman","Kral",R.drawable.aquaman)

        superKahramanListesi= arrayListOf(batman,superman,ironman,aquman)


        val adapter=SuperKahramanAdapter(superKahramanListesi)
        binding.SuperKahramanRecyclerView.layoutManager=LinearLayoutManager(requireContext())
        binding.SuperKahramanRecyclerView.adapter=adapter


    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}