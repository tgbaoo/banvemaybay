/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanVeMayBay.BUS;

import QuanLyBanVeMayBay.DAO.VeKHDAO;
import QuanLyBanVeMayBay.DTO.VeKH;
import QuanLyBanVeMayBay.DAO.VeDAO;
import QuanLyBanVeMayBay.DTO.Ve;
// import QuanLyBanVeMayBay.DAO.ChuyenBayDAO;
// import QuanLyBanVeMayBay.DTO.ChuyenBay;
//import Template.Dialog;
import java.util.ArrayList;

/**
 *
 * @author Thepi314
 */
public class VeKHBUS {
    private ArrayList<VeKH> listVeKH = null;
    private VeKHDAO veKHDAO = new VeKHDAO();

    public VeKHBUS() {
        docListVeKH();
    }

    public void docListVeKH() {
        listVeKH = veKHDAO.getListVeKH();
    }

    public ArrayList<VeKH> getListVeKH() {
        if (listVeKH == null) {
            docListVeKH();
        }
        return listVeKH;
    }

    public VeKH getVeKH(String ma) {
        if (!ma.trim().equals("")) {
            try {
                int maVeKH = Integer.parseInt(ma);
                for (VeKH veKH : listVeKH) {
                    if (veKH.getMaVeKH() == maVeKH) {
                        return veKH;
                    }
                }
            } catch (Exception e) {
            }
        }
        return null;
    }

    public ArrayList<VeKH> getVeKHTheoMaVe(String ma) {
        if (!ma.trim().equals("")) {
            ArrayList<VeKH> dsvkh = new ArrayList<>();
            try {
                int maVe = Integer.parseInt(ma);
                for (VeKH veKH : listVeKH) {
                    if (veKH.getMaVe() == maVe) {
                        dsvkh.add(veKH);
                    }
                }
                return dsvkh;
            } catch (Exception e) {
            }
        }
        return null;
    }

    public ArrayList<VeKH> getVeKHTheoKhachHang(String ma) {
        if (!ma.trim().equals("")) {
            ArrayList<VeKH> dsvkh = new ArrayList<>();
            try {
                int maKH = Integer.parseInt(ma);
                for (VeKH veKH : listVeKH) {
                    if (veKH.getMaKH() == maKH) {
                        dsvkh.add(veKH);
                    }
                }
                return dsvkh;
            } catch (Exception e) {
            }
        }
        return null;
    }

    public boolean themVeKH(String maVe, String maKH) {
        if (maVe.equals("")) {
            //new Dialog("Vui l??ng ch???n m?? v??!", Dialog.ERROR_DIALOG);
            return false;
        }
        if (maKH.equals("")) {
            //new Dialog("Vui l??ng ch???n m?? kh??ch h??ng!", Dialog.ERROR_DIALOG);
            return false;
        }

        boolean flag = false;
        try {
            // String[] maTBTemp = maCB.split(" - ");
            // String[] maMBTemp = maLV.split(" - ");
            // int maTuyenBay = Integer.parseInt(maTBTemp[0]);
            // int maMayBay = Integer.parseInt(maMBTemp[0]);
            // L???y ra s??? l?????ng gh??? c???a m??y bay c?? m?? t????ng ???ng v?? g??n v??o s??? l?????ng v?? c??n
            // l???i.
            // int soLgVeKHCL = Integer.parseInt(getMayBay(maMayBay).getSoLgGhe());

            VeKH veKH = new VeKH();
            veKH.setMaVe(Integer.parseInt(maVe));
            veKH.setMaKH(Integer.parseInt(maKH));

            flag = veKHDAO.themVeKH(veKH);
        } catch (Exception e) {
        }
        if (flag) {
            //new Dialog("Th??m th??nh c??ng!", Dialog.SUCCESS_DIALOG);
            System.out.print("Thanh cong");
        } else {
            //new Dialog("Th??m th???t b???i!", Dialog.ERROR_DIALOG);
            return false;
        }
        return flag;
    }

    // public boolean sinhVeKHTuDong (String maCB) {
    //     if (!maCB.trim().equals("")) {
    //         try {
    //             int maChuyenBay = Integer.parseInt(maCB);
    //             for (VeKH veKH : listVeKH) {
    //                 if (veKH.getMaChuyenBay() == maChuyenBay) {
    //                     ChuyenBayBUS cbBUS;
    //                     ChuyenBay cb;
    //                     MayBayBUS mbBUS;
    //                     MayBay mb;
    //                     int tongVeKH;
    //                     int soGheTemp = 1;
    //                     String[] loaiTemp = {"A", "B", "C", "D"};
    //                     cb = cbBUS.getChuyenBay(Integer.toString(veKH.getMaChuyenBay()));
    //                     mb = mbBUS.getMayBay(Integer.toString().(cb.getMaMayBay()));
    //                     String gioBay = cb.getGioCatCanh
    //                     int tongVeKH = mb.getSoLgGhe();
    //                     for(int i = 0; i < tongVeKH; i++) {
    //                         listVeKH.add(themVeKH(maChuyenBay, Integer.toString(soGheTemp), loaiTemp + Integer.toString(i)));
    //                     }
    //                 }
    //             }
    //             return dsv;
    //         } catch (Exception e) {
    //         }
    //     }
    // }

    public boolean nhapVeKHTuExcel(String maVe, String maKH) {
        if (maVe.equals("")) {
            //new Dialog("Vui l??ng ch???n m?? v??!", Dialog.ERROR_DIALOG);
            return false;
        }
        if (maKH.equals("")) {
            //new Dialog("Vui l??ng ch???n m?? kh??ch h??ng!", Dialog.ERROR_DIALOG);
            return false;
        }
        boolean flag = false;
        try {

            VeKH veKH = new VeKH();
            veKH.setMaVe(Integer.parseInt(maVe));
            veKH.setMaKH(Integer.parseInt(maKH));

            flag = veKHDAO.nhapVeKHTuExcel(veKH);
        } catch (Exception e) {
        }
        if (flag) {
            //new Dialog("Th??m th??nh c??ng!", Dialog.SUCCESS_DIALOG);
            System.out.print("Thanh cong");
        } else {
            //new Dialog("Th??m th???t b???i!", Dialog.ERROR_DIALOG);
            return false;
        }
        return flag;
    }

    public boolean xoaVeKH(String ma) {
        if (ma.trim().equals("")) {
            //new Dialog("Ch??a ch???n m?? v?? kh??ch h??ng ????? xo??!", Dialog.ERROR_DIALOG);
            return false;
        }

        int maVeKH = Integer.parseInt(ma);
        if (veKHDAO.xoaVeKH(maVeKH)) {
            //new Dialog("Xo?? th??nh c??ng!", Dialog.SUCCESS_DIALOG);
            return true;
        }
        
        //new Dialog("Xo?? th???t b???i!", Dialog.ERROR_DIALOG);
        return false;
    }

    public boolean suaVeKH(String maVeKH, String maVe, String maKH) {

        try {
            if (maVeKH.trim().equals("")) {
                //new Dialog("Ch??a ch???n v?? kh??ch h??ng ????? s???a!", Dialog.ERROR_DIALOG);
                return false;
            }
            if (maVe.trim().equals("")) {
                //new Dialog("M?? v?? kh??ng ???????c ????? tr???ng!", Dialog.ERROR_DIALOG);
                return false;
            }

            if (maKH.trim().equals("")) {
                //new Dialog("Vui l??ng ch???n m?? kh??ch h??ng!", Dialog.ERROR_DIALOG);
                return false;
            }

            VeKH veKH = new VeKH();
            veKH.setMaVeKH(Integer.parseInt(maVeKH));
            veKH.setMaVe(Integer.parseInt(maVe));
            veKH.setMaKH(Integer.parseInt(maKH));

            // flag = cbDAO.themVeKH(cb);

            if (veKHDAO.suaVeKH(veKH)) {
                //new Dialog("S???a th??nh c??ng!", Dialog.SUCCESS_DIALOG);
                return true;
            } else {
                //new Dialog("S???a th???t b???i!", Dialog.ERROR_DIALOG);
                return false;
            }
        } catch (Exception e) {
            //new Dialog("Nh???p chu???i h???p l??? cho c??c m??!", Dialog.ERROR_DIALOG);
        }
        return false;
    }
}
