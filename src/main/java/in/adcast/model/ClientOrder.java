package in.adcast.model;
// Generated 3 Feb, 2018 4:50:11 PM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ClientOrder generated by hbm2java
 */
@Entity
@Table(name = "client_order", catalog = "sme_development")
public class ClientOrder implements java.io.Serializable {

	private Integer id;
	private Branch branch;
	private Client client;
	private String invoiceNo;
	private Date lastUpdated;
	private Date createdOn;
	private String ipAdress;
	private Boolean orderPaymentDone;
	private Integer orderStatus;
	private Boolean onlineBooking;
	private Integer discountType;
	private String offerCode;
	private BigDecimal lastMinDiscount;
	private Double lastMinDiscountPer;
	private String taxType;
	private Double taxRate;
	private BigDecimal total;
	private BigDecimal amountPaid;
	private Set<FeedbackSubdata> feedbackSubdatas = new HashSet<FeedbackSubdata>(0);
	private Set<SubOrder> subOrders = new HashSet<SubOrder>(0);
	private Set<SubOrder> subOrders_1 = new HashSet<SubOrder>(0);
	private Set<FeedbackSubdata> feedbackSubdatas_1 = new HashSet<FeedbackSubdata>(0);

	public ClientOrder() {
	}

	public ClientOrder(Branch branch, Client client, String invoiceNo, Date lastUpdated, Date createdOn,
			String ipAdress, Boolean orderPaymentDone, Integer orderStatus, Boolean onlineBooking, Integer discountType,
			String offerCode, BigDecimal lastMinDiscount, Double lastMinDiscountPer, String taxType, Double taxRate,
			BigDecimal total, BigDecimal amountPaid, Set<FeedbackSubdata> feedbackSubdatas, Set<SubOrder> subOrders,
			Set<SubOrder> subOrders_1, Set<FeedbackSubdata> feedbackSubdatas_1) {
		this.branch = branch;
		this.client = client;
		this.invoiceNo = invoiceNo;
		this.lastUpdated = lastUpdated;
		this.createdOn = createdOn;
		this.ipAdress = ipAdress;
		this.orderPaymentDone = orderPaymentDone;
		this.orderStatus = orderStatus;
		this.onlineBooking = onlineBooking;
		this.discountType = discountType;
		this.offerCode = offerCode;
		this.lastMinDiscount = lastMinDiscount;
		this.lastMinDiscountPer = lastMinDiscountPer;
		this.taxType = taxType;
		this.taxRate = taxRate;
		this.total = total;
		this.amountPaid = amountPaid;
		this.feedbackSubdatas = feedbackSubdatas;
		this.subOrders = subOrders;
		this.subOrders_1 = subOrders_1;
		this.feedbackSubdatas_1 = feedbackSubdatas_1;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "branch_id")
	public Branch getBranch() {
		return this.branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id")
	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Column(name = "invoice_no", length = 45)
	public String getInvoiceNo() {
		return this.invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_updated", length = 19)
	public Date getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_on", length = 19)
	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Column(name = "ip_adress", length = 45)
	public String getIpAdress() {
		return this.ipAdress;
	}

	public void setIpAdress(String ipAdress) {
		this.ipAdress = ipAdress;
	}

	@Column(name = "order_payment_done")
	public Boolean getOrderPaymentDone() {
		return this.orderPaymentDone;
	}

	public void setOrderPaymentDone(Boolean orderPaymentDone) {
		this.orderPaymentDone = orderPaymentDone;
	}

	@Column(name = "order_status")
	public Integer getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Column(name = "online_booking")
	public Boolean getOnlineBooking() {
		return this.onlineBooking;
	}

	public void setOnlineBooking(Boolean onlineBooking) {
		this.onlineBooking = onlineBooking;
	}

	@Column(name = "discount_type")
	public Integer getDiscountType() {
		return this.discountType;
	}

	public void setDiscountType(Integer discountType) {
		this.discountType = discountType;
	}

	@Column(name = "offer_code", length = 10)
	public String getOfferCode() {
		return this.offerCode;
	}

	public void setOfferCode(String offerCode) {
		this.offerCode = offerCode;
	}

	@Column(name = "lastMinDiscount", precision = 9)
	public BigDecimal getLastMinDiscount() {
		return this.lastMinDiscount;
	}

	public void setLastMinDiscount(BigDecimal lastMinDiscount) {
		this.lastMinDiscount = lastMinDiscount;
	}

	@Column(name = "lastMinDiscountPer", precision = 22, scale = 0)
	public Double getLastMinDiscountPer() {
		return this.lastMinDiscountPer;
	}

	public void setLastMinDiscountPer(Double lastMinDiscountPer) {
		this.lastMinDiscountPer = lastMinDiscountPer;
	}

	@Column(name = "tax_type", length = 45)
	public String getTaxType() {
		return this.taxType;
	}

	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	@Column(name = "tax_rate", precision = 22, scale = 0)
	public Double getTaxRate() {
		return this.taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

	@Column(name = "total", precision = 9)
	public BigDecimal getTotal() {
		return this.total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	@Column(name = "amount_paid", precision = 9)
	public BigDecimal getAmountPaid() {
		return this.amountPaid;
	}

	public void setAmountPaid(BigDecimal amountPaid) {
		this.amountPaid = amountPaid;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "clientOrder")
	public Set<FeedbackSubdata> getFeedbackSubdatas() {
		return this.feedbackSubdatas;
	}

	public void setFeedbackSubdatas(Set<FeedbackSubdata> feedbackSubdatas) {
		this.feedbackSubdatas = feedbackSubdatas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "clientOrder")
	public Set<SubOrder> getSubOrders() {
		return this.subOrders;
	}

	public void setSubOrders(Set<SubOrder> subOrders) {
		this.subOrders = subOrders;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "clientOrder")
	public Set<SubOrder> getSubOrders_1() {
		return this.subOrders_1;
	}

	public void setSubOrders_1(Set<SubOrder> subOrders_1) {
		this.subOrders_1 = subOrders_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "clientOrder")
	public Set<FeedbackSubdata> getFeedbackSubdatas_1() {
		return this.feedbackSubdatas_1;
	}

	public void setFeedbackSubdatas_1(Set<FeedbackSubdata> feedbackSubdatas_1) {
		this.feedbackSubdatas_1 = feedbackSubdatas_1;
	}

}
