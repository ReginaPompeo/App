package pessoas;

import java.util.List;
import java.util.stream.Collectors;

public record PessoaFisicaResponseDTO(Long cpf, Long id, String nome, String email) {
    public PessoaFisicaResponseDTO(@org.jetbrains.annotations.NotNull PessoaFisica pessoaFisica){
        this(pessoaFisica.getCpf(), pessoaFisica.getId(), pessoaFisica.getNome(), pessoaFisica.getEmail());
    }

    public static List<PessoaFisicaResponseDTO> mapToDTOList(List<PessoaFisica> pessoasFisicas) {
        return pessoasFisicas.stream()
                .map(PessoaFisicaResponseDTO::new)
                .collect(Collectors.toList());
    }
}