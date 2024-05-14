package com.company.aggregationbug.view.orderlineitem;

import com.company.aggregationbug.entity.OrderLineItem;

import com.company.aggregationbug.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "orderLineItems", layout = MainView.class)
@ViewController("bug_OrderLineItem.list")
@ViewDescriptor("order-line-item-list-view.xml")
@LookupComponent("orderLineItemsDataGrid")
@DialogMode(width = "64em")
public class OrderLineItemListView extends StandardListView<OrderLineItem> {
}