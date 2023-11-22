package com.seven.nungil.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class QuizResponse {
    @ApiModelProperty(value = "퀴즈", example = "너랑 갔던 빵집")
    private String quiz;

    @ApiModelProperty(value = "퀴즈 정답", example = "파리바게뜨")
    private String quizAnswer;

    @ApiModelProperty(value = "퀴즈 정답 글자 수", example = "5")
    private Integer quizAnswerCount;

    @ApiModelProperty(value = "자동으로 제공되는 힌트", example = "파_바_뜨")
    private String quizHint;

    public static QuizResponse of (String quiz, String quizAnswer, Integer quizAnswerCount, String quizHint) {
        return new QuizResponse(quiz, quizAnswer,quizAnswerCount, quizHint);
    }
}
