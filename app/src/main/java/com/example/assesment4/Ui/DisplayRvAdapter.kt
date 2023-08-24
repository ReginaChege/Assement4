
package com.example.assesment4.Ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assesment4.Model.Display
import com.example.assesment4.databinding.DisplayListItemBinding

class DisplayRvAdapter(private val displayList: List<Display>) : RecyclerView.Adapter<DisplayRvAdapter.DisplayViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DisplayViewHolder {
        val binding = DisplayListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DisplayViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DisplayViewHolder, position: Int) {
        val currentDisplay = displayList[position]
        val binding = holder.binding
        binding.tvid.text = currentDisplay.Id.toString()
        binding.tvuserId.text = currentDisplay.userId.toString()
        binding.tvbody.text = currentDisplay.body
        binding.tvtitle.text = currentDisplay.title
    }

    override fun getItemCount(): Int {
        return displayList.size
    }

    class DisplayViewHolder(val binding: DisplayListItemBinding) : RecyclerView.ViewHolder(binding.root)
}
