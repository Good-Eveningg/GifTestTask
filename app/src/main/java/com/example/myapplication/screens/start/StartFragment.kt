package com.example.myapplication.screens.start

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.data.GIF_KEY
import kotlinx.android.synthetic.main.fragment_start.view.*
import org.koin.androidx.viewmodel.ext.android.viewModel


class StartFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    private val adapter: StartAdapter by lazy { StartAdapter(requireContext()) }
    private val startViewModel by viewModel<StartViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_start, container, false)
        recyclerView = v.rv_first
        recyclerView.adapter = adapter
        startViewModel.myGifList.observe(viewLifecycleOwner) {
            adapter.setList(it)
        }
        startViewModel.getGifs()
        return v

    }

    companion object {
        fun clickGif(url: String, view: View) {
            val bundle = Bundle()
            bundle.putString(GIF_KEY, url)
            view.findNavController().navigate(R.id.action_startFragment_to_detailedFragment, bundle)
        }
    }

}