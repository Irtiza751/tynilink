package app.mirtiza.linkservice.services;

import app.mirtiza.linkservice.dtos.CreateLinkDto;
import app.mirtiza.linkservice.models.Link;
import app.mirtiza.linkservice.repositories.LinkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LinkService {
    private final LinkRepository linkRepository;

    public Link createLink(CreateLinkDto createLinkDto) {
        /* *
         * @TODO generate short url and validate the user id does exist through user service.
         * */
        Link link = Link.builder()
                .originalUrl(createLinkDto.originalUrl())
                .shortUrl(createLinkDto.shortUrl())
                .userId(createLinkDto.userId())
                .build();

        return linkRepository.save(link);
    }
}
