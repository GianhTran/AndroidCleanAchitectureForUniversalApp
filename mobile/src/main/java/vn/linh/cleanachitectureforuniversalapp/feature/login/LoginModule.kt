package vn.linh.cleanachitectureforuniversalapp.feature.login

import com.hieupham.absolutecleanarchitecturekt.di.FragmentScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module()
abstract class LoginModule {

    @ContributesAndroidInjector
    @FragmentScope
    internal abstract fun bindLoginFragment(): LoginFragment
}