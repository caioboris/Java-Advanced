package br.com.fiap.jpa.view;

import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;
import jakarta.persistence.EntityManager;

public class View {

    public static void main(String[] args) {
        EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

        InventimentoDao
    }
}
