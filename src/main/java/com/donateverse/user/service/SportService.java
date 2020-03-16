package com.donateverse.user.service;

import com.donateverse.user.dto.SportResponse;
import com.donateverse.user.entity.SportEntity;
import com.donateverse.user.repository.SportRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author flaoliveira
 * @version : $<br/>
 * : $
 * @since 20/10/2019 22:46
 */
@Service
public class SportService {

    private SportRepository sportRepository;

    public SportService(SportRepository sportRepository) {
        this.sportRepository = sportRepository;
    }


    public List<SportResponse> findAll() {
        return sportRepository.findAll().stream()
                .map(sportEntity -> convertToSportResponse(sportEntity))
                .collect(Collectors.toList());
    }

    private SportResponse convertToSportResponse(final SportEntity sportEntity) {
        final SportResponse sportResponse = new SportResponse();
        BeanUtils.copyProperties(sportEntity, sportResponse);
        return sportResponse;
    }

}
