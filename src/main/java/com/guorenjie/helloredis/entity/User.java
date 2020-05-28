package com.guorenjie.helloredis.entity;


import lombok.Data;

import java.io.Serializable;

/**
 * @author guorenjie
 */
@Data
public class User implements Serializable {

  private String id;
  private String name;
  private long age;
  private String email;

}
