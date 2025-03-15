package com.mycompany.app.model;

import com.mycompany.app.interfaces.*;

public class UsuarioAutorDecorator {
    private Publicavel estrategia;

    public UsuarioAutorDecorator(Publicavel estrategia) {
	this.estrategia = estrategia;
    }

    public void setEstrategia(Publicavel estrategia) {
        this.estrategia = estrategia;
    }

    public void executarPublicacao() {
        estrategia.publicar();
    }
}

