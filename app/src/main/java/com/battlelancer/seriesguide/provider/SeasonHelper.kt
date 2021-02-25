package com.battlelancer.seriesguide.provider

import androidx.room.Dao
import androidx.room.Query
import com.battlelancer.seriesguide.model.SgSeason
import com.battlelancer.seriesguide.model.SgSeasonMinimal

/**
 * Data Access Object for the seasons table.
 */
@Dao
interface SeasonHelper {
    /**
     * For testing: Get the first season from the table.
     */
    @Query("SELECT * FROM seasons LIMIT 1")
    fun getSeason(): SgSeason?

    @Query("SELECT combinednr, series_id FROM seasons WHERE _id=:seasonTvdbId")
    fun getSeasonMinimal(seasonTvdbId: Int): SgSeasonMinimal?
}