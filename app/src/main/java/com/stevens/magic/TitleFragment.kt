package com.stevens.magic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.magic.R
import com.example.magic.databinding.FragmentTitleBinding

/**
 * A simple [Fragment] subclass.
 * Use the [TitleFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TitleFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding: FragmentTitleBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_title, container, false)
        binding.tournamentsButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_tournamentsFragment)
        )
        binding.playersButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_playersFragment)
        )
        binding.toolsButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_toolsFragment)
        )
        return binding.root
    }

    companion object {
        fun newInstance() = TitleFragment()
    }
}