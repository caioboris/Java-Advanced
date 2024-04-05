package br.com.fiap.jpa.dao;

import br.com.fiap.jpa.exception.IdNaoEncontradoException;
import jakarta.persistence.EntityManager;

import java.lang.reflect.ParameterizedType;

public class GenericDaoImplementation<T, K> implements GenericDao<T, K>{

    private EntityManager em;

    private Class<T> clazz;

    public GenericDaoImplementation(EntityManager em, Class<T> clazz) {
        this.em = em;
        this.clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public T salvar(T entidade){
        return em.merge(entidade);
    }

    public void remover(K id){

    }

    public void commit() {

    }

    public T buscar(K id) throws IdNaoEncontradoException{
        T entidade = em.find(clazz,id);

        return entidade;
    }
}
