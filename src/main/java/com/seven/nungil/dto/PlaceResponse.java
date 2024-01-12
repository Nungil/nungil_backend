package com.seven.nungil.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PlaceResponse {
    @ApiModelProperty(value = "placeId", example = "1")
    private Long placeId;

    @ApiModelProperty(value = "장소 위도", example = "92.21")
    private Float latitude;

    @ApiModelProperty(value = "장소 경도", example = "37.51")
    private Float longitude;

    @ApiModelProperty(value = "장소명", example = "대나무 숲")
    private String placeName;

    @ApiModelProperty(value = "장소 메시지", example = "나뭇잎에 이는 바람 소리가 청명한 곳")
    private String placeDescription;

    @ApiModelProperty(value = "추천 위치 주소(최대 40)", example = "부산 기장군 철마면 웅천리 520-10")
    private String address;

    @ApiModelProperty(value = "장소 제공자", example = "유승한")
    private String placeProvider;

    @ApiModelProperty(value = "퀴즈", example = "너랑 갔던 빵집")
    private String quiz;

    @ApiModelProperty(value = "퀴즈 정답", example = "파리바게뜨")
    private String quizAnswer;

//    @ApiModelProperty(value = "퀴즈 여부", example = "true")
//    private Boolean isQuiz;



    public static PlaceResponse of (Long placeId, Float latitude, Float longitude, String placeName, String placeDescription, String address, String placeProvider, String quiz, String quizAnswer) {
        return new PlaceResponse(placeId, latitude,longitude, placeName, placeDescription, address, placeProvider, quiz, quizAnswer);
    }
}
