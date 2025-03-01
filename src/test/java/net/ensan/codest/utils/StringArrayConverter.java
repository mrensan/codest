package net.ensan.codest.utils;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

public class StringArrayConverter extends SimpleArgumentConverter {

    @Override
    protected Object convert(final Object source, final Class<?> targetType) throws ArgumentConversionException {
        if (source instanceof String) {
            return ((String) source).split("\\s*,\\s*");
        }
        throw new ArgumentConversionException("Conversion from "
            + source.getClass()
            + " to "
            + targetType
            + " not supported");
    }
}
