package com.jobapp.reviewms.review.messaging;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import com.jobapp.reviewms.review.Review;
import com.jobapp.reviewms.review.dto.ReviewMessage;
@Service
public class ReviewMessageProducer {

    private final RabbitTemplate rabbitTemplate;

    public ReviewMessageProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(Review review) {

        ReviewMessage reviewMessage = new ReviewMessage();
        reviewMessage.setId(review.getId());
        reviewMessage.setCompanyId(review.getCompanyId());
        reviewMessage.setTitle(review.getTitle());
        reviewMessage.setDescription(review.getDescription());
        reviewMessage.setRating(review.getRating());

        System.out.println("Sending to RabbitMQ: " + reviewMessage);

        rabbitTemplate.convertAndSend(
                "CompanyRatingQueue",
                reviewMessage
        );

        System.out.println("Message sent to CompanyRatingQueue");
    }
}

	


