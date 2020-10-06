package com.patterns.abstract_factory;

import com.patterns.abstract_factory.elf.ElfFactory;
import com.patterns.abstract_factory.interfaces.IFactory;
import com.patterns.abstract_factory.orc.OrcFactory;

/**
 * created by: ufuk on 6.10.2020 12:50
 */
public class App {

    public static void main(String[] args) {
        IFactory factory = new ElfFactory();
        factory.createCastle().getDescription();
        factory.createKing().getDescription();
        factory.createArmy().getDescription();

        System.out.println();

        factory = new OrcFactory();
        factory.createCastle().getDescription();
        factory.createKing().getDescription();
        factory.createArmy().getDescription();
    }
}
