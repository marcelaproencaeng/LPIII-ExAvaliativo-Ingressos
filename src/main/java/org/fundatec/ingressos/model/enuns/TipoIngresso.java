package org.fundatec.ingressos.model.enuns;

import org.fundatec.ingressos.strategy.*;

public enum TipoIngresso {
    PISTA(new PistaStrategy()),
    PISTA_PREMIUM(new PistaPremiumStrategy()),
    CAMAROTE(new CamaroteStrategy()),
    CADEIRA_INFERIOR(new CadeiraInferiorStrategy()),
    CADEIRA_SUPERIOR(new CadeiraSuperiorStrategy());
    private final VendaIngressosStrategy strategy;
}
