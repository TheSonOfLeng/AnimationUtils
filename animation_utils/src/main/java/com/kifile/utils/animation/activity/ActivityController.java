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

package com.kifile.utils.animation.activity;

import android.app.Activity;

import com.kifile.utils.animation.BaseController;

/**
 * Created by kifile on 15-1-10.
 */
public class ActivityController extends BaseController<Activity> {


    public ActivityController(Activity from, Activity to) {
        super(from, to);
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void cancel() {
        super.cancel();
    }
}
