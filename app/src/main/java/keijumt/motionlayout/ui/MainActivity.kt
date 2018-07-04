package keijumt.motionlayout.ui

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import keijumt.motionlayout.Constant
import keijumt.motionlayout.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_motion_01.setOnClickListener {
            start(R.layout.motion_01)
        }
        btn_motion_02.setOnClickListener {
            start(R.layout.motion_02)
        }
        btn_motion_03.setOnClickListener {
            start(R.layout.motion_03)
        }
    }

    private fun start(layoutId: Int) {
        val intent = Intent(this, MotionActivity::class.java)
        intent.putExtra(Constant.Arguments.layoutId.name, layoutId)
        startActivity(intent)
    }
}
