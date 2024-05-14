package com.company.aggregationbug.view.order;

import com.company.aggregationbug.entity.Order;

import com.company.aggregationbug.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "orders", layout = MainView.class)
@ViewController("bug_Order.list")
@ViewDescriptor("order-list-view.xml")
@LookupComponent("ordersDataGrid")
@DialogMode(width = "64em")
public class OrderListView extends StandardListView<Order> {
}