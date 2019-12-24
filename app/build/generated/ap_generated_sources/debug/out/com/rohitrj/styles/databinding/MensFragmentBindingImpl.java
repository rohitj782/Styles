package com.rohitrj.styles.databinding;
import com.rohitrj.styles.R;
import com.rohitrj.styles.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MensFragmentBindingImpl extends MensFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView, 1);
        sViewsWithIds.put(R.id.imageView, 2);
        sViewsWithIds.put(R.id.button_item_1, 3);
        sViewsWithIds.put(R.id.button_item_2, 4);
        sViewsWithIds.put(R.id.button_item_3, 5);
        sViewsWithIds.put(R.id.button_item_4, 6);
        sViewsWithIds.put(R.id.button_item_5, 7);
        sViewsWithIds.put(R.id.button_item_6, 8);
        sViewsWithIds.put(R.id.button_item_7, 9);
        sViewsWithIds.put(R.id.button_item_8, 10);
        sViewsWithIds.put(R.id.button_item_9, 11);
        sViewsWithIds.put(R.id.button_item_10, 12);
        sViewsWithIds.put(R.id.button_item_11, 13);
        sViewsWithIds.put(R.id.button_item_12, 14);
        sViewsWithIds.put(R.id.button_item_13, 15);
        sViewsWithIds.put(R.id.imageViewmen1, 16);
        sViewsWithIds.put(R.id.imageViewmen2, 17);
        sViewsWithIds.put(R.id.imageViewmen4, 18);
        sViewsWithIds.put(R.id.textView20, 19);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MensFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private MensFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[12]
            , (android.widget.Button) bindings[13]
            , (android.widget.Button) bindings[14]
            , (android.widget.Button) bindings[15]
            , (android.widget.Button) bindings[4]
            , (android.widget.Button) bindings[5]
            , (android.widget.Button) bindings[6]
            , (android.widget.Button) bindings[7]
            , (android.widget.Button) bindings[8]
            , (android.widget.Button) bindings[9]
            , (android.widget.Button) bindings[10]
            , (android.widget.Button) bindings[11]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[19]
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.menViewModel == variableId) {
            setMenViewModel((com.rohitrj.styles.ui.mainactivity.mens.MensViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMenViewModel(@Nullable com.rohitrj.styles.ui.mainactivity.mens.MensViewModel MenViewModel) {
        this.mMenViewModel = MenViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): menViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}