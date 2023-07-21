package lap5;

public class Ungdung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HocSinh hs;
		//HocSinh[] dsHS = new HocSinh[5];
		
		//Khai Bao hoc sinh tieu hoc
		//TieuHoc tieuhoc;
		//tao moi doi tuong hoc sinh tieu hoc cung voi thuoc tinh
		//tieuhoc = new TieuHoc(1,"Duy",true,5.5,6.7,7.8);
		
		//tao danh sach chua 5 hoc sinh(gom 3 trung hoc va 2 tieu hoc)
		HocSinh[] ds = new HocSinh[5];
		//1,2,3 la hoc sinh trung hoc
		ds[0] = new TrungHoc(7,"Duy",true,9,9,9);
		ds[1] = new TrungHoc(8,"Long",true,9,9,9);
		ds[2] = new TrungHoc(9,"Dâu",true,9,9,9);
		//4,5 la hoc sinh tieu hoc
		ds[3] = new TieuHoc(10,"An",true,10,9,8);
		ds[4] = new TieuHoc(11,"Tien",true,9,10,7);
		
		//in danh sach
		for(int i = 0; i < 5; i++) {
			ds[i].thongTin();
		}
	}

}
