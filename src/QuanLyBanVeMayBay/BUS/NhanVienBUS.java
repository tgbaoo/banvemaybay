package QuanLyBanVeMayBay.BUS;
import java.util.ArrayList;

import QuanLyBanVeMayBay.DAO.NhanVienDAO;
import QuanLyBanVeMayBay.DTO.NhanVien;

public class NhanVienBUS {
	  NhanVienDAO nvDAO = new NhanVienDAO();
	     ArrayList<NhanVien> listNhanVien = null;

//	    public NhanVienBUS() {
//	        docDanhSach();
//	    }

	    public void docDanhSach() {
	      this.listNhanVien = nvDAO.getDanhSachNhanVien();
	    }

	    public  ArrayList<NhanVien> getDanhSachNhanVien() {
	        if (listNhanVien == null)
	            docDanhSach();
	        return listNhanVien;
	    }
            
            public  ArrayList<NhanVien> showListNhanVien() {
	            docDanhSach();
	        return listNhanVien;
	    }

	    public  boolean themNhanVien(String ho, String ten, String gioiTinh, String ngaySinh , int sdt , int luong) {
	       
	        
	        
	        if (ho.trim().equals("")) {
//	            new MyDialog("Họ không được để trống!", MyDialog.ERROR_DIALOG);
	            return false;
	        }
	      
	        if (ten.trim().equals("")) {
//	            new MyDialog("Tên không được để trống!", MyDialog.ERROR_DIALOG);
	            return false;
	        }
	        
	        
	        if (gioiTinh.trim().equals("")) {
//	            new MyDialog("Họ không được để trống!", MyDialog.ERROR_DIALOG);
	            return false;
	        }
	      
	        if (ngaySinh.trim().equals("")) {
//	            new MyDialog("Tên không được để trống!", MyDialog.ERROR_DIALOG);
	            return false;
	        }
	        
	        
	        
	        if (Integer.toString(sdt).trim().equals("")) {
//	            new MyDialog("Họ không được để trống!", MyDialog.ERROR_DIALOG);
	            return false;
	        }
	      
	        if (Integer.toString(luong).trim().equals("")){
//	            new MyDialog("Tên không được để trống!", MyDialog.ERROR_DIALOG);
	            return false;
	        }
	        
	        
	        
	        
	        
	        NhanVien nv = new NhanVien();
	        nv.setHoNV(ho);
	        nv.setTenNV(ten);
	        nv.setGioiTinh(gioiTinh);
	        nv.setNgaySinh(ngaySinh);
	        nv.setSdt(sdt);
	        nv.setLuong(luong);
	        boolean flag = nvDAO.themNhanVien(nv);
	        if (!flag) {
//	            new MyDialog("Thêm thất bại!", MyDialog.ERROR_DIALOG);
System.out.print("thanh cong");
	        } else {
//	            new MyDialog("Thêm thành công!", MyDialog.SUCCESS_DIALOG);
System.out.print("That bai");

	        }
	        return flag;
	    }

	    public  boolean updateNhanVien(int maNV, String ho, String ten, String gioiTinh, String ngaySinh , int sdt , int luong) {
	    	
	    	if(ho.trim().equals("")){
	            // new dialog bao' loi~;
	            return false;
	        }
	        if(ten.trim().equals("")){
	            // new dialog bao' loi~;
	            return false;
	        }
	        if(gioiTinh.trim().equals("")){
	            // new dialog bao' loi~;
	            return false;
	        }
	        if(Integer.toString(luong).trim().equals("")){
	            // new dialog bao' loi~;
	            return false;
	        }
	        if(ngaySinh.trim().equals("")){
	            // new dialog bao' loi~;
	            return false;
	        }
	        if(Integer.toString(sdt).trim().equals("")){
	            // new dialog bao' loi~;
	            return false;
	        }
	        NhanVien nv = new NhanVien();
	        nv.setMaNV(maNV);
	        nv.setHoNV(ho);
	        nv.setTenNV(ten);
	        nv.setGioiTinh(gioiTinh);
	        nv.setNgaySinh(ngaySinh);
	        nv.setSdt(sdt);
	        nv.setLuong(luong);
	        boolean flag = nvDAO.updateNhanVien(nv);
	        if (flag) {
	        	  System.out.print("thanh cong");
//	            new MyDialog("Cập nhập thất bại!", MyDialog.ERROR_DIALOG);
	        } else {
//	            new MyDialog("Cập nhập thành công!", MyDialog.SUCCESS_DIALOG);
	        	 System.out.print("That bai");
	        }
	        return flag;
	    }
	    
	    
	    public  ArrayList<NhanVien> timNhanVien(String tuKhoa) {
	        tuKhoa = tuKhoa.toLowerCase();
	        ArrayList<NhanVien> dsnv = new ArrayList<>();
	        for (NhanVien nv : listNhanVien) {
	            if (nv.getHoNV().toLowerCase().contains(tuKhoa) || nv.getTenNV().toLowerCase().contains(tuKhoa) ||
	                    nv.getGioiTinh().toLowerCase().contains(tuKhoa) || nv.getNgaySinh().toLowerCase().contains(tuKhoa) || Integer.toString(nv.getSdt()).contains(tuKhoa) || Integer.toString(nv.getLuong()).contains(tuKhoa)) {
	                dsnv.add(nv);
	            }
	        }
	        return dsnv;
	    }


	    public ArrayList<NhanVien> timKiemNhanVienTheoTen(String tenNV){
	    	ArrayList<NhanVien> dsnv = new ArrayList<>();
	        for(NhanVien nv : listNhanVien ){
	            String ho = nv.getHoNV();
	            String ten = nv.getTenNV();
	            if(ten.contains(tenNV)){
	            	dsnv.add(nv);
	            }
	        }
	        return dsnv;
	    }
	    
	    public ArrayList<NhanVien> timKiemNhanVienTheoMa(String maNV){
	        ArrayList<NhanVien> dsnv = new ArrayList<>();
	        for(NhanVien nv : listNhanVien ){
	            int ma = nv.getMaNV();
	            if(ma == Integer.parseInt(maNV)){
	            	dsnv.add(nv);
	            }
	        }
	        return dsnv;
	    }
	    
	    public ArrayList<NhanVien> timKiemNhanVienTheoSDT(String sdt){
	    	  ArrayList<NhanVien> dsnv = new ArrayList<>();
	       	  for(NhanVien nv : listNhanVien ){
	            int sodienthoai = nv.getSdt();
	            if(Integer.toString(sodienthoai).contains(sdt)){
	            	dsnv.add(nv);
	            }
	        }
	       	 return dsnv;
	    }
	    
	    
//	    public ArrayList<NhanVien> timKiemNhanVienTheoCanCuoc(String canCuoc){
//	    	 ArrayList<NhanVien> dsnv = new ArrayList<>();
//	    	 for(NhanVien nv : listNhanVien ){
//	            String cancuoc = nv.getCanCuoc();
//	            if(cancuoc.equals(canCuoc)){
//	            	dsnv.add(nv);
//	            }
//	        }
//	    	 return dsnv;
//	    }

	  

		public  boolean xoaNhanVien(int maNV) {
			boolean flag = false;

	        try {
	         
	        	 flag = nvDAO.deleteNhanVien(maNV);

	          
	        } catch (Exception e) {

	        }
	        
	        if(flag) {
	        	System.out.print("thanh cong");
	        }else {
	        		        	System.out.print("that bai");

	        }
	        return flag;
	    }

	    public boolean nhapExcel(String ho, String ten, String gioiTinh, String ngaySinh , int sdt , int luong) {
	        NhanVien nv = new NhanVien();
	        nv.setHoNV(ho);
	        nv.setTenNV(ten);
	        nv.setGioiTinh(gioiTinh);
	        nv.setNgaySinh(ngaySinh);
	        nv.setSdt(sdt);
	        nv.setLuong(luong);
	        boolean flag = nvDAO.nhapExcel(nv);
	        return flag;
	    }
}
