package com.example.pawgle.common;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Question {
    LONG("장문형"),
    SHORT("단답형");

    private final String info;
}
