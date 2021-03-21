package com.github.alaor.ask.handlers;

import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;

public class SimpleAlexaSkillStreamHandler extends SkillStreamHandler {

    public SimpleAlexaSkillStreamHandler() {
        super(Skills.standard()
                .addRequestHandler(new PelotaoTCRequestHandler())
                .addRequestHandler(new StandupRequestHandler())
                .addRequestHandler(new CustomLaunchRequestHandler())
                .build());
    }
}
