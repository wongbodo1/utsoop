/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list.buku.repo;

import list.buku.entity.Buku;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Cahyo
 */
@Repository
public interface BukuRepo 
    extends JpaRepository<Buku, String>{    
}
