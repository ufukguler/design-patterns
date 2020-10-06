package com.patterns.abstract_factory.elf;

import com.patterns.abstract_factory.interfaces.IArmy;
import com.patterns.abstract_factory.interfaces.ICastle;
import com.patterns.abstract_factory.interfaces.IFactory;
import com.patterns.abstract_factory.interfaces.IKing;

/**
 * created by: ufuk on 6.10.2020 12:59
 */
public class ElfFactory implements IFactory {
    @Override
    public ICastle createCastle() {
        return new ElfCastle();
    }

    @Override
    public IKing createKing() {
        return new ElfKing();
    }

    @Override
    public IArmy createArmy() {
        return new ElfArmy();
    }
}
