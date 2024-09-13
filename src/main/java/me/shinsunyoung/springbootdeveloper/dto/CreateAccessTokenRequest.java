package me.shinsunyoung.springbootdeveloper.dto;


import lombok.Getter;
import lombok.Setter;
import me.shinsunyoung.springbootdeveloper.service.TokenService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Getter
@Setter
public class CreateAccessTokenRequest {
   private String refreshToken;
}
