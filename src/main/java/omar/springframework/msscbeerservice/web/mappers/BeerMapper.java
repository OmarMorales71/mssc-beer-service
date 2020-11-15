package omar.springframework.msscbeerservice.web.mappers;

import omar.springframework.msscbeerservice.domain.Beer;
import omar.springframework.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
