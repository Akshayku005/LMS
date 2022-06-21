package com.bridgelabz.lms.repository;

import com.bridgelabz.lms.model.Candidate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@EnableMongoRepositories
@Repository
public interface CandidateRepository extends MongoRepository<Candidate, Long> {
//    @Query("{'status': ?0}")
    List<Candidate> findCandidateByStatus(String status);
    Long countByStatusEquals(String Status);

}