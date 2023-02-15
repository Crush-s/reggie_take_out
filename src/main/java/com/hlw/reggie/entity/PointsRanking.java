package com.hlw.reggie.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 球队积分排名
 *
 * @TableName points_ranking
 */
@TableName(value = "points_ranking")
public class PointsRanking implements Serializable {

    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 积分类别
     */
    private String category;

    /**
     * 积分
     */
    private String integral;

    /**
     * 进/失
     */
    private String nearLoss;

    /**
     * 胜/平/负
     */
    private String winDrawLose;

    /**
     * 球队
     */
    private String team;

    /**
     * 球队旗帜地址
     */
    private String url;

    /**
     * 顺序
     */
    private String sequence;

    /**
     * 组别
     */
    private String groups;

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
     * 积分类别
     */
    public String getCategory() {
        return category;
    }

    /**
     * 积分类别
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 积分
     */
    public String getIntegral() {
        return integral;
    }

    /**
     * 积分
     */
    public void setIntegral(String integral) {
        this.integral = integral;
    }

    /**
     * 进/失
     */
    public String getNearLoss() {
        return nearLoss;
    }

    /**
     * 进/失
     */
    public void setNearLoss(String nearLoss) {
        this.nearLoss = nearLoss;
    }

    /**
     * 胜/平/负
     */
    public String getWinDrawLose() {
        return winDrawLose;
    }

    /**
     * 胜/平/负
     */
    public void setWinDrawLose(String winDrawLose) {
        this.winDrawLose = winDrawLose;
    }

    /**
     * 球队
     */
    public String getTeam() {
        return team;
    }

    /**
     * 球队
     */
    public void setTeam(String team) {
        this.team = team;
    }

    /**
     * 球队旗帜地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 球队旗帜地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 顺序
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * 顺序
     */
    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    /**
     * 组别
     */
    public String getGroups() {
        return groups;
    }

    /**
     * 组别
     */
    public void setGroups(String groups) {
        this.groups = groups;
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
        PointsRanking other = (PointsRanking) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getCategory() == null ? other.getCategory() == null
                : this.getCategory().equals(other.getCategory()))
                && (this.getIntegral() == null ? other.getIntegral() == null
                : this.getIntegral().equals(other.getIntegral()))
                && (this.getNearLoss() == null ? other.getNearLoss() == null
                : this.getNearLoss().equals(other.getNearLoss()))
                && (this.getWinDrawLose() == null ? other.getWinDrawLose() == null
                : this.getWinDrawLose().equals(other.getWinDrawLose()))
                && (this.getTeam() == null ? other.getTeam() == null
                : this.getTeam().equals(other.getTeam()))
                && (this.getUrl() == null ? other.getUrl() == null
                : this.getUrl().equals(other.getUrl()))
                && (this.getSequence() == null ? other.getSequence() == null
                : this.getSequence().equals(other.getSequence()))
                && (this.getGroups() == null ? other.getGroups() == null
                : this.getGroups().equals(other.getGroups()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getIntegral() == null) ? 0 : getIntegral().hashCode());
        result = prime * result + ((getNearLoss() == null) ? 0 : getNearLoss().hashCode());
        result = prime * result + ((getWinDrawLose() == null) ? 0 : getWinDrawLose().hashCode());
        result = prime * result + ((getTeam() == null) ? 0 : getTeam().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getSequence() == null) ? 0 : getSequence().hashCode());
        result = prime * result + ((getGroups() == null) ? 0 : getGroups().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", category=").append(category);
        sb.append(", integral=").append(integral);
        sb.append(", nearLoss=").append(nearLoss);
        sb.append(", winDrawLose=").append(winDrawLose);
        sb.append(", team=").append(team);
        sb.append(", url=").append(url);
        sb.append(", order=").append(sequence);
        sb.append(", group=").append(groups);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
