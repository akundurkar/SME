package in.adcast.model;
// Generated 3 Feb, 2018 4:50:11 PM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * SubOrder generated by hbm2java
 */
@Entity
@Table(name = "sub_order", catalog = "sme_development")
public class SubOrder implements java.io.Serializable {

	private Integer id;
	private ApplicationUser applicationUser;
	private ClientOrder clientOrder;
	private ServiceOffered serviceOffered;
	private BigDecimal serviceCost;

	public SubOrder() {
	}

	public SubOrder(ClientOrder clientOrder, ServiceOffered serviceOffered) {
		this.clientOrder = clientOrder;
		this.serviceOffered = serviceOffered;
	}

	public SubOrder(ApplicationUser applicationUser, ClientOrder clientOrder, ServiceOffered serviceOffered,
			BigDecimal serviceCost) {
		this.applicationUser = applicationUser;
		this.clientOrder = clientOrder;
		this.serviceOffered = serviceOffered;
		this.serviceCost = serviceCost;
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
	@JoinColumn(name = "staff_id")
	public ApplicationUser getApplicationUser() {
		return this.applicationUser;
	}

	public void setApplicationUser(ApplicationUser applicationUser) {
		this.applicationUser = applicationUser;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_id", nullable = false)
	public ClientOrder getClientOrder() {
		return this.clientOrder;
	}

	public void setClientOrder(ClientOrder clientOrder) {
		this.clientOrder = clientOrder;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "service_id", nullable = false)
	public ServiceOffered getServiceOffered() {
		return this.serviceOffered;
	}

	public void setServiceOffered(ServiceOffered serviceOffered) {
		this.serviceOffered = serviceOffered;
	}

	@Column(name = "service_cost", precision = 9)
	public BigDecimal getServiceCost() {
		return this.serviceCost;
	}

	public void setServiceCost(BigDecimal serviceCost) {
		this.serviceCost = serviceCost;
	}

}
