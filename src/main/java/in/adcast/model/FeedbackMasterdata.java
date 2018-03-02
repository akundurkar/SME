package in.adcast.model;
// Generated 3 Feb, 2018 4:50:11 PM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * FeedbackMasterdata generated by hbm2java
 */
@Entity
@Table(name = "feedback_masterdata", catalog = "sme_development")
public class FeedbackMasterdata implements java.io.Serializable {

	private Integer id;
	private String question;
	private Set<FeedbackSubdata> feedbackSubdatas = new HashSet<FeedbackSubdata>(0);
	private Set<FeedbackSubdata> feedbackSubdatas_1 = new HashSet<FeedbackSubdata>(0);

	public FeedbackMasterdata() {
	}

	public FeedbackMasterdata(String question, Set<FeedbackSubdata> feedbackSubdatas,
			Set<FeedbackSubdata> feedbackSubdatas_1) {
		this.question = question;
		this.feedbackSubdatas = feedbackSubdatas;
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

	@Column(name = "question", length = 45)
	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "feedbackMasterdata")
	public Set<FeedbackSubdata> getFeedbackSubdatas() {
		return this.feedbackSubdatas;
	}

	public void setFeedbackSubdatas(Set<FeedbackSubdata> feedbackSubdatas) {
		this.feedbackSubdatas = feedbackSubdatas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "feedbackMasterdata")
	public Set<FeedbackSubdata> getFeedbackSubdatas_1() {
		return this.feedbackSubdatas_1;
	}

	public void setFeedbackSubdatas_1(Set<FeedbackSubdata> feedbackSubdatas_1) {
		this.feedbackSubdatas_1 = feedbackSubdatas_1;
	}

}
