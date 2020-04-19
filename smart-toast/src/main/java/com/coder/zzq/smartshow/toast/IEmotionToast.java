package com.coder.zzq.smartshow.toast;


import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;

public interface IEmotionToast extends IToast<IEmotionToast, IEmotionToastShow> {
    IEmotionToast backgroundColor(@ColorInt int color);

    IEmotionToast backgroundColorRes(@ColorRes int color);

    IEmotionToast icon(@DrawableRes int icon);
}
