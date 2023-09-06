package com.zfdang.touchhelper.utils

import android.app.Activity
import android.app.ActivityManager
import androidx.appcompat.app.AppCompatActivity

object CommUtils {


    @JvmStatic
    fun setExcludeFromRecent(activity: Activity, exclude: Boolean) {
        val activityManager = activity.getSystemService(AppCompatActivity.ACTIVITY_SERVICE) as ActivityManager
        val tasks = activityManager.appTasks
        tasks.find { activity.taskId == it.taskInfo.id }?.setExcludeFromRecents(exclude)
    }




}