package br.com.fiap.jpa.dao;

import br.com.fiap.jpa.exception.IdNaoEncontradoException;

public interface GenericDao<T, K> {

    T salvar(T entidade);
    void remover(K id) throws IdNaoEncontradoException;

    void commit();
}
