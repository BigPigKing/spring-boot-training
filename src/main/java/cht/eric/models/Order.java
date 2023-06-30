package cht.eric.models;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


/**
 * The persistent class for the order database table.
 *
 */
@Entity
@Table(name="`order`")
@NamedQuery(name="Order.findAll", query="SELECT o FROM Order o")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, length=14)
	private String id;

	@Column(nullable=false, length=100)
	private String category;

	@Column(nullable=false, length=300)
	private String city;

	@Column(nullable=false, length=300)
	private String country;

	@Column(name="customer_id_number", nullable=false, length=8)
	private String customerIdNumber;

	@Column(name="customer_name", nullable=false, length=100)
	private String customerName;

	@Column(nullable=false)
	private float discount;

	@Column(name="is_returned", nullable=false)
	private byte isReturned;

	@Temporal(TemporalType.DATE)
	@Column(name="order_date", nullable=false)
	private Date orderDate;

	@Column(name="postal_code", nullable=false)
	private int postalCode;

	@Column(name="product_id_number", nullable=false, length=15)
	private String productIdNumber;

	@Column(name="product_name", nullable=false, length=300)
	private String productName;

	@Column(nullable=false)
	private double profit;

	@Column(nullable=false)
	private int quantity;

	@Column(nullable=false, length=100)
	private String region;

	@Column(nullable=false)
	private double sales;

	@Column(nullable=false, length=100)
	private String segment;

	@Temporal(TemporalType.DATE)
	@Column(name="ship_date", nullable=false)
	private Date shipDate;

	@Column(name="ship_mode", nullable=false, length=100)
	private String shipMode;

	@Column(nullable=false, length=300)
	private String state;

	@Column(name="sub_category", nullable=false, length=100)
	private String subCategory;

	public Order() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCustomerIdNumber() {
		return this.customerIdNumber;
	}

	public void setCustomerIdNumber(String customerIdNumber) {
		this.customerIdNumber = customerIdNumber;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public float getDiscount() {
		return this.discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public byte getIsReturned() {
		return this.isReturned;
	}

	public void setIsReturned(byte isReturned) {
		this.isReturned = isReturned;
	}

	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getProductIdNumber() {
		return this.productIdNumber;
	}

	public void setProductIdNumber(String productIdNumber) {
		this.productIdNumber = productIdNumber;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProfit() {
		return this.profit;
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public double getSales() {
		return this.sales;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}

	public String getSegment() {
		return this.segment;
	}

	public void setSegment(String segment) {
		this.segment = segment;
	}

	public Date getShipDate() {
		return this.shipDate;
	}

	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}

	public String getShipMode() {
		return this.shipMode;
	}

	public void setShipMode(String shipMode) {
		this.shipMode = shipMode;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSubCategory() {
		return this.subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

}