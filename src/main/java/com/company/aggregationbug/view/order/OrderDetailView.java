package com.company.aggregationbug.view.order;

import com.company.aggregationbug.entity.Order;

import com.company.aggregationbug.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "orders/:id", layout = MainView.class)
@ViewController("bug_Order.detail")
@ViewDescriptor("order-detail-view.xml")
@EditedEntityContainer("orderDc")
public class OrderDetailView extends StandardDetailView<Order> {
}