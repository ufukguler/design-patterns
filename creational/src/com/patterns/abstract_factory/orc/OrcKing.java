package com.patterns.abstract_factory.orc;

import com.patterns.abstract_factory.interfaces.IKing;

/**
 * created by: ufuk on 6.10.2020 12:58
 */
public class OrcKing implements IKing {
    @Override
    public void getDescription() {
        System.out.println(">> orc king description");
    }
}
