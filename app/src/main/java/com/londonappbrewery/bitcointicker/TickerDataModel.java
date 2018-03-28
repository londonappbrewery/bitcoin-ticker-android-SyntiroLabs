package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by lhlew on 3/27/2018.
 */

public class TickerDataModel {

    private String mAsk;

    public static TickerDataModel fromJson(JSONObject jsonObject) {

        try {
            TickerDataModel tickerData = new TickerDataModel();
            tickerData.mAsk = jsonObject.getString("ask");
            return tickerData;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getAsk() {
        return mAsk;
    }
}
