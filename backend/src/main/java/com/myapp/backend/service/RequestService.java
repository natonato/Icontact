package com.myapp.backend.service;


import com.myapp.backend.domain.dto.request.DosageResultDto;
import com.myapp.backend.domain.dto.request.RequestDto;
import com.myapp.backend.domain.dto.request.RequestParamDto;
import com.myapp.backend.domain.dto.request.ReturnhomeResultDto;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface RequestService {

    public int dosageInsert(RequestDto requestDto);

    public int returnhomeInsert(RequestDto requestDto);

    public int dosageUpdate(RequestDto requestDto);

    public int returnhomeUpdate(RequestDto requestDto);

    @Transactional
    public int dosageDelete(int id);

    @Transactional
    public int returnhomeDelete(int id);

    public List<DosageResultDto> teacherDosageList(RequestParamDto requestParamDto);

    public List<ReturnhomeResultDto> teacherReturnhomeList(RequestParamDto requestParamDto);

    public List<DosageResultDto> parentDosageList(RequestParamDto requestParamDto);

    public List<ReturnhomeResultDto> parentReturnhomeList(RequestParamDto requestParamDto);

    public DosageResultDto dosageDetail(int id);

    public ReturnhomeResultDto returnhomeDetail(int id);

    public int totalTeacherDosageList(String userId);

    public int totalTeacherReturnhomeList(String userId);

    public int totalParentDosageList(String userId);

    public int totalParentReturnhomeList(String userId);
}
