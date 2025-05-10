package com.oauth.jwt.authenticate.dtos.response;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;

public record MeObtidoComSucessoDto(
    @Schema(description = "ID do usuário", example = "1")
    Long id,
    @Schema(description = "Nome completo do usuário", example = "João da Silva")
    String fullName,
    @Schema(description = "Email do usuário", example = "joão@gmail.com")
    String email,
    @Schema(description = "Data de criação do usuário", example = "2023-10-01T10:00:00Z")
    String createdAt,
    @Schema(description = "Data de atualização do usuário", example = "2023-10-01T10:00:00Z")
    String updatedAt,
    @Schema(description = "Nome de usuário", example = "joao.silva")
    String username,
    @Schema(description = "Lista de permissões do usuário", example = "[\"ROLE_USER\", \"ROLE_ADMIN\"]")
    List<String> authorities
) {
  


    
}
