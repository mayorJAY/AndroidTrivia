package com.example.android.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.android.navigation.databinding.FragmentGameOverBinding

class GameOverFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        //val viewRoot = LayoutInflater.from(context).inflate(R.layout.fragment_game_over, container, false)
        //val binding: FragmentGameOverBinding? = DataBindingUtil.bind(viewRoot)
        val binding: FragmentGameOverBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_game_over, container, false)
        binding.tryAgainButton.setOnClickListener(Navigation.createNavigateOnClickListener(GameOverFragmentDirections.actionGameOverFragment2ToGameFragment()))
        return binding.root
    }
}
