package com.patterns.abstract_factory.elf;

import com.patterns.abstract_factory.interfaces.ICastle;

/**
 * created by: ufuk on 6.10.2020 12:56
 */
public class ElfCastle implements ICastle {
    @Override
    public void getDescription() {
        System.out.println(">> elf castle description");
    }
}
