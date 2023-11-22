package com.seven.nungil.controller;

import com.seven.nungil.dto.PlaceRegisterResponse;
import com.seven.nungil.dto.PlaceRequestDTO;
import com.seven.nungil.service.PlaceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/place")
@RequiredArgsConstructor
@Api(tags = "Place", description = "위치 추천자 관련 API")
public class placeController {
    private final PlaceService placeService;

    @PostMapping("/register")
    @ApiOperation(value = "새로운 위치 등록")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "위치 등록 성공"),
            @ApiResponse(code = 400, message = "입력 정보 오류")
    })
    public ResponseEntity<PlaceRegisterResponse> registerPlace(@RequestBody PlaceRequestDTO placeRequestDTO) {
        PlaceRegisterResponse response = placeService.placeRegister(placeRequestDTO);
        return ResponseEntity.ok(response);
    }
}
