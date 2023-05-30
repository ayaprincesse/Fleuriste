package com.flowershop.flowershop.entities;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class TypeBouquetConverter implements AttributeConverter<BouquetType, String> {
    @Override
    public String convertToDatabaseColumn(BouquetType type) {
        if (type == null) {
            return null;
        }
        return type.getCode();
    }

    @Override
    public BouquetType convertToEntityAttribute(String code) {
        if (code == null) {
            return null;
        }

        return Stream.of(BouquetType.values())
                .filter(c -> c.getCode().equals(code))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
