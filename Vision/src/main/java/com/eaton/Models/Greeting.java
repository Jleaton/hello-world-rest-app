package com.eaton.Models;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by sev on 12/30/16.
 */
public class Greeting {

    @Getter @Setter private final long id;
    @Getter @Setter private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
}
