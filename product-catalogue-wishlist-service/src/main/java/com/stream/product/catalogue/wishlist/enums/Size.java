package com.stream.product.catalogue.wishlist.enums;

import lombok.Getter;

@Getter
public enum Size {
    ZEROTOTHREEM("O-3M"),THREETOSIXM("3-6M"),SIXTONINEM("6-9M"),NINETOTWELVEM("9-12M"),
    XS("EXTRA-SMALL"),S("SMALL"),M("MEDIUM"),L("LARGE"),XL("EXTRA-LARGE"),XXL("DOUBLE-EXTRA-LARGE"),XXXL("TRIPLE-EXTRA-LARGE");
    private final String size;
    // private enum constructor
    private Size(String size) {
        this.size = size;
    }
    public String getSize() {
        return size;
    }

}
