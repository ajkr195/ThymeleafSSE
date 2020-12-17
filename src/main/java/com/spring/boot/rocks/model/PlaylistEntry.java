/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2016, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package com.spring.boot.rocks.model;



public class PlaylistEntry {

    private Integer playlistId;
    private String playlistName;
    private String trackName;
    private String artistName;
    private String albumTitle;


    public PlaylistEntry(
            final Integer playlistId,
            final String playlistName,
            final String trackName,
            final String artistName,
            final String albumTitle) {
        super();
        this.playlistId = playlistId;
        this.playlistName = playlistName;
        this.trackName = trackName;
        this.artistName = artistName;
        this.albumTitle = albumTitle;
    }


    public Integer getPlaylistId() {
        return playlistId;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public String getTrackName() {
        return trackName;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    @Override
    public String toString() {
        return getTrackName();
    }

}
