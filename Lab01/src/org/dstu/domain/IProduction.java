package org.dstu.domain;

import java.io.Serializable;

public interface IProduction extends Serializable {
    default void printInfo() {
        System.out.println(this);
    }
}
