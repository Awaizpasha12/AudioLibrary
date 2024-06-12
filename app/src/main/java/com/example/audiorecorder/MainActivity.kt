package com.example.audiorecorder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.audiolibrary.MyDialogBox

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dialogFragment = MyDialogBox(
            title = "This is Title",
            info = "This is info",
            buttonMode = MyDialogBox.InfoDialogButtonMode.None,
            nameBtnCancel = "No",
            nameBtnConfirm = "Yes",
            btnListener = object: MyDialogBox.ButtonClickListener {
                override fun onBtnCancelClick() {
                }
                override fun onBtnConfirmClick() {
                }
            },
            isCancelableOnTouchOutside = true
        )

        dialogFragment.show(supportFragmentManager,null)
    }
}