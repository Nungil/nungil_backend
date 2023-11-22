package com.seven.nungil.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserRegisterResponse {
    @ApiModelProperty(value = "userId", example = "1")
    private Long userId;

    public static UserRegisterResponse of (Long userId){return new UserRegisterResponse(userId);}
}
