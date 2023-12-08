package kr.co.calejoin.mapper.Category;


import kr.co.calejoin.dto.CategoryDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface CategoryMapper {


    public List<CategoryDTO> selectCategory(String uid);

}
