package com.stevens.magic

import android.util.Log
import androidx.lifecycle.ViewModel

class TournamentsViewModel : ViewModel() {
    init {
        Log.i("@@KES", "TournamentsViewModel created")
    }
    // TODO: Implement the ViewModel
    override fun onCleared() {
        super.onCleared()
        Log.i("@@KES", "TournamentsViewModel destroyed")
    }
}