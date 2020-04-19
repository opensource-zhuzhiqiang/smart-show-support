package com.coder.zzq.smartshow.toast;


import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface IOriginalToast extends IToast<IOriginalToast, IPlainToastShow> {

    int ICON_POSITION_LEFT = 0;
    int ICON_POSITION_RIGHT = 1;

    @Retention(RetentionPolicy.SOURCE)
    @IntDef({ICON_POSITION_LEFT, ICON_POSITION_RIGHT})
    @interface IconPosition {
    }

    IOriginalToast backgroundColor(@ColorInt int color);

    IOriginalToast backgroundColorRes(@ColorRes int color);

    IOriginalToast textColor(@ColorInt int color);

    IOriginalToast textColorRes(@ColorRes int color);


    IOriginalToast textSizeSp(float sizeSp);

    IOriginalToast icon(@DrawableRes int icon);

    IOriginalToast iconPosition(@IconPosition int position);
}
