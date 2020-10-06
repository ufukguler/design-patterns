package com.patterns.abstract_factory.elf;

import com.patterns.abstract_factory.interfaces.IArmy;

/**
 * created by: ufuk on 6.10.2020 12:56
 */
public class ElfArmy implements IArmy {
    @Override
    public void getDescription() {
        System.out.println(">> elf army description");
    }
}
