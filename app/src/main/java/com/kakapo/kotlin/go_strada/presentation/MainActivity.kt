package com.kakapo.kotlin.go_strada.presentation

import  androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.kakapo.kotlin.go_strada.R
import com.kakapo.kotlin.go_strada.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var navController: NavController
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController = findNavController(R.id.main_nav_host)

        appBarConfiguration =
            AppBarConfiguration.Builder(
                R.id.homeFragment,
                R.id.classFragment,
                R.id.consultFragment,
                R.id.activityFragment
            )
                .setOpenableLayout(binding.mainDrawerLayout)
                .build()

        setSupportActionBar(binding.mainToolbar)

        setupActionBarWithNavController(
            navController,
            appBarConfiguration
        )

        visibilityNavElements(navController)
    }

    private fun visibilityNavElements(navController: NavController) {

        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.menu_absensi -> hideBothNavigation()
                R.id.menu_jadwal_kuliah -> hideBottomNavigation()
                R.id.menu_kalender_akademik -> hideBottomNavigation()
                R.id.menu_lihat_khs -> hideBottomNavigation()
                R.id.menu_none_akademik -> hideBottomNavigation()
                R.id.menu_pembayaran_spp -> hideBottomNavigation()
                R.id.menu_request_surat -> hideBottomNavigation()
                R.id.menu_riwayat_krs -> hideBottomNavigation()
                R.id.menu_transkrip_nilai -> hideBottomNavigation()
                else -> showBothNavigation()
            }
        }

    }

    private fun hideBothNavigation() {
        binding.mainBottomNavigationView.visibility = View.GONE
        binding.mainNavigationView.visibility = View.GONE
        binding.mainDrawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
    }

    private fun hideBottomNavigation() {
        binding.mainBottomNavigationView.visibility = View.GONE
        binding.mainNavigationView.visibility = View.VISIBLE
        binding.mainDrawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)

        binding.mainNavigationView.setupWithNavController(navController)
    }

    private fun showBothNavigation() {
        binding.mainBottomNavigationView.visibility = View.VISIBLE
        binding.mainNavigationView.visibility = View.VISIBLE
        binding.mainDrawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
        setupNavControl()
    }

    private fun setupNavControl() {
        binding.mainNavigationView.setupWithNavController(navController)
        binding.mainBottomNavigationView.setupWithNavController(navController)
    }

    fun exitApp() {
        this.finishAffinity()
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController, appBarConfiguration)
    }

    override fun onBackPressed() {
        when {
            binding.mainDrawerLayout.isDrawerOpen(GravityCompat.START) -> {
                binding.mainDrawerLayout.closeDrawer(GravityCompat.START)
            }
            else -> {
                super.onBackPressed()
            }
        }
    }
}