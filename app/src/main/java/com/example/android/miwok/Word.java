package com.example.android.miwok;

import android.media.MediaPlayer;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTransltaion;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mMiwokPronunciation;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String mDefaultTranslation, String mMiwokTransltaion, int mImageResourceId, int mMiwokPronunciation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTransltaion = mMiwokTransltaion;
        this.mMiwokPronunciation = mMiwokPronunciation;
        this.mImageResourceId = mImageResourceId;
    }

    public Word(String mDefaultTranslation, String mMiwokTransltaion, int mMiwokPronunciation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTransltaion = mMiwokTransltaion;
        this.mMiwokPronunciation = mMiwokPronunciation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTransltaion() {
        return mMiwokTransltaion;
    }

    public int getmMiwokPronunciation() {
        return mMiwokPronunciation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTransltaion='" + mMiwokTransltaion + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mMiwokPronunciation=" + mMiwokPronunciation +
                '}';
    }

}
