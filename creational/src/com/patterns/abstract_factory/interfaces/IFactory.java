package com.patterns.abstract_factory.interfaces;

/**
 * created by: ufuk on 6.10.2020 12:58
 */
public interface IFactory {
    ICastle createCastle();

    IKing createKing();

    IArmy createArmy();
}
