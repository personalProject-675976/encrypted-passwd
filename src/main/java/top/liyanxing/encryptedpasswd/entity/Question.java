package top.liyanxing.encryptedpasswd.entity;

import lombok.Data;

@Data
public class Question
{
    /**
     * 在初中时因为一句话被起的绰号是什么？
     */
    private String nickname;

    /**
     * 小名是什么？
     */
    private String petName;

    /**
     * 张至什么?
     */
    private String peopleName;
}