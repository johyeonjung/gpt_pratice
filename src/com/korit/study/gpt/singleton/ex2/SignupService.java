package com.korit.study.gpt.singleton.ex2;

public class SignupService {
    UserRepository userRepository;
    public SignupService() {
        this.userRepository = InMemoryUserRepository.getInstance();
    }
    public void register(SignupRequest req) {
        SignupRequest signupRequest = new SignupRequest(req.getUsername(), req.getEmail(), req.getPassword());
        SignupValidator signupValidator = new SignupValidator();
        if (!signupValidator.validate(req)) {
            System.out.println("회원가입 실패");
        } else if(userRepository.existsByUsername(req.getUsername())) {
            throw new DuplicateUserException("이미 존재하는 사용자");
        } else {
            User user = new User(req.getUsername(), req.getEmail(), req.getPassword());
            userRepository.save(user);
            System.out.println("회원가입 완료");

        }
    }



}
