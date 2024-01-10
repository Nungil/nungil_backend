package com.seven.nungil.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoResponse {

    @ApiModelProperty(value = "사용자 명", example = "유승한")
    private String userName;

    @ApiModelProperty(value = "추천 받는 장소 테마", example = "분위기 좋은 카페")
    private String placeTheme;

    @ApiModelProperty(value = "장소 개수", example = "10")
    private Integer placeCount;

    public static UserInfoResponse of (String userName, String placeTheme, Integer placeCount) {
        return new UserInfoResponse(userName, placeTheme, placeCount);
    }
}
