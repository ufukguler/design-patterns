package com.patterns.abstract_factory.elf;

import com.patterns.abstract_factory.interfaces.IKing;

/**
 * created by: ufuk on 6.10.2020 12:56
 */
public class ElfKing implements IKing {
    @Override
    public void getDescription() {
        System.out.println(">> elf king description");
    }
}
