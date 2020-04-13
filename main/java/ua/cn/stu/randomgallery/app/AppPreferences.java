package ua.cn.stu.randomgallery.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class AppPreferences {
    private static final String PREF_NUMBER = "NUMBER";
    private SharedPreferences preferences;
    public AppPreferences(Context context) {
        this.preferences = PreferenceManager.getDefaultSharedPreferences(context);
    }
    public void saveNumber(int number) {
        preferences.edit().putInt(PREF_NUMBER, number).apply();
    }
    public int getNumer() {
        return preferences.getInt(PREF_NUMBER,0);
    }
}
