/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cnpm.repository;

import com.cnpm.pojos.MatHang;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface MatHangReponsitory {
    boolean add(MatHang mh);
    boolean delete(int id);
    List<MatHang> getList(String kw);
}
