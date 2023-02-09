package com.hlw.reggie.dto;

import com.hlw.reggie.entity.Setmeal;
import com.hlw.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
