/*
 * Copyright 2015 kifile
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

package com.kifile.utils.animation.interpolator;

import android.util.Log;
import android.view.animation.Interpolator;

/**
 * Created by kifile on 15-1-10.
 */
public class EasingInterpolator implements Interpolator {
    private static final String TAG = "EasingInterpolator";
    private static final boolean DBG = true;
    private int mMode;

    public EasingInterpolator() {
        this(EasingType.LINEAR);
    }

    public EasingInterpolator(int mode) {
        mMode = mode;
    }

    @Override
    public float getInterpolation(float input) {
        float result = EasingType.getInterpolation(mMode, input);
        if (DBG) {
            Log.d(TAG, "Mode:" + mMode + ",Interpolation:" + result);
        }
        return result;
    }
}
