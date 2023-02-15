package arthur.orderservice.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class RequestOrder {
    private String productId;
    private Integer quantity;
    private Integer unitPrice;
}
