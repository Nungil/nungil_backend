package com.seven.nungil.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PlaceRegisterResponse {
    @ApiModelProperty(value = "placeId", example = "1")
    private Long placeId;

    public static PlaceRegisterResponse of (Long placeId){return new PlaceRegisterResponse(placeId);}
}
