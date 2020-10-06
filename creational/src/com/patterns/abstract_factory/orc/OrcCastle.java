package com.patterns.abstract_factory.orc;

import com.patterns.abstract_factory.interfaces.ICastle;

/**
 * created by: ufuk on 6.10.2020 12:58
 */
public class OrcCastle implements ICastle {
    @Override
    public void getDescription() {
        System.out.println(">> orc castle description");
    }
}
