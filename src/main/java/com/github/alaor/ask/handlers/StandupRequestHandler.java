package com.github.alaor.ask.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.handler.GenericRequestHandler;
import com.github.alaor.ask.components.GroupTrainingFactory;
import com.github.alaor.ask.models.enums.GroupName;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class StandupRequestHandler implements GenericRequestHandler<HandlerInput, Optional<Response>> {

    @Override
    public boolean canHandle(HandlerInput handlerInput) {
        return handlerInput.matches(intentName("StandupIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput handlerInput) {
        return handlerInput.getResponseBuilder()
                .withSpeech(GroupTrainingFactory.isDayOfTraining(GroupName.STANDUP) ?
                        "Hoje tem treino! As vinte horas na Standup do Prado!" :  "Hoje não tem treino!")
                .build();
    }

}
