import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class OnbordingViewViewModel @Inject constructor(): ViewModel(){





    init {
        Log.d(TAG,"init of block OnboardingViewViewModel")
    }

    companion object{
        const val TAG = "OnboardingViewViewModel"
    }
}