package cht.eric.controllers.order.models;

import java.util.Date;

import lombok.Data;


@Data
public class OrderPutDTO {
	private String category;
	private String city;
	private String country;
	private String customerIdNumber;
	private String customerName;
	private float discount;
	private byte isReturned;
	private Date orderDate;
	private int postalCode;
	private String productIdNumber;
	private String productName;
	private double profit;
	private int quantity;
	private String region;
	private double sales;
	private String segment;
	private Date shipDate;
	private String shipMode;
	private String state;
	private String subCategory;
}
