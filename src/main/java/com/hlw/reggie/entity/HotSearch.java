package com.hlw.reggie.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 热搜信息
 * @TableName hot_search
 */
@TableName(value ="hot_search")
public class HotSearch implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 热搜标题
     */
    private String header;

    /**
     * 热搜地址
     */
    private String url;

    /**
     * 状态
     */
    private Integer state;

    /**
     * 时间
     */
    private Date date;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    public Long getId() {
        return id;
    }

    /**
     * id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 热搜标题
     */
    public String getHeader() {
        return header;
    }

    /**
     * 热搜标题
     */
    public void setHeader(String header) {
        this.header = header;
    }

    /**
     * 热搜地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 热搜地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 状态
     */
    public Integer getState() {
        return state;
    }

    /**
     * 状态
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 时间
     */
    public Date getDate() {
        return date;
    }

    /**
     * 时间
     */
    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        HotSearch other = (HotSearch) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHeader() == null ? other.getHeader() == null : this.getHeader().equals(other.getHeader()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHeader() == null) ? 0 : getHeader().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", table=").append(header);
        sb.append(", url=").append(url);
        sb.append(", state=").append(state);
        sb.append(", date=").append(date);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
