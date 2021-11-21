package com.stevens.magic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.magic.R

/**
 * A simple [Fragment] subclass.
 * Use the [PlayersFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PlayersFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_players, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment PlayersFragment.
         */
        @JvmStatic
        fun newInstance() =
            PlayersFragment().apply {
            }
    }
}