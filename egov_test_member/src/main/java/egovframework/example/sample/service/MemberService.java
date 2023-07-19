package egovframework.example.sample.service;

public interface MemberService {
    int loginOk(MemberVO vo) throws Exception;
    void register(MemberVO vo) throws Exception;
}
