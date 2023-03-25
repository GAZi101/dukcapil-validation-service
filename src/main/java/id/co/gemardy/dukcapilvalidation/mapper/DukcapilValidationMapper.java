package id.co.gemardy.dukcapilvalidation.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import id.co.gemardy.dukcapilvalidation.dto.request.DukcapilValidationRequest;
import id.co.gemardy.dukcapilvalidation.dto.response.DukcapilValidationResponse;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DukcapilValidationMapper {

    DukcapilValidationMapper INSTANCE = Mappers.getMapper(DukcapilValidationMapper.class);
    
    @Mapping(target = "namaLengkap",  constant  = "Sesuai (100)")
    @Mapping(target = "jenisKelamin", constant = "Sesuai")
    @Mapping(target = "tempatLahir", constant = "Sesuai (100)")
    @Mapping(target = "tanggalLahir", constant = "Sesuai")
    @Mapping(target = "statusKawin", constant = "Sesuai")
    @Mapping(target = "jenisPekerjaan", constant = "Sesuai")
    @Mapping(target = "namaLengkapIbu", constant = "Sesuai (0)")
    @Mapping(target = "alamat", constant = "Sesuai (100)")
    @Mapping(target = "noProp", constant = "Sesuai")
    @Mapping(target = "noKab", constant = "Sesuai")
    @Mapping(target = "noKec", constant = "Sesuai")
    @Mapping(target = "noKel", constant = "Sesuai")
    @Mapping(target = "propName", constant = "Sesuai")
    @Mapping(target = "kabName", constant = "Sesuai")
    @Mapping(target = "kecName", constant = "Sesuai")
    @Mapping(target = "kelName", constant = "Sesuai")
    @Mapping(target = "noRW", constant = "Sesuai")
    @Mapping(target = "noRT", constant = "Sesuai")
    DukcapilValidationResponse requestConvertToResponse(DukcapilValidationRequest request);
}
