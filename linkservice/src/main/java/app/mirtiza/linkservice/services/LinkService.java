package app.mirtiza.linkservice.services;

import app.mirtiza.linkservice.client.UserServiceClient;
import app.mirtiza.linkservice.dtos.CreateLinkDto;
import app.mirtiza.linkservice.models.Link;
import app.mirtiza.linkservice.repositories.LinkRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class LinkService {
    private final LinkRepository linkRepository;
    private final UserServiceClient userServiceClient;

    @Transactional
    public Link createLink(CreateLinkDto createLinkDto) {
        /* *
         * @TODO generate short url and validate the user id does exist through user service.
         * */
        Object validUserId = userServiceClient.isValidUserId(createLinkDto.userId());
        log.debug(validUserId.toString(), "is valid user");
        String shortUrl = "hi iam short";

        Link link = Link.builder()
                .originalUrl(createLinkDto.originalUrl())
                .shortUrl(shortUrl)
                .userId(createLinkDto.userId())
                .build();

        return linkRepository.save(link);
    }
}
