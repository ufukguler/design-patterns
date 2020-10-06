package com.patterns.abstract_factory.orc;

import com.patterns.abstract_factory.interfaces.IArmy;
import com.patterns.abstract_factory.interfaces.ICastle;
import com.patterns.abstract_factory.interfaces.IFactory;
import com.patterns.abstract_factory.interfaces.IKing;

/**
 * created by: ufuk on 6.10.2020 12:59
 */
public class OrcFactory implements IFactory {
    @Override
    public ICastle createCastle() {
        return new OrcCastle();
    }

    @Override
    public IKing createKing() {
        return new OrcKing();
    }

    @Override
    public IArmy createArmy() {
        return new OrcArmy();
    }
}
