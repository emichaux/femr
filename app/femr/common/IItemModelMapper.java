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
package femr.common;

import femr.common.models.*;
import femr.data.models.core.*;
import femr.ui.models.research.FilterViewModel;
import java.util.Date;
import java.util.List;

public interface IItemModelMapper {

    /**
     * Generate and provide an instance of CityItem.
     *
     * @param cityName    name of the city, not null
     * @param countryName name of the country that the city is in, not null
     * @return a new city item or null if processing fails
     */
    CityItem createCityItem(String cityName, String countryName);

    /**
     * Generate and provide an instance of MedicationItem.
     *
     * @param medication the medication data item, not null
     * @return a new MedicationItem or null if processing fails
     */
    MedicationItem createMedicationItem(IMedication medication);

    /**
     * Generate and provide an instance of MissionItem.
     *
     * @param missionTeam the mission team data item, not null
     * @return a new MissionItem or null if processing fails
     */
    MissionItem createMissionItem(IMissionTeam missionTeam);

    /**
     * Generate and provide an instance of PatientItem. See parameter descriptions for which fields must be filled out.
     *
     * @param id                 id of the patient, not null
     * @param firstName          first name of the patient, not null
     * @param lastName           last name of the patient, not null
     * @param city               city that the patient lives in, not null
     * @param address            address of the patient, may be null
     * @param userId             id of the user that checked in the patient in triage, not null
     * @param age                age of the patient, may be null
     * @param sex                sex of the patient, may be null
     * @param weeksPregnant      how many weeks pregnant the patient is, may be null
     * @param heightFeet         how tall the patient is, may be null
     * @param heightInches       how tall the patient is, may be null
     * @param weight             how much the patient weighs, may be null
     * @param pathToPatientPhoto filepath to the patient photo, may be null
     * @param photoId            id of the patients photo, may be null
     * @return a new PatientItem or null if processing fails, may be null
     */
    PatientItem createPatientItem(int id,
                                                String firstName,
                                                String lastName,
                                                String city,
                                                String address,
                                                int userId,
                                                Date age,
                                                String sex,
                                                Integer weeksPregnant,
                                                Integer heightFeet,
                                                Integer heightInches,
                                                Float weight,
                                                String pathToPatientPhoto,
                                                Integer photoId);

    /**
     * Generate and provide an instance of PatientEncounterItem
     *
     * @param patientEncounter patient encounter info, not null
     * @return a new PatientEncounterItem or null if processing fails
     */
    PatientEncounterItem createPatientEncounterItem(IPatientEncounter patientEncounter);

    /**
     * Generate and provide an instance of PhotoItem
     *
     * @param id              id of the photo, not null
     * @param description     description of the photo, may be null
     * @param insertTimeStamp photo timestamp, not null
     * @param imageURL        url to the image, not null
     * @return a new PhotoItem or null if processing fails
     */
    PhotoItem createPhotoItem(int id, String description, Date insertTimeStamp, String imageURL);

    /**
     * Generate and provide an instance of PrescriptionItem
     *
     * @param id            id of the prescription, not null
     * @param name          name of the prescription, not null
     * @param replacementId id of the prescription that replaced this prescription, may be null
     * @param firstName     first name of the person that prescribed the medication, may be null
     * @param lastName      last name of the person that prescribed the medication, may be null
     * @return a new PrescriptionItem or null if processing fails
     */
    PrescriptionItem createPrescriptionItem(int id, String name, Integer replacementId, String firstName, String lastName);

    /**
     * Generate and provide an instance of ProblemItem.
     *
     * @param name the name of the problem, not null
     * @return a new ProblemItem or null if processing fails
     */
    ProblemItem createProblemItem(String name);

    /**
     * Generate and provide an instance of SettingItem.
     *
     * @param systemSettings a list of all system settings, not null
     * @return a new SettingItem or null if processing fails
     */
    SettingItem createSettingItem(List<? extends ISystemSetting> systemSettings);

    /**
     * Generate and provide an instance of TabItem.
     *
     * @param name            name of the tab, not null
     * @param isCustom        was the tab custom made, not null
     * @param leftColumnSize  size of the left column, not null
     * @param rightColumnSize size of the right column, not null
     * @return a new TabItem or null if processing fails
     */
    TabItem createTabItem(String name, boolean isCustom, Integer leftColumnSize, Integer rightColumnSize);

    /**
     * Generate and provide an instance of TabFieldItem.
     *
     * @param name           the name of the field, not null
     * @param type           the fields type e.g. number, text, may be null
     * @param size           the size of the field e.g. small, med, large, may be null
     * @param order          sorting order for the field, may be null
     * @param placeholder    placeholder text for the field, may be null
     * @param value          current value of the field, may be null
     * @param chiefComplaint what chief complaint the field belongs to,, may be null
     * @param isCustom       identifies if the tabfielditem is custom made, not null
     * @return a new TabFieldItem or null if processing fails
     */
    TabFieldItem createTabFieldItem(String name,
                                                  String type,
                                                  String size,
                                                  Integer order,
                                                  String placeholder,
                                                  String value,
                                                  String chiefComplaint,
                                                  boolean isCustom);

    /**
     * Generate and provide an instance of TabFieldItem overloaded to include userName
     *
     * @param name           the name of the field, not null
     * @param type           the fields type e.g. number, text, may be null
     * @param size           the size of the field e.g. small, med, large, may be null
     * @param order          sorting order for the field, may be null
     * @param placeholder    placeholder text for the field, may be null
     * @param value          current value of the field, may be null
     * @param chiefComplaint what chief complaint the field belongs to,, may be null
     * @param isCustom       identifies if the tabfielditem is custom made, not null
     * @param userName       User Name of user who created the TabFieldItem
     * @return a new TabFieldItem or null if processing fails
     */
    TabFieldItem createTabFieldItem(String name,
                                                  String type,
                                                  String size,
                                                  Integer order,
                                                  String placeholder,
                                                  String value,
                                                  String chiefComplaint,
                                                  boolean isCustom,
                                                  String userName);

    /**
     * Generate and provide an instance of TeamItem.
     *
     * @param name        name of the team, not null
     * @param location    where the team is based out of, may be null
     * @param description a description of the team, may be null
     * @return a new team item or null if processing fails
     */
    TeamItem createTeamItem(String name, String location, String description);

    /**
     * Generate and provide an instance of TripItem.
     *
     * @param teamName    name of the team, not null
     * @param tripCity    city of the trip, not null
     * @param tripCountry country of the trip, not null
     * @param startDate   when the trip starts, not null
     * @param endDate     when the trip ends, not null
     * @return a new trip item or null if processing fails
     */
    TripItem createTripItem(String teamName, String tripCity, String tripCountry, Date startDate, Date endDate);

    /**
     * Generate and provide an instance of UserItem.
     *
     * @param user DAO user, not null
     * @return new userItem or null if processing fails
     */
    UserItem createUserItem(IUser user);

    /**
     * Generate and provide an instance of VitalItem.
     *
     * @param name  name of the vital, not null
     * @param value value of the vital, may be null
     * @return a new VitalItem or null if processing fails
     */
    VitalItem createVitalItem(String name, Float value);
}
