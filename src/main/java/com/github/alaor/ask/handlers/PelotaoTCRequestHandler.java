package com.github.alaor.ask.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.github.alaor.ask.components.GroupTrainingFactory;
import com.github.alaor.ask.models.enums.GroupName;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class PelotaoTCRequestHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput handlerInput) {
        return handlerInput.matches(intentName("PelotaoTCIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput handlerInput) {

        return handlerInput.getResponseBuilder()
                .withSpeech(GroupTrainingFactory.isDayOfTraining(GroupName.PELOTAO_TC) ?
                        "Hoje tem treino! As dezenove horas na grife pneus!" :  "Hoje não tem treino!")
                .build();
    }
}
