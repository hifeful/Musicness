package com.hifeful.musicness.ui.song

import com.hifeful.musicness.data.model.SongCredits
import com.hifeful.musicness.ui.base.BaseView
import moxy.viewstate.strategy.SingleStateStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(SingleStateStrategy::class)
interface SongView : BaseView {
    fun setUpToolbar(view: android.view.View)
    fun setUpCollapsingToolbar()
    fun setUpSongCredits(songCredits: SongCredits)
    fun showSongDetails()
    fun showSongLyrics(lyrics: String)
}