package com.stevens.magic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.magic.R
import com.example.magic.databinding.FragmentTournamentsBinding

class TournamentsFragment : Fragment() {

    private lateinit var viewModel: TournamentsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentTournamentsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_tournaments, container, false)

        viewModel = ViewModelProvider(this).get(TournamentsViewModel::class.java)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {
        fun newInstance() = TournamentsFragment()
    }


}