package vn.com.edu.fit.week01.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import vn.com.edu.fit.week01.enums.Status;

import java.util.stream.Stream;

@Converter(autoApply = true)
public class AccountStatusConverter implements AttributeConverter<Status,Integer> {

    @Override
    public Integer convertToDatabaseColumn(Status attribute) {
        return attribute == null? null : attribute.getValue();
    }

    @Override
    public Status convertToEntityAttribute(Integer dbData) {
        return dbData == null ? null : Stream.of(Status.values())
                .filter(c -> c.getValue() == dbData)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
