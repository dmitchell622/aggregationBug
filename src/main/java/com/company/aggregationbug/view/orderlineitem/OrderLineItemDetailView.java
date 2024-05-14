package com.company.aggregationbug.view.orderlineitem;

import com.company.aggregationbug.entity.OrderLineItem;

import com.company.aggregationbug.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "orderLineItems/:id", layout = MainView.class)
@ViewController("bug_OrderLineItem.detail")
@ViewDescriptor("order-line-item-detail-view.xml")
@EditedEntityContainer("orderLineItemDc")
public class OrderLineItemDetailView extends StandardDetailView<OrderLineItem> {
}