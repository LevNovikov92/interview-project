package com.levnovikov.interview_project.location_lib

/**
 * Created by lev.novikov
 * Date: 20/2/18.
 */
class LocationAPI {

    companion object {
        fun getLocation(): Location {
            TODO() //implementation is not important
        }

        fun getLocationsNearby(location: Location): List<Location> {
            TODO() //implementation is not important
        }
    }

    data class Location(val title: String, val x: Float, val y: Float)
}