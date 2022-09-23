package com.github.manimovassagh.orderservice.dto;


import com.github.manimovassagh.orderservice.model.OrderLineItems;
import lombok.*;
import org.springframework.context.annotation.Bean;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;




@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
    private List<OrderLineItemsDto> orderLineItemsDtoList;
}
