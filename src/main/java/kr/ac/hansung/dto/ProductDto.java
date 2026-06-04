package kr.ac.hansung.dto;

import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Min;

@Getter
@Setter
public class ProductDto {

    @NotBlank(message = "상품명은 필수입니다.")
    private String name;

    @Min(value = 0, message = "가격은 0원 이상이어야 합니다.")
    private int price;

    @Min(value = 0, message = "재고는 0개 이상이어야 합니다.")
    private int stock;

    private String description;
}
