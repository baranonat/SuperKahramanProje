package com.baranonat.recyclerviewsuperkahraman

import android.text.Layout.Directions
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.baranonat.recyclerviewsuperkahraman.databinding.RecyclerRowBinding
import com.baranonat.recyclerviewsuperkahraman.MainFragment

class SuperKahramanAdapter(val superKahramanListesi:ArrayList<SuperKahraman>):RecyclerView.Adapter<SuperKahramanAdapter.SuperKahramanViewHolder>() {
    class SuperKahramanViewHolder(val binding:RecyclerRowBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperKahramanViewHolder {
       val binding=RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return SuperKahramanViewHolder(binding)

    }

    override fun getItemCount(): Int {
        return superKahramanListesi.size
    }

    override fun onBindViewHolder(holder: SuperKahramanViewHolder, position: Int) {

        holder.binding.textView.text=superKahramanListesi[position].isim

        holder.itemView.setOnClickListener {
       val action= MainFragmentDirections.actionMainFragmentToTanitimFragment(superKahramanListesi[position])
            Navigation.findNavController(it).navigate(action)

        }


    }
}