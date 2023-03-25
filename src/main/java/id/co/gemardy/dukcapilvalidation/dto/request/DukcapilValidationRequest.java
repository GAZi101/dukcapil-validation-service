package id.co.gemardy.dukcapilvalidation.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DukcapilValidationRequest {
    
    private String tempatLahir;
    private String namaLengkap;
    private String nik;
    private String tanggalLahir;
}
