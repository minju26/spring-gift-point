package gift.api.kakaoAuth;

import com.fasterxml.jackson.annotation.JsonProperty;

public record KakaoTokenResponse(@JsonProperty("access_token") String accessToken,
                                 @JsonProperty("expires_in") Integer accessTokenExpiresIn,
                                 @JsonProperty("refresh_token") String refreshToken,
                                 @JsonProperty("refresh_token_expires_in") Integer refreshTokenExpiresIn) {

}