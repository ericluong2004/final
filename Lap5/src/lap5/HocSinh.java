package lap5;

public abstract class HocSinh {
	private int maHS;
	private String tenHS;
	private Boolean gioiTinh;
	
	public HocSinh(){
		
	}
	
	public HocSinh(int mahs, String tenhs,Boolean gioitinh) {
		maHS = mahs;
		tenHS = tenhs;
		gioiTinh = gioitinh;
	}
	
	abstract double diemTb();
	
	abstract String xepLoai();
	
	abstract void thongTin();
	
	public int getmaHS() {
		return maHS;
	}
	
	public void setmaHS(int mahs) {
		this.maHS = mahs;
	}
	
	public String gettenHS() {
		return tenHS;
	}
	
	public void settenHS(String tenhs) {
		this.tenHS = tenhs;
	}
	
	public boolean getgioiTinh() {
		return gioiTinh;
	}
	 public void setgioiTinh(Boolean gioitinh) {
		 this.gioiTinh = gioitinh;
	 }
}

