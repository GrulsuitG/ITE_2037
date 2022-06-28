package homework4;

class CellPhone{
	private String name;
	private String company;
	private String color;
	private boolean power = false;
	private boolean camera = false;
	public CellPhone() {}
	public CellPhone(String name, String company, String color) {
		this(name, company, color, false,false);
	}
	public CellPhone(String name, String company, String color, boolean power, boolean camera) {
		this.name = name;
		this.company = company;
		this.color = color;
		this.power = power;
		this.camera = camera;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public void setCamera(boolean camera) {
		this.camera = camera;
	}
	public String getName() {
		return name;
	}
	public String getCompany() {
		return company;
	}
	public String getColor() {
		return color;
	}
	public boolean getPower() {
		return power;
	}
	public boolean getCamera() {
		return camera;
	}
	public void power() {
		if(power == false) {
			power = true;
		}
		else
			power = false;
	}
}
public class CellPhoneTest {
	public static void main(String[] args) {
		CellPhone cp = new CellPhone();
		cp.setName("im-m460k");
		cp.setCompany("SKY");
		cp.setColor("pink");
		cp.setPower(false);
		cp.setCamera(true);
		System.out.println("모델명: " +cp.getName() + " 제조회사: " 
				+cp.getCompany() + " 전원 상태 : " +cp.getPower());
		cp.power();
		System.out.println("모델명: " +cp.getName() + " 제조회사: " 
				+cp.getCompany() + " 전원 상태 : " +cp.getPower());
		CellPhone cp1 = new CellPhone("abc-111", "LG", "silver");
		CellPhone cp2 = new CellPhone("12-111","모토롤라", "black", false, true);
	}
}
