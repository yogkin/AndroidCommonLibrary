package com.renyu.androidcommonlibrary.activity

import android.graphics.Color
import com.renyu.androidcommonlibrary.R
import com.renyu.androidcommonlibrary.fragment.EmptyFragment
import com.renyu.commonlibrary.baseact.BaseActivity
import com.renyu.commonlibrary.views.LineIndicatorView

/**
 * Created by renyu on 2017/9/15.
 */
class ViewPagerActivity : BaseActivity() {
    override fun initParams() {
        findViewById<LineIndicatorView>(R.id.indicator_vp).setType(LineIndicatorView.TYPE.CIRCLE)
        findViewById<LineIndicatorView>(R.id.indicator_vp).setColor(R.drawable.shape_select, R.drawable.shape_normal)
        findViewById<LineIndicatorView>(R.id.indicator_vp).setCircleIndicatorNums(2)
        findViewById<LineIndicatorView>(R.id.indicator_vp).setCurrentPosition(0)

        supportFragmentManager.beginTransaction().replace(R.id.layout_vp, EmptyFragment(), "tag").commitAllowingStateLoss()
    }

    override fun initViews(): Int {
        return R.layout.activity_viewpager
    }

    override fun loadData() {

    }

    override fun setStatusBarColor(): Int {
        return Color.BLACK
    }

    override fun setStatusBarTranslucent(): Int {
        return 0
    }
}