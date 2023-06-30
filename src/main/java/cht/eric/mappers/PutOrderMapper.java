package cht.eric.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import cht.eric.controllers.order.models.OrderPutDTO;
import cht.eric.models.Order;

@Mapper(componentModel = "spring")
public interface PutOrderMapper extends BasePutMapper<OrderPutDTO, Order> {
    public Order mapToDestination(OrderPutDTO source);
    public OrderPutDTO mapToSource(Order destination);
    public void updateToSource(@MappingTarget OrderPutDTO source, Order destination);
    public void updateToDestination(@MappingTarget Order destination, OrderPutDTO source);
}