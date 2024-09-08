package com.lvo.online_learning_platform.service;

import com.lvo.online_learning_platform.model.Quiz;
import com.lvo.online_learning_platform.repository.QuizRepository;
import org.springframework.stereotype.Service;

@Service
public class QuizServiceImpl implements QuizService {

    private final QuizRepository quizRepository;

    public QuizServiceImpl(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    @Override
    public Quiz createQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }
}