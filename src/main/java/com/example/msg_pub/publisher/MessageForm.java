package com.example.msg_pub.publisher;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class MessageForm {
    @Getter
    @Setter
    @NotBlank
    private String name;

    @Getter
    @Setter
    @NotNull
    @Min(0)
    private BigDecimal amount;
}
