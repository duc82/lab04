package beans;

public class Customer {
	private int cusId;
	private String cusUser;
	private String cusPass;
	private String cusName;
	private String cusPhone;
	private String cusAdd;
	private String cusEmail;
	private String cusFacebook;
	private String cusSkyper;
	private int cusStatus;

	public Customer(int cusId, String cusUser, String cusPass, String cusName, String cusPhone, String cusAdd,
			String cusEmail, String cusFacebook, String cusSkyper, int cusStatus) {
		super();
		this.cusId = cusId;
		this.cusUser = cusUser;
		this.cusPass = cusPass;
		this.cusName = cusName;
		this.cusPhone = cusPhone;
		this.cusAdd = cusAdd;
		this.cusEmail = cusEmail;
		this.cusFacebook = cusFacebook;
		this.cusSkyper = cusSkyper;
		this.cusStatus = cusStatus;
	}

	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public String getCusUser() {
		return cusUser;
	}

	public void setCusUser(String cusUser) {
		this.cusUser = cusUser;
	}

	public String getCusPass() {
		return cusPass;
	}

	public void setCusPass(String cusPass) {
		this.cusPass = cusPass;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getCusPhone() {
		return cusPhone;
	}

	public void setCusPhone(String cusPhone) {
		this.cusPhone = cusPhone;
	}

	public String getCusAdd() {
		return cusAdd;
	}

	public void setCusAdd(String cusAdd) {
		this.cusAdd = cusAdd;
	}

	public String getCusEmail() {
		return cusEmail;
	}

	public void setCusEmail(String cusEmail) {
		this.cusEmail = cusEmail;
	}

	public String getCusFacebook() {
		return cusFacebook;
	}

	public void setCusFacebook(String cusFacebook) {
		this.cusFacebook = cusFacebook;
	}

	public String getCusSkyper() {
		return cusSkyper;
	}

	public void setCusSkyper(String cusSkyper) {
		this.cusSkyper = cusSkyper;
	}

	public int getCusStatus() {
		return cusStatus;
	}

	public void setCusStatus(int cusStatus) {
		this.cusStatus = cusStatus;
	}

}
