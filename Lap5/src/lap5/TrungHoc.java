package lap5;

public class TrungHoc extends HocSinh{
	private double daiSo;
	private double nguVan;
	private double anhVan;
	
	public TrungHoc(int maHS,String tenHS,Boolean gioiTinh,double daiSo,double nguVan,double anhVan) {
		super(maHS,tenHS,gioiTinh);
		this.daiSo = daiSo;
		this.nguVan = nguVan;
		this.anhVan = anhVan;
	}
	@Override
	double diemTb() {
		// TODO Auto-generated method stub
		double kq = 0;
		kq = ((daiSo*2)+(nguVan*2)+anhVan)/5;
		return kq;
	}
	@Override
	String xepLoai() {
		// TODO Auto-generated method stub
		String xl = "";
		double kq1 = ((daiSo*2)+(nguVan*2)+anhVan)/5;
		if (kq1 >= 9) {
			xl = "Giỏi";
		}else if (kq1 >= 7){
			xl = "Khá";
		}else if(kq1 >= 5) {
			xl = "Trung Bình";
		}else {
			xl = "Yếu";
			if(kq1 < 5 && daiSo < 5) {
				System.out.println("Đại số: "+daiSo);
				System.out.println("Cần thi lại đại số");
			}else if (kq1 < 5 && nguVan < 5) {
				System.out.println("Ngữ văn: "+nguVan);
				System.out.println("Cần thi lại ngữ văn");
			}else if (kq1 < 5 && anhVan < 5) {
				System.out.println("Anh văn: "+anhVan);
				System.out.println("Cần thi lại anh văn");
			}else {
				//
			}
		}
		return xl;
	}	
	@Override
	void thongTin() {
		// TODO Auto-generated method stub
		System.out.println("---- DSHS Trung Học ----");
		System.out.println("Mã học sinh: "+ getmaHS());
		System.out.println("Tên học sinh: "+gettenHS());
		System.out.println("Xếp loại: "+xepLoai());
		System.out.println();
		
	}
}
