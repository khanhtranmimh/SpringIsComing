package springiscoming.springiscoming.Dtos;

import io.swagger.v3.oas.annotations.media.Schema;

public class UserRequestDto {
    @Schema(description = "Tên người dùng", example = "Nguyễn Văn A")
    public String name;

    @Schema(description = "Email người dùng", example = "nguyenvana@example.com")
    public String email;

    @Schema(description = "Năm sinh", example = "1990")
    public int yearOfBirth;

    @Schema(description = "Quê quán", example = "Ha Noi")
    public String homeTown;
}
