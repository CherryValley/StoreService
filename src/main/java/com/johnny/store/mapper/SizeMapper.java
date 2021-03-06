package com.johnny.store.mapper;

import com.johnny.store.entity.SizeEntity;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface SizeMapper {
    int searchTotalCount();

    List<SizeEntity> searchList(int startIndex, int pageSize);

    List<SizeEntity> searchList4Item(int itemID, int seriesID, int colorID);

    SizeEntity search(int sizeID);

    SizeEntity searchByName(String sizeName);

    int insert(SizeEntity entity);

    int update(SizeEntity entity);

    int delete(int sizeID);
}
