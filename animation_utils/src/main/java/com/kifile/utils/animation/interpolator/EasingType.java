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

/**
 * This class is ported from the jquery.easing(http://gsgd.co.uk/sandbox/jquery/easing/).
 * <p/>
 * When we start an animation, the traditional interpolator may not so fit.
 * <p/>
 * We use the easing function to make the animation looks smoother.
 * <p/>
 * Created by kifile on 15-1-10.
 */
public class EasingType {
    private static final float MAGIC_SEED = 1.70158F;

    public static final int LINEAR = 0;
    //Square
    public static final int EASE_IN_QUAD = 1;
    public static final int EASE_OUT_QUAD = 2;
    public static final int EASE_IN_OUT_QUAD = 3;
    //Cubic
    public static final int EASE_IN_CUBIC = 4;
    public static final int EASE_OUT_CUBIC = 5;
    public static final int EASE_IN_OUT_CUBIC = 6;
    //Quart
    public static final int EASE_IN_QUART = 7;
    public static final int EASE_OUT_QUART = 8;
    public static final int EASE_IN_OUT_QUART = 9;
    //Quint
    public static final int EASE_IN_QUINT = 10;
    public static final int EASE_OUT_QUINT = 11;
    public static final int EASE_IN_OUT_QUINT = 12;
    //Sine
    public static final int EASE_IN_SINE = 13;
    public static final int EASE_OUT_SINE = 14;
    public static final int EASE_IN_OUT_SINE = 15;
    //Expo
    public static final int EASE_IN_EXPO = 16;
    public static final int EASE_OUT_EXPO = 17;
    public static final int EASE_IN_OUT_EXPO = 18;
    //Circ
    public static final int EASE_IN_CIRC = 19;
    public static final int EASE_OUT_CIRC = 20;
    public static final int EASE_IN_OUT_CIRC = 21;
    //Elastic
    public static final int EASE_IN_ELASTIC = 22;
    public static final int EASE_OUT_ELASTIC = 23;
    public static final int EASE_IN_OUT_ELASTIC = 24;
    //Back
    public static final int EASE_IN_BACK = 25;
    public static final int EASE_OUT_BACK = 26;
    public static final int EASE_IN_OUT_BACK = 27;
    //Bounce
    public static final int EASE_IN_BOUNCE = 28;
    public static final int EASE_OUT_BOUNCE = 29;
    public static final int EASE_IN_OUT_BOUNCE = 30;

    public static float getInterpolation(int mode, float input) {
        //t: current time, b: begInnIng value, c: change In value, d: duration
        final float t = input;
        final float b = 0;
        final float c = 1;
        final float d = 1;
        switch (mode) {
            case EASE_IN_QUAD:
                return getEaseInQuad(t, b, c, d);
            case EASE_OUT_QUAD:
                return getEaseOutQuad(t, b, c, d);
            case EASE_IN_OUT_QUAD:
                return getEaseInOutQuad(t, b, c, d);
            case EASE_IN_CUBIC:
                return getEaseInCubic(t, b, c, d);
            case EASE_OUT_CUBIC:
                return getEaseOutCubic(t, b, c, d);
            case EASE_IN_OUT_CUBIC:
                return getEaseInOutCubic(t, b, c, d);
            case EASE_IN_QUART:
                return getEaseInQuart(t, b, c, d);
            case EASE_OUT_QUART:
                return getEaseOutQuart(t, b, c, d);
            case EASE_IN_OUT_QUART:
                return getEaseInOutQuart(t, b, c, d);
            case EASE_IN_QUINT:
                return getEaseInQuint(t, b, c, d);
            case EASE_OUT_QUINT:
                return getEaseOutQuint(t, b, c, d);
            case EASE_IN_OUT_QUINT:
                return getEaseInOutQuint(t, b, c, d);
            case EASE_IN_SINE:
                return getEaseInSine(t, b, c, d);
            case EASE_OUT_SINE:
                return getEaseOutSine(t, b, c, d);
            case EASE_IN_OUT_SINE:
                return getEaseInOutSine(t, b, c, d);
            case EASE_IN_EXPO:
                return getEaseInExpo(t, b, c, d);
            case EASE_OUT_EXPO:
                return getEaseOutExpo(t, b, c, d);
            case EASE_IN_OUT_EXPO:
                return getEaseInOutExpo(t, b, c, d);
            case EASE_IN_CIRC:
                return getEaseInCirc(t, b, c, d);
            case EASE_OUT_CIRC:
                return getEaseOutCirc(t, b, c, d);
            case EASE_IN_OUT_CIRC:
                return getEaseInOutCirc(t, b, c, d);
            case EASE_IN_ELASTIC:
                return getEaseInElastic(t, b, c, d);
            case EASE_OUT_ELASTIC:
                return getEaseOutElastic(t, b, c, d);
            case EASE_IN_OUT_ELASTIC:
                return getEaseInOutElastic(t, b, c, d);
            case EASE_IN_BACK:
                return getEaseInBack(t, b, c, d);
            case EASE_OUT_BACK:
                return getEaseOutBack(t, b, c, d);
            case EASE_IN_OUT_BACK:
                return getEaseInOutBack(t, b, c, d);
            case EASE_IN_BOUNCE:
                return getEaseInBounce(t, b, c, d);
            case EASE_OUT_BOUNCE:
                return getEaseOutBounce(t, b, c, d);
            case EASE_IN_OUT_BOUNCE:
                return getEaseInOutBounce(t, b, c, d);
        }
        return getLinear(t, b, c, d);
    }

    private static float getLinear(float t, float b, float c, float d) {
        return b + c * t / d;
    }

    private static float getEaseInQuad(float t, float b, float c, float d) {
        return c * (t /= d) * t + b;
    }

    private static float getEaseOutQuad(float t, float b, float c, float d) {
        return -c * (t /= d) * (t - 2) + b;
    }

    private static float getEaseInOutQuad(float t, float b, float c, float d) {
        if ((t /= d / 2) < 1) return c / 2 * t * t + b;
        return -c / 2 * ((--t) * (t - 2) - 1) + b;
    }

    private static float getEaseInCubic(float t, float b, float c, float d) {
        return c * (t /= d) * t * t + b;
    }

    private static float getEaseOutCubic(float t, float b, float c, float d) {
        return c * ((t = t / d - 1) * t * t + 1) + b;
    }

    private static float getEaseInOutCubic(float t, float b, float c, float d) {
        if ((t /= d / 2) < 1) return c / 2 * t * t * t + b;
        return c / 2 * ((t -= 2) * t * t + 2) + b;
    }

    private static float getEaseInQuart(float t, float b, float c, float d) {
        return c * (t /= d) * t * t * t + b;
    }

    private static float getEaseOutQuart(float t, float b, float c, float d) {
        return -c * ((t = t / d - 1) * t * t * t - 1) + b;
    }

    private static float getEaseInOutQuart(float t, float b, float c, float d) {
        if ((t /= d / 2) < 1) return c / 2 * t * t * t * t + b;
        return -c / 2 * ((t -= 2) * t * t * t - 2) + b;
    }

    private static float getEaseInQuint(float t, float b, float c, float d) {
        return c * (t /= d) * t * t * t * t + b;
    }

    private static float getEaseOutQuint(float t, float b, float c, float d) {
        return c * ((t = t / d - 1) * t * t * t * t + 1) + b;
    }

    private static float getEaseInOutQuint(float t, float b, float c, float d) {
        if ((t /= d / 2) < 1) return c / 2 * t * t * t * t * t + b;
        return c / 2 * ((t -= 2) * t * t * t * t + 2) + b;
    }

    private static float getEaseInSine(float t, float b, float c, float d) {
        return (float) (-c * Math.cos(t / d * (Math.PI / 2)) + c + b);
    }

    private static float getEaseOutSine(float t, float b, float c, float d) {
        return (float) (c * Math.sin(t / d * (Math.PI / 2)) + b);
    }

    private static float getEaseInOutSine(float t, float b, float c, float d) {
        return (float) (-c / 2 * (Math.cos(Math.PI * t / d) - 1) + b);
    }

    private static float getEaseInExpo(float t, float b, float c, float d) {
        return (t == 0) ? b : (float) (c * Math.pow(2, 10 * (t / d - 1)) + b);
    }

    private static float getEaseOutExpo(float t, float b, float c, float d) {
        return (t == d) ? b + c : (float) (c * (-Math.pow(2, -10 * t / d) + 1) + b);
    }

    private static float getEaseInOutExpo(float t, float b, float c, float d) {
        if (t == 0) return b;
        if (t == d) return b + c;
        if ((t /= d / 2) < 1) return (float) (c / 2 * Math.pow(2, 10 * (t - 1)) + b);
        return (float) (c / 2 * (-Math.pow(2, -10 * --t) + 2) + b);
    }

    private static float getEaseInCirc(float t, float b, float c, float d) {
        return (float) (-c * (Math.sqrt(1 - (t /= d) * t) - 1) + b);
    }

    private static float getEaseOutCirc(float t, float b, float c, float d) {
        return (float) (c * Math.sqrt(1 - (t = t / d - 1) * t) + b);
    }

    private static float getEaseInOutCirc(float t, float b, float c, float d) {
        if ((t /= d / 2) < 1) return (float) (-c / 2 * (Math.sqrt(1 - t * t) - 1) + b);
        return (float) (c / 2 * (Math.sqrt(1 - (t -= 2) * t) + 1) + b);
    }

    private static float getEaseInElastic(float t, float b, float c, float d) {
        double s;
        double p;
        float a = c;
        if (t == 0) return b;
        if ((t /= d) == 1) return b + c;
        p = d * .3;
        if (a < Math.abs(c)) {
            a = c;
            s = p / 4;
        } else s = p / (2 * Math.PI) * Math.asin(c / a);
        return (float) (-(a * Math.pow(2, 10 * (t -= 1)) * Math.sin((t * d - s) * (2 * Math.PI) / p)) + b);
    }

    private static float getEaseOutElastic(float t, float b, float c, float d) {
        double s;
        double p;
        float a = c;
        if (t == 0) return b;
        if ((t /= d) == 1) return b + c;
        p = d * .3;
        if (a < Math.abs(c)) {
            a = c;
            s = p / 4;
        } else s = p / (2 * Math.PI) * Math.asin(c / a);
        return (float) (a * Math.pow(2, -10 * t) * Math.sin((t * d - s) * (2 * Math.PI) / p) + c + b);
    }

    private static float getEaseInOutElastic(float t, float b, float c, float d) {
        double s;
        double p;
        float a = c;
        if (t == 0) return b;
        if ((t /= d / 2) == 2) return b + c;
        p = d * (.3 * 1.5);
        if (a < Math.abs(c)) {
            a = c;
            s = p / 4;
        } else s = p / (2 * Math.PI) * Math.asin(c / a);
        if (t < 1)
            return (float) (-.5 * (a * Math.pow(2, 10 * (t -= 1)) * Math.sin((t * d - s) * (2 * Math.PI) / p)) + b);
        return (float) (a * Math.pow(2, -10 * (t -= 1)) * Math.sin((t * d - s) * (2 * Math.PI) / p) * .5 + c + b);
    }

    private static float getEaseInBack(float t, float b, float c, float d) {
        final float s = MAGIC_SEED;
        return c * (t /= d) * t * ((s + 1) * t - s) + b;
    }

    private static float getEaseOutBack(float t, float b, float c, float d) {
        final float s = MAGIC_SEED;
        return c * ((t = t / d - 1) * t * ((s + 1) * t + s) + 1) + b;
    }

    private static float getEaseInOutBack(float t, float b, float c, float d) {
        float s = MAGIC_SEED;
        if ((t /= d / 2) < 1) return c / 2 * (t * t * (((s *= (1.525)) + 1) * t - s)) + b;
        return c / 2 * ((t -= 2) * t * (((s *= (1.525)) + 1) * t + s) + 2) + b;
    }

    private static float getEaseInBounce(float t, float b, float c, float d) {
        return c - getEaseOutBounce(d - t, 0, c, d) + b;
    }

    private static float getEaseOutBounce(float t, float b, float c, float d) {
        if ((t /= d) < (1 / 2.75)) {
            return (float) (c * (7.5625 * t * t) + b);
        } else if (t < (2 / 2.75)) {
            return (float) (c * (7.5625 * (t -= (1.5 / 2.75)) * t + .75) + b);
        } else if (t < (2.5 / 2.75)) {
            return (float) (c * (7.5625 * (t -= (2.25 / 2.75)) * t + .9375) + b);
        } else {
            return (float) (c * (7.5625 * (t -= (2.625 / 2.75)) * t + .984375) + b);
        }
    }

    private static float getEaseInOutBounce(float t, float b, float c, float d) {
        if (t < d / 2) return (float) (getEaseInBounce(t * 2, 0, c, d) * .5 + b);
        return (float) (getEaseOutBounce(t * 2 - d, 0, c, d) * .5 + c * .5 + b);
    }
}
