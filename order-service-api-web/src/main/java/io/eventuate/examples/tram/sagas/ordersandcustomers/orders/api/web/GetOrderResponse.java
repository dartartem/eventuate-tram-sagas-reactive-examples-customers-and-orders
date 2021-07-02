package io.eventuate.examples.tram.sagas.ordersandcustomers.orders.api.web;

import io.eventuate.examples.tram.sagas.ordersandcustomers.orders.api.messaging.common.OrderState;
import io.eventuate.examples.tram.sagas.ordersandcustomers.orders.api.messaging.common.RejectionReason;

public class GetOrderResponse {
  private Long orderId;
  private OrderState orderState;
  private RejectionReason rejectionReason;

  public GetOrderResponse() {
  }

  public GetOrderResponse(Long orderId, OrderState orderState, RejectionReason rejectionReason) {
    this.orderId = orderId;
    this.orderState = orderState;
    this.rejectionReason = rejectionReason;
  }

  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public OrderState getOrderState() {
    return orderState;
  }

  public void setOrderState(OrderState orderState) {
    this.orderState = orderState;
  }

  public RejectionReason getRejectionReason() {
    return rejectionReason;
  }

  public void setRejectionReason(RejectionReason rejectionReason) {
    this.rejectionReason = rejectionReason;
  }
}
