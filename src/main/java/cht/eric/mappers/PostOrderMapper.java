package cht.eric.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import cht.eric.controllers.order.models.OrderPostDTO;
import cht.eric.models.Order;

@Mapper(componentModel = "spring")
public interface PostOrderMapper extends BasePostMapper<OrderPostDTO, Order> {
    public Order mapToDestination(OrderPostDTO source);
    public OrderPostDTO mapToSource(Order destination);
    public void updateToSource(@MappingTarget OrderPostDTO source, Order destination);
    public void updateToDestination(@MappingTarget Order destination, OrderPostDTO source);
}