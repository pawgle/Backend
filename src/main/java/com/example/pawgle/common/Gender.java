package com.example.pawgle.common;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Gender {
    MEN("남자"),
    WOMEN("여자");

    private final String info;
}
