/**
 * This interface tells SpringBoot we want it to create a repository to handle Survey
 * transactions. We extend PagingAndSortingRepository to provide convenient methods such as findall. Thanks to Spring
 * Boot, all the actual code is generated for us. We just need to tell it which Entity class it is managing.
 */
package com.jmd.swe645.assignment1.database;

import com.jmd.swe645.assignment1.models.Survey;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface SurveysRepository extends PagingAndSortingRepository<Survey, Long> {

}
