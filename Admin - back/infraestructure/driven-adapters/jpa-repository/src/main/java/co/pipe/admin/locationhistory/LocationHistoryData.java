package co.pipe.admin.locationhistory;


import co.pipe.admin.country.CountryData;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "location_history")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LocationHistoryData {

    @Id
    private Long id;
    private String reason;
//    private CountryData idCountry;


}
