package com.kk.taurus.playerbase.inter;

import com.kk.taurus.playerbase.callback.OnCoverEventListener;
import com.kk.taurus.playerbase.callback.PlayerObserver;
import com.kk.taurus.playerbase.widget.BasePlayer;

/**
 * Created by Taurus on 2017/4/27.
 */

public interface IPlayerEvent extends PlayerObserver {
    void onBindPlayer(BasePlayer player, OnCoverEventListener onCoverEventListener);
}
