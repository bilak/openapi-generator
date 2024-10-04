/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.10.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import springfox.documentation.annotations.ApiIgnore;
import org.openapitools.model.ModelApiResponse;
import org.springframework.data.domain.Pageable;
import org.openapitools.model.Pet;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0-SNAPSHOT")
@Validated
@Api(value = "pet", description = "Everything about your Pets")
public interface PetApi {

    default PetApiDelegate getDelegate() {
        return new PetApiDelegate() {};
    }

    public static final String PATH_ADD_PET = "/pet";
    /**
     * POST /pet : Add a new pet to the store
     *
     * @param body Pet object that needs to be added to the store (required)
     * @return successful operation (status code 200)
     *         or Invalid input (status code 405)
     */
    @ApiOperation(
        tags = { "pet" },
        value = "Add a new pet to the store",
        nickname = "addPet",
        notes = "",
        authorizations = {
            @Authorization(value = "petstore_auth", scopes = {
                @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
                @AuthorizationScope(scope = "read:pets", description = "read your pets")
            })
         }
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "successful operation"),
        @ApiResponse(code = 405, message = "Invalid input")
    })
    @RequestMapping(
        method = RequestMethod.POST,
        value = PetApi.PATH_ADD_PET,
        consumes = { "application/json", "application/xml" }
    )
    
    default ResponseEntity<Void> addPet(
        @ApiParam(value = "Pet object that needs to be added to the store", required = true) @Valid @RequestBody Pet body
    ) {
        return getDelegate().addPet(body);
    }


    public static final String PATH_DELETE_PET = "/pet/{petId}";
    /**
     * DELETE /pet/{petId} : Deletes a pet
     *
     * @param petId Pet id to delete (required)
     * @param apiKey  (optional)
     * @return successful operation (status code 200)
     *         or Invalid pet value (status code 400)
     */
    @ApiOperation(
        tags = { "pet" },
        value = "Deletes a pet",
        nickname = "deletePet",
        notes = "",
        authorizations = {
            @Authorization(value = "petstore_auth", scopes = {
                @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
                @AuthorizationScope(scope = "read:pets", description = "read your pets")
            })
         }
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "successful operation"),
        @ApiResponse(code = 400, message = "Invalid pet value")
    })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = PetApi.PATH_DELETE_PET
    )
    
    default ResponseEntity<Void> deletePet(
        @ApiParam(value = "Pet id to delete", required = true) @PathVariable("petId") Long petId,
        @ApiParam(value = "") @RequestHeader(value = "api_key", required = false) String apiKey
    ) {
        return getDelegate().deletePet(petId, apiKey);
    }


    public static final String PATH_FIND_PETS_BY_STATUS = "/pet/findByStatus";
    /**
     * GET /pet/findByStatus : Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     *
     * @param status Status values that need to be considered for filter (required)
     * @return successful operation (status code 200)
     *         or Invalid status value (status code 400)
     */
    @ApiOperation(
        tags = { "pet" },
        value = "Finds Pets by status",
        nickname = "findPetsByStatus",
        notes = "Multiple status values can be provided with comma separated strings",
        response = Pet.class,
        responseContainer = "List",
        authorizations = {
            @Authorization(value = "petstore_auth", scopes = {
                @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
                @AuthorizationScope(scope = "read:pets", description = "read your pets")
            })
         }
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "successful operation", response = Pet.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid status value")
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = PetApi.PATH_FIND_PETS_BY_STATUS,
        produces = { "application/xml", "application/json" }
    )
    
    default ResponseEntity<List<Pet>> findPetsByStatus(
        @NotNull @ApiParam(value = "Status values that need to be considered for filter", required = true, allowableValues = "available, pending, sold") @Valid @RequestParam(value = "status", required = true) List<String> status,
        @ApiIgnore final Pageable pageable
    ) {
        return getDelegate().findPetsByStatus(status, pageable);
    }


    public static final String PATH_FIND_PETS_BY_TAGS = "/pet/findByTags";
    /**
     * GET /pet/findByTags : Finds Pets by tags
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     *
     * @param tags Tags to filter by (required)
     * @return successful operation (status code 200)
     *         or Invalid tag value (status code 400)
     * @deprecated
     */
    @Deprecated
    @ApiOperation(
        tags = { "pet" },
        value = "Finds Pets by tags",
        nickname = "findPetsByTags",
        notes = "Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.",
        response = Pet.class,
        responseContainer = "List",
        authorizations = {
            @Authorization(value = "petstore_auth", scopes = {
                @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
                @AuthorizationScope(scope = "read:pets", description = "read your pets")
            })
         }
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "successful operation", response = Pet.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid tag value")
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = PetApi.PATH_FIND_PETS_BY_TAGS,
        produces = { "application/xml", "application/json" }
    )
    
    default ResponseEntity<List<Pet>> findPetsByTags(
        @NotNull @ApiParam(value = "Tags to filter by", required = true) @Valid @RequestParam(value = "tags", required = true) List<String> tags,
        @ApiIgnore final Pageable pageable
    ) {
        return getDelegate().findPetsByTags(tags, pageable);
    }


    public static final String PATH_GET_PET_BY_ID = "/pet/{petId}";
    /**
     * GET /pet/{petId} : Find pet by ID
     * Returns a single pet
     *
     * @param petId ID of pet to return (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Pet not found (status code 404)
     */
    @ApiOperation(
        tags = { "pet" },
        value = "Find pet by ID",
        nickname = "getPetById",
        notes = "Returns a single pet",
        response = Pet.class,
        authorizations = {
            @Authorization(value = "api_key")
         }
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "successful operation", response = Pet.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Pet not found")
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = PetApi.PATH_GET_PET_BY_ID,
        produces = { "application/xml", "application/json" }
    )
    
    default ResponseEntity<Pet> getPetById(
        @ApiParam(value = "ID of pet to return", required = true) @PathVariable("petId") Long petId
    ) {
        return getDelegate().getPetById(petId);
    }


    public static final String PATH_LIST_ALL_PETS = "/pet/all";
    /**
     * GET /pet/all : List all pets
     *
     * @return successful operation (status code 200)
     *         or Invalid status value (status code 400)
     */
    @ApiOperation(
        tags = { "pet" },
        value = "List all pets",
        nickname = "listAllPets",
        notes = "",
        response = Pet.class,
        responseContainer = "List",
        authorizations = {
            @Authorization(value = "petstore_auth", scopes = {
                @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
                @AuthorizationScope(scope = "read:pets", description = "read your pets")
            })
         }
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "successful operation", response = Pet.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid status value")
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = PetApi.PATH_LIST_ALL_PETS,
        produces = { "application/xml", "application/json" }
    )
    
    default ResponseEntity<List<Pet>> listAllPets(
        @ApiIgnore final Pageable pageable
    ) {
        return getDelegate().listAllPets(pageable);
    }


    public static final String PATH_UPDATE_PET = "/pet";
    /**
     * PUT /pet : Update an existing pet
     *
     * @param body Pet object that needs to be added to the store (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Pet not found (status code 404)
     *         or Validation exception (status code 405)
     */
    @ApiOperation(
        tags = { "pet" },
        value = "Update an existing pet",
        nickname = "updatePet",
        notes = "",
        authorizations = {
            @Authorization(value = "petstore_auth", scopes = {
                @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
                @AuthorizationScope(scope = "read:pets", description = "read your pets")
            })
         }
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "successful operation"),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Pet not found"),
        @ApiResponse(code = 405, message = "Validation exception")
    })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = PetApi.PATH_UPDATE_PET,
        consumes = { "application/json", "application/xml" }
    )
    
    default ResponseEntity<Void> updatePet(
        @ApiParam(value = "Pet object that needs to be added to the store", required = true) @Valid @RequestBody Pet body
    ) {
        return getDelegate().updatePet(body);
    }


    public static final String PATH_UPDATE_PET_WITH_FORM = "/pet/{petId}";
    /**
     * POST /pet/{petId} : Updates a pet in the store with form data
     *
     * @param petId ID of pet that needs to be updated (required)
     * @param name Updated name of the pet (optional)
     * @param status Updated status of the pet (optional)
     * @return Invalid input (status code 405)
     */
    @ApiOperation(
        tags = { "pet" },
        value = "Updates a pet in the store with form data",
        nickname = "updatePetWithForm",
        notes = "",
        authorizations = {
            @Authorization(value = "petstore_auth", scopes = {
                @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
                @AuthorizationScope(scope = "read:pets", description = "read your pets")
            })
         }
    )
    @ApiResponses({
        @ApiResponse(code = 405, message = "Invalid input")
    })
    @RequestMapping(
        method = RequestMethod.POST,
        value = PetApi.PATH_UPDATE_PET_WITH_FORM,
        consumes = { "application/x-www-form-urlencoded" }
    )
    
    default ResponseEntity<Void> updatePetWithForm(
        @ApiParam(value = "ID of pet that needs to be updated", required = true) @PathVariable("petId") Long petId,
        @ApiParam(value = "Updated name of the pet") @Valid @RequestParam(value = "name", required = false) String name,
        @ApiParam(value = "Updated status of the pet") @Valid @RequestParam(value = "status", required = false) String status
    ) {
        return getDelegate().updatePetWithForm(petId, name, status);
    }


    public static final String PATH_UPLOAD_FILE = "/pet/{petId}/uploadImage";
    /**
     * POST /pet/{petId}/uploadImage : uploads an image
     *
     * @param petId ID of pet to update (required)
     * @param additionalMetadata Additional data to pass to server (optional)
     * @param file file to upload (optional)
     * @return successful operation (status code 200)
     */
    @ApiOperation(
        tags = { "pet" },
        value = "uploads an image",
        nickname = "uploadFile",
        notes = "",
        response = ModelApiResponse.class,
        authorizations = {
            @Authorization(value = "petstore_auth", scopes = {
                @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
                @AuthorizationScope(scope = "read:pets", description = "read your pets")
            })
         }
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "successful operation", response = ModelApiResponse.class)
    })
    @RequestMapping(
        method = RequestMethod.POST,
        value = PetApi.PATH_UPLOAD_FILE,
        produces = { "application/json" },
        consumes = { "multipart/form-data" }
    )
    
    default ResponseEntity<ModelApiResponse> uploadFile(
        @ApiParam(value = "ID of pet to update", required = true) @PathVariable("petId") Long petId,
        @ApiParam(value = "Additional data to pass to server") @Valid @RequestParam(value = "additionalMetadata", required = false) String additionalMetadata,
        @ApiParam(value = "file to upload") @RequestPart(value = "file", required = false) MultipartFile file
    ) {
        return getDelegate().uploadFile(petId, additionalMetadata, file);
    }

}
