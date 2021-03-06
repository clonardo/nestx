/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.CreatePhotoDto;
import org.openapitools.model.EditPhotoDto;
import org.openapitools.model.KeyValue;
import org.openapitools.model.Photo;
import org.openapitools.model.PhotoRes;
import org.openapitools.model.ResultListPhotoRes;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-04-22T03:09:30.309Z[GMT]")

@Validated
@Api(value = "photo", description = "the photo API")
public interface PhotoApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "", nickname = "photoCreate", notes = "", response = PhotoRes.class, tags={ "cms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = PhotoRes.class) })
    @RequestMapping(value = "/photo/",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<PhotoRes> photoCreate(@ApiParam(value = "" ,required=true )  @Valid @RequestBody CreatePhotoDto entry) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"ext\" : \"ext\",  \"name\" : \"name\",  \"caption\" : \"caption\",  \"description\" : \"description\",  \"id\" : \"id\",  \"uri\" : \"uri\",  \"url\" : \"url\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "photoFindOne", notes = "", response = Photo.class, tags={ "cms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = Photo.class) })
    @RequestMapping(value = "/photo/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Photo> photoFindOne(@ApiParam(value = "",required=true) @PathVariable("id") String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"ext\" : \"{}\",  \"name\" : \"name\",  \"caption\" : \"caption\",  \"description\" : \"description\",  \"id\" : \"id\",  \"uri\" : \"uri\",  \"url\" : \"url\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "photoQuery", notes = "", response = ResultListPhotoRes.class, tags={ "cms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = ResultListPhotoRes.class) })
    @RequestMapping(value = "/photo/query",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<ResultListPhotoRes> photoQuery(@ApiParam(value = "") @Valid @RequestParam(value = "keyword", required = false) String keyword,@ApiParam(value = "", defaultValue = "1.0d") @Valid @RequestParam(value = "page", required = false, defaultValue="1.0d") Double page,@ApiParam(value = "", defaultValue = "10.0d") @Valid @RequestParam(value = "size", required = false, defaultValue="10.0d") Double size,@ApiParam(value = "") @Valid @RequestParam(value = "sort", required = false) String sort) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"query\" : {    \"size\" : 6.027456183070403,    \"page\" : 1.4658129805029452  },  \"count\" : 0.8008281904610115,  \"list\" : [ {    \"ext\" : \"ext\",    \"name\" : \"name\",    \"caption\" : \"caption\",    \"description\" : \"description\",    \"id\" : \"id\",    \"uri\" : \"uri\",    \"url\" : \"url\"  }, {    \"ext\" : \"ext\",    \"name\" : \"name\",    \"caption\" : \"caption\",    \"description\" : \"description\",    \"id\" : \"id\",    \"uri\" : \"uri\",    \"url\" : \"url\"  } ]}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "photoRemove", notes = "", response = Boolean.class, tags={ "cms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = Boolean.class) })
    @RequestMapping(value = "/photo/{id}",
        produces = { "text/html" }, 
        method = RequestMethod.DELETE)
    default ResponseEntity<Boolean> photoRemove(@ApiParam(value = "",required=true) @PathVariable("id") String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "photoSearch", notes = "", response = KeyValue.class, responseContainer = "List", tags={ "cms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = KeyValue.class, responseContainer = "List") })
    @RequestMapping(value = "/photo/search",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<KeyValue>> photoSearch(@ApiParam(value = "") @Valid @RequestParam(value = "keyword", required = false) String keyword,@ApiParam(value = "") @Valid @RequestParam(value = "value", required = false) String value) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"label\" : \"label\",  \"value\" : \"value\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "photoUpdate", notes = "", response = PhotoRes.class, tags={ "cms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = PhotoRes.class) })
    @RequestMapping(value = "/photo/",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<PhotoRes> photoUpdate(@ApiParam(value = "" ,required=true )  @Valid @RequestBody EditPhotoDto entry) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"ext\" : \"ext\",  \"name\" : \"name\",  \"caption\" : \"caption\",  \"description\" : \"description\",  \"id\" : \"id\",  \"uri\" : \"uri\",  \"url\" : \"url\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
