/*
 * Copyright 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.basicgesturedetect;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;

import com.example.android.common.logger.Log;

public class GestureListener extends GestureDetector.SimpleOnGestureListener {

    public static final String TAG = "GestureListener";

    // BEGIN_INCLUDE(init_gestureListener)
    // Call Log.i(TAG, "Motion Event Name" + getTouchType(e)); for each MotionEvent
    
    // END_INCLUDE(init_gestureListener)


    /**
     * Returns a human-readable string describing the type of touch that triggered a MotionEvent.
     */

    private static String getTouchType(MotionEvent e){

        String touchTypeDescription = " ";
        int touchType = e.getToolType(0);

        

        return touchTypeDescription;
    }

}
