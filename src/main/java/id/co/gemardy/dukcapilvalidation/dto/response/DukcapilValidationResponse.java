package id.co.gemardy.dukcapilvalidation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DukcapilValidationResponse {
    
    private String nik;
    private String namaLengkap;
    private String jenisKelamin;
    private String tempatLahir;
    private String tanggalLahir;
    private String statusKawin;
    private String jenisPekerjaan;
    private String namaLengkapIbu;
    private String alamat;
    private String noProp;
    private String noKab;
    private String noKec;
    private String noKel;
    private String propName;
    private String kabName;
    private String kecName;
    private String kelName;
    private String noRW;
    private String noRT;
}
