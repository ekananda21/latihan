package id.allianz.coding.memberCoding.service.impl;

import id.allianz.coding.memberCoding.entity.MemberCodingClass;
import id.allianz.coding.memberCoding.repository.MemberCodingClassRepo;
import id.allianz.coding.memberCoding.service.MemberCodingClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberCodingClassServiceImpl implements MemberCodingClassService {

    @Autowired
    private MemberCodingClassRepo repo;

    @Override
    public void insertMember(MemberCodingClass entity) {
        this.repo.save(entity);
    }
}
