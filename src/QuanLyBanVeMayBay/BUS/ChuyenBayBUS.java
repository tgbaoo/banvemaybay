/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.BUS;

import QuanLyBanVeMayBay.DAO.ChuyenBayDAO;
import QuanLyBanVeMayBay.DTO.ChuyenBay;
//import Template.Dialog;
import java.util.ArrayList;
import QuanLyBanVeMayBay.DAO.MayBayDAO;

/**
 *
 * @author Thepi314
 */
public class ChuyenBayBUS {
    private ArrayList<ChuyenBay> listCB = null;
    private ChuyenBayDAO cbDAO = new ChuyenBayDAO();
<<<<<<< HEAD
    private MayBayDAO mbDAO = new MayBayDAO();
 
=======
//    private MayBayDAO mbDAO = new MayBayDAO();
//    mbDAO.docListMayBay();
    public ChuyenBayBUS() {
        docListChuyenBay();
    }
>>>>>>> 911a8f62867e3c85baf2d4db198343614a8bbd3a

    public void docListChuyenBay() {
        this.listCB = cbDAO.getListChuyenBay();
    }

    public ArrayList<ChuyenBay> getListChuyenBay() {
        if (listCB == null) {
            docListChuyenBay();
        }
        
        return listCB;
    }
    
    public ArrayList<ChuyenBay> listCB() {
        docListChuyenBay();
        return listCB;
    }
    
    public ArrayList<ChuyenBay> listCB() {
        docListChuyenBay();
        return listCB;
    }

    public ChuyenBay getChuyenBay(String ma) {
        if (!ma.trim().equals("")) {
            try {
                int maCB = Integer.parseInt(ma);
                for (ChuyenBay cb : listCB) {
                    if (cb.getMaChuyenBay() == maCB) {
                        return cb;
                    }
                }
            } catch (Exception e) {
            }
        }
        return null;
    }

    public ArrayList<ChuyenBay> getChuyenBayTheoMaTuyenBay(String ma) {
        if (!ma.trim().equals("")) {
            ArrayList<ChuyenBay> dscb = new ArrayList<>();
            try {
                int maTuyenBay = Integer.parseInt(ma);
                for (ChuyenBay cb : listCB) {
                    if (cb.getMaTuyenBay() == maTuyenBay) {
                        dscb.add(cb);
                    }
                }
                return dscb;
            } catch (Exception e) {
            }
        }
        return null;
    }

    public ArrayList<ChuyenBay> getChuyenBayTheoMaMayBay(String ma) {
        if (!ma.trim().equals("")) {
            ArrayList<ChuyenBay> dscb = new ArrayList<>();
            try {
                int maMayBay = Integer.parseInt(ma);
                for (ChuyenBay cb : listCB) {
                    if (cb.getMaMayBay() == maMayBay) {
                        dscb.add(cb);
                    }
                }
                return dscb;
            } catch (Exception e) {
            }
        }
        return null;
    }

    // public String getAnh(String ma) {
    // int maSP = Integer.parseInt(ma);
    // return spDAO.getAnh(maSP);
    // }

    // public void capNhatSoLuongCB(int ma, int soLuongMat) {
    // cbDAO.capNhatSoLuongCB(ma, soLuongMat);
    // }

    public boolean themChuyenBay(String maTB, String maMB, String ngayCC, String ngayHC) {
        if (maTB.equals("")) {
//            new MyDialog("Vui l??ng ch???n m?? tuy???n bay!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if (maMB.equals("")) {
//            new MyDialog("Vui l??ng ch???n m?? m??y bay!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if (ngayCC.compareTo(ngayHC) > 0 || ngayCC.compareTo(ngayHC) == 0) {
//            new MyDialog("Ng??y k???t th??c kh??ng h???p l???!", MyDialog.ERROR_DIALOG);
            return false;
        }
        boolean flag = false;
        try {
            int maTuyenBay = Integer.parseInt(maTB);
            int maMayBay = Integer.parseInt(maMB);
            // L???y ra s??? l?????ng gh??? c???a m??y bay c?? m?? t????ng ???ng v?? g??n v??o s??? l?????ng v?? c??n
            // l???i.
            int soLgVeCL = mbDAO.getMayBay(maMayBay).getSoLuongGhe();
            ChuyenBay cb = new ChuyenBay();
            cb.setMaTuyenBay(maTuyenBay);
            cb.setMaMayBay(maMayBay);
            cb.setSoLgVeCL(soLgVeCL);
            cb.setNgayCatCanh(ngayCC);
            cb.setNgayHaCanh(ngayHC);

            flag = cbDAO.themChuyenBay(cb);
        } catch (Exception e) {
//            new MyDialog("Vui l??ng nh???p s??? nguy??n h???p l???!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if (flag) {
//            new MyDialog("Th??m th??nh c??ng!", MyDialog.SUCCESS_DIALOG);
            return true;
        } else {
//            new MyDialog("Th??m th???t b???i!", MyDialog.ERROR_DIALOG);
            return false;
        }
//        return flag;
    }

    public boolean nhapChuyenBayTuExcel(String maTB, String maMB, String ngayCC, String ngayHC) {
        if (maTB.equals("")) {
//            new MyDialog("Vui l??ng ch???n m?? tuy???n bay!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if (maMB.equals("")) {
//            new MyDialog("Vui l??ng ch???n m?? m??y bay!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if (ngayCC.compareTo(ngayHC) > 0 || ngayCC.compareTo(ngayHC) == 0) {
//            new MyDialog("Ng??y k???t th??c kh??ng h???p l???!", MyDialog.ERROR_DIALOG);
            return false;
        }
        boolean flag = false;
        try {
            String[] maTBTemp = maTB.split(" - ");
            String[] maMBTemp = maMB.split(" - ");
            int maTuyenBay = Integer.parseInt(maTBTemp[0]);
            int maMayBay = Integer.parseInt(maMBTemp[0]);
            // L???y ra s??? l?????ng gh??? c???a m??y bay c?? m?? t????ng ???ng v?? g??n v??o s??? l?????ng v?? c??n
            // l???i.
            int soLgVeCL = (mbDAO.getMayBay(maMayBay)).getSoLuongGhe();

            ChuyenBay cb = new ChuyenBay();
            cb.setMaTuyenBay(maTuyenBay);
            cb.setMaMayBay(maMayBay);
            cb.setSoLgVeCL(soLgVeCL);
            cb.setNgayCatCanh(ngayCC);
            cb.setNgayHaCanh(ngayHC);

            cbDAO.nhapChuyenBayTuExcel(cb);
        } catch (Exception e) {
        }
        return false;
    }

    public boolean xoaChuyenBay(String ma) {
        if (ma.trim().equals("")) {
//            new MyDialog("Ch??a ch???n chuy???n bay ????? xo??!", MyDialog.ERROR_DIALOG);
            return false;
        }

        int maSP = Integer.parseInt(ma);
        if (cbDAO.xoaChuyenBay(maSP)) {
//            new MyDialog("Xo?? th??nh c??ng!", MyDialog.SUCCESS_DIALOG);
            return true;
        }

//        new MyDialog("Xo?? th???t b???i!", MyDialog.ERROR_DIALOG);
        return false;
    }

    public boolean suaChuyenBay(String maCB, String maTB, String maMB, String ngayCC, String ngayHC) {

        try {
            if (maCB.trim().equals("")) {
//                new MyDialog("Ch??a ch???n chuy???n bay ????? s???a!", MyDialog.ERROR_DIALOG);
<<<<<<< HEAD
                System.out.print("that bai");
=======
>>>>>>> 911a8f62867e3c85baf2d4db198343614a8bbd3a
                return false;
            }
            int maChuyenBay = Integer.parseInt(maCB);
            int maTuyenBay = Integer.parseInt(maTB);
            int maMayBay = Integer.parseInt(maMB);
            // L???y ra s??? l?????ng gh??? c???a m??y bay c?? m?? t????ng ???ng v?? g??n v??o s??? l?????ng v?? c??n
            // l???i.
            int soLgVeCL = mbDAO.getMayBay(maMayBay).getSoLuongGhe();
            System.out.print(soLgVeCL);
            
            if (maTuyenBay == 0) {
//                new MyDialog("M?? tuy???n bay kh??ng ???????c ????? tr???ng!", MyDialog.ERROR_DIALOG);
                return false;
            }

            if (maMayBay == 0) {
//                new MyDialog("Vui l??ng ch???n m?? m??y bay", MyDialog.ERROR_DIALOG);
                return false;
            }

            if (ngayCC.toString().trim().equals("")) {
//                new MyDialog("Vui l??ng ch???n ng??y c???t c??nh!", MyDialog.ERROR_DIALOG);
                return false;
            }

            if (ngayCC.toString().trim().equals("")) {
//                new MyDialog("Vui l??ng ch???n ng??y h??? c??nh!", MyDialog.ERROR_DIALOG);
                return false;
            }

            if (ngayCC.compareTo(ngayHC) > 0 || ngayCC.compareTo(ngayHC) == 0) {
//                new MyDialog("Ng??y k???t th??c kh??ng h???p l???!", MyDialog.ERROR_DIALOG);
                return false;
            }

            ChuyenBay cb = new ChuyenBay();
            cb.setMaChuyenBay(maChuyenBay);
            cb.setMaTuyenBay(maTuyenBay);
            cb.setMaMayBay(maMayBay);
            cb.setSoLgVeCL(soLgVeCL);
            cb.setNgayCatCanh(ngayCC);
            cb.setNgayHaCanh(ngayHC);

            // flag = cbDAO.themChuyenBay(cb);

            if (cbDAO.suaChuyenBay(cb)) {
//                new MyDialog("S???a th??nh c??ng!", MyDialog.SUCCESS_DIALOG);
                return true;
            } else {
//                new MyDialog("S???a th???t b???i!", MyDialog.ERROR_DIALOG);
<<<<<<< HEAD

                System.out.print("Sua that bai");

=======
>>>>>>> 911a8f62867e3c85baf2d4db198343614a8bbd3a
                return false;
            }
        } catch (Exception e) {
//            new MyDialog("Nh???p s??? h???p l??? cho ????n gi?? v?? S??? l?????ng!", MyDialog.ERROR_DIALOG);
        }
        return false;
    }

    // public String getTenSP(int maSP) {
    //     for (ChuyenBay sp : listChuyenBay) {
    //         if (sp.getMaSP() == maSP) {
    //             return sp.getTenSP();
    //         }
    //     }
    //     return "";
    // }
}
