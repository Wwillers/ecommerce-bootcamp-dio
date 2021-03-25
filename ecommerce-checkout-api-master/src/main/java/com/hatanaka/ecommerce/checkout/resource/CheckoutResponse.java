package com.hatanaka.ecommerce.checkout.resource;

import com.sun.source.doctree.SerialDataTree;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CheckoutResponse implements Serializable {

    private String code;
}
