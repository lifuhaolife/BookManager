package xust.lfh.book_permission.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * @Description:
 * @author: LFH
 * @date: 2020/3/31  10:05
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
public class User {

    ////指定的类的属性，用于识别（一个表中的主键）。
    //指定如何标识属性可以被初始化，例如自动、手动、或从序列表中获得的值。
    //指定持久属性栏属性。
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    private String username;

    private String password;

    private String salt;

    private String name;

    private String phone;

    private String email;

    //user status
    private boolean enabled;

    /**
     * Transient property for storing role owned by current user.
     */
    @Transient
    private List<AdminRole> roles;

    // 默认构造函数
    public User() {}

    // 用于配合自定义查询的构造函数
    public User(int id,String username, String name, String phone, String email, boolean enabled) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.enabled = enabled;
    }
}
