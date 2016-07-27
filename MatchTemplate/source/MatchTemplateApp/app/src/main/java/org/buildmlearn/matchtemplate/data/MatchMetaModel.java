package org.buildmlearn.matchtemplate.data;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @brief Model class for Match The Following Meta Template Editor data
 * Created by Anupam (opticod) on 24/7/16.
 */
public class MatchMetaModel implements Parcelable {

    public static final String TITLE_TAG = "meta_title";
    public static final String FIRST_TITLE_TAG = "meta_first_list_title";
    public static final String SECOND_TITLE_TAG = "meta_second_list_title";
    public final static Parcelable.Creator<MatchMetaModel> CREATOR = new Parcelable.Creator<MatchMetaModel>() {
        @Override
        public MatchMetaModel createFromParcel(Parcel parcel) {
            return new MatchMetaModel(parcel);
        }

        @Override
        public MatchMetaModel[] newArray(int size) {
            return new MatchMetaModel[size];
        }
    };
    private String title;
    private String first_list_title;
    private String second_list_title;

    public MatchMetaModel(String t, String A, String B) {
        this.title = t;
        this.first_list_title = A;
        this.second_list_title = B;
    }

    private MatchMetaModel(Parcel in) {
        this.title = in.readString();
        this.first_list_title = in.readString();
        this.second_list_title = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(first_list_title);
        dest.writeString(second_list_title);
    }

    public String getFirst_list_title() {
        return first_list_title;
    }

    public String getSecond_list_title() {
        return second_list_title;
    }

    public String getTitle() {
        return title;
    }

}
