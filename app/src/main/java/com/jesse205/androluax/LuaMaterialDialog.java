package com.jesse205.androluax;

import static com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;

import androidx.annotation.AttrRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.view.ViewCompat;

import com.androlua.LuaDialog;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.dialog.InsetDialogOnTouchListener;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.dialog.MaterialDialogs;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;

/**
 * Lua 质感对话框
 * @see MaterialAlertDialogBuilder
 * @deprecated 此类作为 LuaDialog 的代替品，仅方便开发者快速将项目转移到 Material3 风格。
 * 实际编写时请使用 {@link MaterialAlertDialogBuilder}
 */
public class LuaMaterialDialog extends LuaDialog {

    @AttrRes private static final int DEF_STYLE_ATTR = com.google.android.material.R.attr.alertDialogStyle;
    @StyleRes private static final int DEF_STYLE_RES = com.google.android.material.R.style.MaterialAlertDialog_MaterialComponents;

    @AttrRes
    private static final int MATERIAL_ALERT_DIALOG_THEME_OVERLAY = com.google.android.material.R.attr.materialAlertDialogTheme;

    @Nullable private Drawable background;
    @SuppressLint("SupportAnnotationUsage")
    @NonNull @Dimension private final Rect backgroundInsets;

    private static int getMaterialAlertDialogThemeOverlay(@NonNull Context context) {
        @SuppressLint("RestrictedApi")
        TypedValue materialAlertDialogThemeOverlay =
                MaterialAttributes.resolve(context, MATERIAL_ALERT_DIALOG_THEME_OVERLAY);
        if (materialAlertDialogThemeOverlay == null) {
            return 0;
        }
        return materialAlertDialogThemeOverlay.data;
    }

    private static Context createMaterialAlertDialogThemedContext(@NonNull Context context) {
        int themeOverlayId = getMaterialAlertDialogThemeOverlay(context);
        Context themedContext = wrap(context, null, DEF_STYLE_ATTR, DEF_STYLE_RES);
        if (themeOverlayId == 0) {
            return themedContext;
        }
        return new ContextThemeWrapper(themedContext, themeOverlayId);
    }

    private static int getOverridingThemeResId(@NonNull Context context, int overrideThemeResId) {
        return overrideThemeResId == 0
                ? getMaterialAlertDialogThemeOverlay(context)
                : overrideThemeResId;
    }

    public LuaMaterialDialog(Context context) {
        this(context,0);
    }

    @SuppressLint("RestrictedApi")
    public LuaMaterialDialog(Context context, int overrideThemeResId) {
        super(
                createMaterialAlertDialogThemedContext(context),
                getOverridingThemeResId(context, overrideThemeResId));
        // Ensure we are using the correctly themed context rather than the context that was passed in.
        context = getContext();
        Resources.Theme theme = context.getTheme();

        backgroundInsets =
                MaterialDialogs.getDialogBackgroundInsets(context, DEF_STYLE_ATTR, DEF_STYLE_RES);

        int surfaceColor =
                MaterialColors.getColor(context, com.google.android.material.R.attr.colorSurface, getClass().getCanonicalName());
        MaterialShapeDrawable materialShapeDrawable =
                new MaterialShapeDrawable(context, null, DEF_STYLE_ATTR, DEF_STYLE_RES);
        materialShapeDrawable.initializeElevationOverlay(context);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(surfaceColor));

        // dialogCornerRadius first appeared in Android Pie
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            TypedValue dialogCornerRadiusValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, dialogCornerRadiusValue, true);
            float dialogCornerRadius =
                    dialogCornerRadiusValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (dialogCornerRadiusValue.type == TypedValue.TYPE_DIMENSION && dialogCornerRadius >= 0) {
                materialShapeDrawable.setCornerSize(dialogCornerRadius);
            }
        }
        background = materialShapeDrawable;

        Window window = this.getWindow();
        /* {@link Window#getDecorView()} should be called before any changes are made to the Window
         * as it locks in attributes and affects layout. */
        assert window != null;
        View decorView = window.getDecorView();
        if (background instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) background).setElevation(ViewCompat.getElevation(decorView));
        }

        Drawable insetDrawable = MaterialDialogs.insetDrawable(background, backgroundInsets);
        window.setBackgroundDrawable(insetDrawable);
        decorView.setOnTouchListener(new InsetDialogOnTouchListener(this, backgroundInsets));
    }

}
