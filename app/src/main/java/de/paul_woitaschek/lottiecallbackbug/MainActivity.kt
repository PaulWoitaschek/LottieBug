package de.paul_woitaschek.lottiecallbackbug

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView
import com.airbnb.lottie.LottieProperty
import com.airbnb.lottie.model.KeyPath
import com.airbnb.lottie.value.LottieValueCallback

class MainActivity : AppCompatActivity() {

    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val lottie = LottieAnimationView(this)
        setContentView(lottie)

        lottie.setAnimation("HamburgerArrow.json")

        val valueCallback = LottieValueCallback(0)
        lottie.addValueCallback(KeyPath("A3", "**"), LottieProperty.OPACITY, valueCallback)
        valueCallback.setValue(100)
    }
}
