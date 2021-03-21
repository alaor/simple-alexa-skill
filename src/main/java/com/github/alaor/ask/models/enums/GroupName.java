package com.github.alaor.ask.models.enums;

import java.util.Arrays;
import java.util.List;

public enum GroupName {

    PELOTAO_TC(Arrays.asList("TUESDAY, THURSDAY")),
    STANDUP(Arrays.asList("WEDNESDAY"));

    public List<String> daysOfTraining;

    GroupName(List<String> daysOfTraining) {
        this.daysOfTraining = daysOfTraining;
    }
}
