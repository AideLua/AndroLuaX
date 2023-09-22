package com.androlua;

//import android.app.AlertDialog;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertControllerBridge;
import androidx.appcompat.app.AlertDialog;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayListAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Administrator on 2017/02/04 0004.
 */

public class LuaDialog extends AlertDialog implements DialogInterface.OnClickListener {

    @Override
    public void cancel() {
        super.dismiss();
    }

    private final Context mContext;

    private final ListView mListView;

    private String mMessage;

    private String mTitle;

    private View mView;
    private OnClickListener mOnClickListener;

    private final int mListItemLayout;
    private final AlertControllerBridge.RecycleListViewBridge recycleListViewBridge;
    private boolean hasButtons;
    private boolean hasTitle;


    public LuaDialog(Context context) {
        this(context, 0);
    }


    @SuppressLint("PrivateResource")
    public LuaDialog(Context context, int theme) {
        super(context, theme);
        mContext = context;
        // 给列表添加间距
        final TypedArray a = context.obtainStyledAttributes(null, R.styleable.AlertDialog,
                R.attr.alertDialogStyle, 0);
        int listLayout = a.getResourceId(androidx.appcompat.R.styleable.AlertDialog_listLayout, 0);
        mListItemLayout = a.getResourceId(androidx.appcompat.R.styleable.AlertDialog_listItemLayout, 0);
        a.recycle();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mListView = (ListView) inflater.inflate(listLayout, null);
        recycleListViewBridge = new AlertControllerBridge.RecycleListViewBridge(mListView);
    }

    public void setButton(CharSequence text) {
        setOkButton(text);
    }

    public void setButton1(CharSequence text) {
        setOkButton(text);
    }

    public void setButton2(CharSequence text) {
        setNegButton(text);

    }

    public void setButton3(CharSequence text) {
        setNeuButton(text);
    }

    public void setPosButton(CharSequence text) {
        setPositiveButton(text, this);
    }

    public void setNegButton(CharSequence text) {
        setNegativeButton(text, this);
    }

    public void setNeuButton(CharSequence text) {
        setNeutralButton(text, this);
    }

    public void setOkButton(CharSequence text) {
        setPositiveButton(text, this);
    }

    public void setCancelButton(CharSequence text) {
        setNegativeButton(text, this);
    }

    public void setOnClickListener(LuaDialog.OnClickListener listener) {
        mOnClickListener = listener;
    }

    public void setPositiveButton(CharSequence text, DialogInterface.OnClickListener listener) {
        setButton(DialogInterface.BUTTON_POSITIVE, text, listener);
        hasButtons = true;
        recycleListViewBridge.setHasDecor(hasTitle, true);
    }

    public void setNegativeButton(CharSequence text, DialogInterface.OnClickListener listener) {
        setButton(DialogInterface.BUTTON_NEGATIVE, text, listener);
        hasButtons = true;
        recycleListViewBridge.setHasDecor(hasTitle, true);
    }

    public void setNeutralButton(CharSequence text, DialogInterface.OnClickListener listener) {
        setButton(DialogInterface.BUTTON_NEUTRAL, text, listener);
        hasButtons = true;
        recycleListViewBridge.setHasDecor(hasTitle, true);
    }

    public String getTitle() {
        return mTitle;
    }

    @Override
    public void setTitle(@NonNull CharSequence title) {
        // TODO: Implement this method
        mTitle = title.toString();
        super.setTitle(title);
        hasTitle = true;
        recycleListViewBridge.setHasDecor(true, hasButtons);
    }

    public String getMessage() {
        return mMessage;
    }

    @Override
    public void setMessage(@NonNull CharSequence message) {
        // TODO: Implement this method
        mMessage = message.toString();
        super.setMessage(message);
    }

    @Override
    public void setIcon(Drawable icon) {
        // TODO: Implement this method
        super.setIcon(icon);
    }

    public View getView() {
        return mView;
    }

    @Override
    public void setView(View view) {
        // TODO: Implement this method
        mView = view;
        super.setView(view);
    }

    public void setItems(String[] items) {
        ArrayList<String> alist = new ArrayList<>(Arrays.asList(items));
        ArrayListAdapter<String> adp = new ArrayListAdapter<>(mContext, mListItemLayout, alist);
        setAdapter(adp);
        mListView.setChoiceMode(ListView.CHOICE_MODE_NONE);
    }

    public void setAdapter(ListAdapter adp) {
        if (!mListView.equals(mView))
            setView(mListView);
        mListView.setAdapter(adp);
    }

    public void setSingleChoiceItems(CharSequence[] items) {
        setSingleChoiceItems(items, 0);
    }

    public void setSingleChoiceItems(CharSequence[] items, int checkedItem) {
        ArrayList<CharSequence> alist = new ArrayList<>(Arrays.asList(items));
        ArrayListAdapter<CharSequence> adp = new ArrayListAdapter<>(mContext, android.R.layout.simple_list_item_single_choice, alist);
        setAdapter(adp);
        mListView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        mListView.setItemChecked(checkedItem, true);
    }

    public void setMultiChoiceItems(CharSequence[] items) {
        setMultiChoiceItems(items, new int[0]);
    }

    public void setMultiChoiceItems(CharSequence[] items, int[] checkedItems) {
        ArrayList<CharSequence> alist = new ArrayList<>(Arrays.asList(items));
        ArrayListAdapter<CharSequence> adp = new ArrayListAdapter<>(mContext, android.R.layout.simple_list_item_multiple_choice, alist);
        setAdapter(adp);
        mListView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        for (int i : checkedItems)
            mListView.setItemChecked(i, true);
    }

    public ListView getListView() {
        return mListView;
    }

    public void setOnItemClickListener(final AdapterView.OnItemClickListener listener) {
        mListView.setOnItemClickListener(listener);
    }

    public void setOnItemLongClickListener(final AdapterView.OnItemLongClickListener listener) {
        mListView.setOnItemLongClickListener(listener);
    }

    public void setOnItemSelectedListener(final AdapterView.OnItemSelectedListener listener) {
        mListView.setOnItemSelectedListener(listener);
    }
/*
    @Override
    public void setOnCancelListener(DialogInterface.OnCancelListener listener) {
        // TODO: Implement this method
        super.setOnCancelListener(listener);
    }

    @Override
    public void setOnDismissListener(DialogInterface.OnDismissListener listener) {
        // TODO: Implement this method
        super.setOnDismissListener(listener);
    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    public void hide() {
        super.hide();
    }


    @Override
    public boolean isShowing() {
        return super.isShowing();
    }*/

    @Override
    public void onClick(DialogInterface dialog, int which) {
        if (mOnClickListener != null)
            mOnClickListener.onClick(this, getButton(which));
    }

    public interface OnClickListener {
        public void onClick(LuaDialog dlg, Button btn);
    }

/*
    public void close()
    {
        super.dismiss();
    }

    @Override
    public void dismiss()
    {
        // TODO: Implement this method
        super.hide();
    }*/

}
