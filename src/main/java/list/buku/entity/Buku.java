/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list.buku.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


/**
 *
 * @author Cahyo
 */
@Entity
public class Buku {

    /**
     *
     */
    @Id
    @Getter @Setter
    public String id;
    @Getter @Setter
    public String nama;
    @Getter @Setter
    public String judul_buku;    
    
    
}
