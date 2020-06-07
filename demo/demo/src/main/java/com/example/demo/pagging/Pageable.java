package com.example.demo.pagging;

public interface Pageable {
	int getPage();
    int getOffset();
    int getLimit();
}
