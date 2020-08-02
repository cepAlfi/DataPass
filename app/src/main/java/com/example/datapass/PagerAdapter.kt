@file:Suppress("DEPRECATION")

package com.example.datapass

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> BundlePass()
            1 -> Serializable()
            else -> Parcelable()
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "Bundle"
            1 -> "Serializable"
            else -> "Parcelable"
        }
    }


}