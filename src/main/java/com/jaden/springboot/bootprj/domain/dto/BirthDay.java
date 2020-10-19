package com.jaden.springboot.bootprj.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Embeddable;
import java.time.LocalDate;


@Embeddable // entity 에 속해있는 DTO 임을 알려줌
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Birthday {
    private Integer yearOfBirthday;
    private Integer monthOfBirthday;
    private Integer dayOfBirthday;

    private Birthday(LocalDate birthday) {
        this.yearOfBirthday = birthday.getYear();
        this.monthOfBirthday = birthday.getMonthValue();
        this.dayOfBirthday = birthday.getDayOfMonth();
    }


    public static Birthday of(LocalDate birthday){
        return new Birthday(birthday);
    }
}
