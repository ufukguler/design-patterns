package com.patterns.abstract_factory.orc;

import com.patterns.abstract_factory.interfaces.IArmy;

/**
 * created by: ufuk on 6.10.2020 12:58
 */
public class OrcArmy implements IArmy {
    @Override
    public void getDescription() {
        System.out.println(">> orc army description");
    }
}
