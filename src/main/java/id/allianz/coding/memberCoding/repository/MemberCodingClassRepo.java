package id.allianz.coding.memberCoding.repository;

import id.allianz.coding.memberCoding.entity.MemberCodingClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

public interface MemberCodingClassRepo extends JpaRepository<MemberCodingClass, Integer> {

}
