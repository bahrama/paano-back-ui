package com.tehranch.paanobackui.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/merchant")
public class MerchantController {

    @GetMapping("/register")
    @Operation(summary = "add api with condition" , operationId = "addUser" , description = "notice that this has condition")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200" , description = "ok hast"),
            @ApiResponse(responseCode = "400" , description = "not found")
    })
    public ResponseEntity<?> findMerchantList(@RequestParam(value = "page" , defaultValue = "1") int page
            , @RequestParam(value = "limit" , defaultValue = "15") int limit
            , @RequestParam(value = "sort" , required = false) String sort
    ) {
        return null;
    }
}
