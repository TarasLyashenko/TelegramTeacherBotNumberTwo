package com.example.TelegramTeacherBotNumberTwo.dao;

import com.example.TelegramTeacherBotNumberTwo.entity.Lesson;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonDao extends CrudRepository<Lesson, Long>
{
    Lesson findByTopic(String topic);
    Lesson findByNumberHours(int numberHours);
}
