package com.example.ctapi.dtos.Response;

import com.example.ctapi.dtos.bussinessLogic.CreateRandomID;
import com.example.ctapi.dtos.bussinessLogic.HandleDate;
import com.example.ctcommon.enums.StatusSupplier;
import com.example.ctcommon.enums.TypeOptionProduct;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
public class SupplierDto {
    private String id;
    private String code;
    private String name;
    private String phone;
    private String address;
    @Enumerated(EnumType.STRING)
    private StatusSupplier status;
    private LocalDateTime dateCreate;
    private LocalDateTime dateUpdate;

    public SupplierDto(){
        this.id = CreateRandomID.generatingUID();
        this.code= CreateRandomID.generateRandomCode();
        this.dateCreate = HandleDate.getDatetimeNowFromSystem();
    }
}
