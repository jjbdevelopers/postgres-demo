/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home.postgresdemo.repository;

import com.home.postgresdemo.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Julian D Osorio G
 */
public interface QuestionRepository extends JpaRepository<Question, Long> {
    
}
