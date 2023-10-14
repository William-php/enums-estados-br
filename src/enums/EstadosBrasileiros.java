package enums;

public enum EstadosBrasileiros {
	ACRE("AC", "Acre"),
	ALAGOAS("AL", "Alagoas"),
	AMAPA("AP", "Amapá"),
	AMAZONAS("AM", "Amazonas"),
	BAHIA("BA", "Bahia"),
	CEARA("CE", "Ceará"),
	ESPIRITO_SANTO("ES", "Espiríto Santos"),
	GOIAS("GO", "Goiás"),
	MARANHAO("MA", "Maranhão"),
	MATO_GROSSO("MT", "Mato Grosso"),
	MATO_GROSSO_DO_SUL("MS", "Mato Grosso do Sul"),
	MINAS_GERAIS("MG", "Minas Gerais"),
	PARA("PA", "Pará"),
	PARAIBA("PB", "Paraíba"),
	PARANA("PR", "Paraná"),
	PERNAMBUCO("PE", "Pernambuco"),
	PIAUI("PI", "Piauí"),
	RIO_DE_JANEIRO("RJ", "Rio de Janeiro"),
	RIO_GRANDE_DO_NORTE("RN", "Rio Grande do Norte"),
	RIO_GRANDE_DO_SUL("RS", "Rio Grande do Sul"),
	RONDONIA("RN", "Rondônia"),
	RORAIMA("RR", "Roraima"),
	SANTA_CATARINA("SC", "Santa Catarina"),
	SAO_PAULO("SP", "São Paulo"),
	SERGIPE("SE", "Sergipe"),
	TOCANTINS("TO", "Tocantins"),
	DISTRITO_FEDERAL("DF", "Distrito Federal");
	
	private String sigla;
	private String nome;
	
	private EstadosBrasileiros(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
	}

	public String getSigla() {
		return this.sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return this.nome;
	}
	
	public String getNomeMaiusculo() {
		return this.nome.toUpperCase();
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
