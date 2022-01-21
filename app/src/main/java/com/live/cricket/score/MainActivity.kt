package com.live.cricket.score

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.live.cricket.score.adapters.ViewPagerAdapter
import com.live.cricket.score.fragments.CompletedFragment
import com.live.cricket.score.fragments.LiveFragment
import com.live.cricket.score.fragments.UpcomingFragment

class MainActivity : AppCompatActivity() {
    private lateinit var pager: ViewPager
    private lateinit var tab: TabLayout
    private lateinit var bar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()

        setSupportActionBar(bar)

        val adapter = ViewPagerAdapter(supportFragmentManager)

        adapter.addFragment(LiveFragment(), "LIVE")
        adapter.addFragment(CompletedFragment(), "COMPLETED")
        adapter.addFragment(UpcomingFragment(), "UPCOMING")

        pager.adapter = adapter

        tab.setupWithViewPager(pager)
    }
    private fun init(){
        pager = findViewById(R.id.viewPager)
        tab = findViewById(R.id.tabs)
        bar = findViewById(R.id.toolbar)

    }
}