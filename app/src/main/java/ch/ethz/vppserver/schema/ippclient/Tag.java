package ch.ethz.vppserver.schema.ippclient;

/**
 * Copyright (C) 2008 ITS of ETH Zurich, Switzerland, Sarah Windler Burri
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 3 of the License, or (at your option) any
 * later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.
 * 
 * See the GNU Lesser General Public License for more details. You should have
 * received a copy of the GNU Lesser General Public License along with this
 * program; if not, see <http://www.gnu.org/licenses/>.
 */

/*Notice
 * This file has been modified. It is not the original. 
 * XML parsing annotations, etc. have been removed Jon Freeman - 2013 */

public class Tag {

  protected String value;
  protected String name;
  protected String description;
  protected Short max;

  
  public Tag(String value, String name){
      this.value = value;
      this.name = name;
  }

  public Tag(String value, String name, String description){
      this.value = value;
      this.name = name;
      this.description = description;
  }
  public Tag(String value, String name, String description, String max){
      this.value = value;
      this.name = name;
      this.description = description;
      this.max = Short.parseShort(max);
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public void setName(String value) {
    this.name = value;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String value) {
    this.description = value;
  }

  public Short getMax() {
    return max;
  }

  public void setMax(Short value) {
    this.max = value;
  }

}
