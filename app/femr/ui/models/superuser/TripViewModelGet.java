/*
     fEMR - fast Electronic Medical Records
     Copyright (C) 2014  Team fEMR

     fEMR is free software: you can redistribute it and/or modify
     it under the terms of the GNU General Public License as published by
     the Free Software Foundation, either version 3 of the License, or
     (at your option) any later version.

     fEMR is distributed in the hope that it will be useful,
     but WITHOUT ANY WARRANTY; without even the implied warranty of
     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
     GNU General Public License for more details.

     You should have received a copy of the GNU General Public License
     along with fEMR.  If not, see <http://www.gnu.org/licenses/>. If
     you have any questions, contact <info@teamfemr.org>.
*/
package femr.ui.models.superuser;

import femr.common.models.CityItem;
import femr.common.models.MissionItem;

import java.util.List;

public class TripViewModelGet {

    private List<MissionItem> missionItems;
    private List<String> availableTeams;
    private List<CityItem> availableCities;
    private List<String> availableCountries;

    public List<MissionItem> getMissionItems() {
        return missionItems;
    }

    public void setMissionItems(List<MissionItem> missionItems) {
        this.missionItems = missionItems;
    }

    public List<String> getAvailableTeams() {
        return availableTeams;
    }

    public void setAvailableTeams(List<String> availableTeams) {
        this.availableTeams = availableTeams;
    }

    public List<CityItem> getAvailableCities() {
        return availableCities;
    }

    public void setAvailableCities(List<CityItem> availableCities) {
        this.availableCities = availableCities;
    }

    public List<String> getAvailableCountries() {
        return availableCountries;
    }

    public void setAvailableCountries(List<String> availableCountries) {
        this.availableCountries = availableCountries;
    }
}
