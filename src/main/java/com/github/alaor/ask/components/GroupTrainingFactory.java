package com.github.alaor.ask.components;

import com.github.alaor.ask.models.enums.GroupName;
import java.time.LocalDate;

public class GroupTrainingFactory {

    public static boolean isDayOfTraining(GroupName groupName) {

        String currentDayOfWeek = String.valueOf(LocalDate.now().getDayOfWeek());

        switch (groupName) {
            case STANDUP:
                return GroupName.STANDUP.daysOfTraining.contains(currentDayOfWeek);
            case PELOTAO_TC:
                return GroupName.PELOTAO_TC.daysOfTraining.contains(currentDayOfWeek);
            default:
                return false;
        }

    }

}
