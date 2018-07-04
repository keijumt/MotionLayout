package keijumt.motionlayout.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import keijumt.motionlayout.Constant
import keijumt.motionlayout.R

class MotionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layoutId = intent.getIntExtra(Constant.Arguments.layoutId.name, R.layout.activity_motion)
        setContentView(layoutId)
    }
}
