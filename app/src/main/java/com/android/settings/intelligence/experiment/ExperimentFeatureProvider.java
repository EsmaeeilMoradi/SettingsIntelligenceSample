package com.android.settings.intelligence.experiment;

import android.content.Context;

public class ExperimentFeatureProvider {

    public long getMaxSuggestionDisplayCount(Context context) {
        return 3;
    }

    public boolean isPredictiveRingerEnabled(Context context) { return false; }

    public boolean isPredictiveBluetoothDrivingEnabled(Context context) { return false; }

}