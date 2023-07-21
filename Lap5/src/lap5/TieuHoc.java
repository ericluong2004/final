package lap5;

public class TieuHoc extends HocSinh{
	
	private double Toan;
	private double tiengViet;
	private double ngheThuat;
	
	public TieuHoc() {
		
	}
	
	public TieuHoc(int mahs, String tenhs, Boolean gioitinh, double toan, double tiengviet, double nghethuat) {
		super(mahs,tenhs,gioitinh);
		Toan = toan;
		tiengViet = tiengviet;
		ngheThuat = nghethuat;
	}
	
	
	@Override
	double diemTb() {
		// TODO Auto-generated method stub
		double kq=0.0;
		kq = (Toan + tiengViet + ngheThuat)/3;
		return kq;
	}
	@Override
	String xepLoai() {
		String xeploai="";
		double kq1 = 0.0;
		kq1 = (Toan + tiengViet + ngheThuat)/3;
		//Cau lenh thuc hien viec xep loai
		if (kq1 >= 8) {
			xeploai = "Hoàn thành tốt";
		}
		else if(kq1 <= 7 && kq1 >= 5) {
			xeploai = "Đạt yêu cầu";
		}
		else 
			xeploai = "Không Đạt";
		return xeploai;
	}
	@Override
	void thongTin() {
		// TODO Auto-generated method stub
		System.out.println("---- DSHS Tieu Hoc ----");
		System.out.println("Mã học sinh: "+ getmaHS());
		System.out.println("Tên học sinh: "+gettenHS());
		System.out.println("Xếp loại: "+xepLoai());
		System.out.println();
	}	
}
