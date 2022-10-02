package net.ensan.codest.utils;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

public class IntegerArrayConverter extends SimpleArgumentConverter {
    @Override
    protected Object convert(final Object source, final Class<?> targetType) throws ArgumentConversionException {
        if (source instanceof String) {
            return convertArray(((String)source).split("\\s*,\\s*"));
        }
        throw new ArgumentConversionException("Converting from " + source.getClass() + " to " + targetType + " not supported");
    }

    private int[] convertArray(String[] result) {
        int[] numbers = new int[result.length];
        for (int i = 0 ; i < result.length ; i++) {
            numbers[i] = Integer.parseInt(result[i]);
        }
        return numbers;
    }
}
