package net.lianpingkeji.szzj.persistence;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class City implements Serializable {
    private String name;

    private Long id;

    private String cityName;

}
