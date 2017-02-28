package com.sgs.vision.storage.repository;

import com.sgs.vision.common.dto.GameDto;

public interface GameRepositoryCustom {
    GameDto findById(String id);
}
