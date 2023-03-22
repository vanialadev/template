package br.com.vaniala.template

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber
import timber.log.Timber.DebugTree
/**
 * Created by Vânia Almeida (Github: @vanialadev)
 * on 22/03/23.
 *
 */
@HiltAndroidApp
class AppApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(DebugTree())
        }
    }
}
