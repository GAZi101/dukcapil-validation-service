package id.co.gemardy.dukcapilvalidation.mapper;

import id.co.gemardy.dukcapilvalidation.dto.request.DukcapilValidationRequest;
import id.co.gemardy.dukcapilvalidation.dto.response.DukcapilValidationResponse;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-25T18:24:27+0700",
    comments = "version: 1.5.0.RC1, compiler: javac, environment: Java 18 (Oracle Corporation)"
)
public class DukcapilValidationMapperImpl implements DukcapilValidationMapper {

    @Override
    public DukcapilValidationResponse requestConvertToResponse(DukcapilValidationRequest request) {
        if ( request == null ) {
            return null;
        }

        DukcapilValidationResponse.DukcapilValidationResponseBuilder dukcapilValidationResponse = DukcapilValidationResponse.builder();

        dukcapilValidationResponse.nik( request.getNik() );

        dukcapilValidationResponse.namaLengkap( "Sesuai (100)" );
        dukcapilValidationResponse.jenisKelamin( "Sesuai" );
        dukcapilValidationResponse.tempatLahir( "Sesuai (100)" );
        dukcapilValidationResponse.tanggalLahir( "Sesuai" );
        dukcapilValidationResponse.statusKawin( "Sesuai" );
        dukcapilValidationResponse.jenisPekerjaan( "Sesuai" );
        dukcapilValidationResponse.namaLengkapIbu( "Sesuai (0)" );
        dukcapilValidationResponse.alamat( "Sesuai (100)" );
        dukcapilValidationResponse.noProp( "Sesuai" );
        dukcapilValidationResponse.noKab( "Sesuai" );
        dukcapilValidationResponse.noKec( "Sesuai" );
        dukcapilValidationResponse.noKel( "Sesuai" );
        dukcapilValidationResponse.propName( "Sesuai" );
        dukcapilValidationResponse.kabName( "Sesuai" );
        dukcapilValidationResponse.kecName( "Sesuai" );
        dukcapilValidationResponse.kelName( "Sesuai" );
        dukcapilValidationResponse.noRW( "Sesuai" );
        dukcapilValidationResponse.noRT( "Sesuai" );

        return dukcapilValidationResponse.build();
    }
}
