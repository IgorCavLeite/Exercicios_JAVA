public class Relato {
    String textoOcorrencia;

    public class Investigador{
        
        public String gerarProtocolo(){
            int tamanho = textoOcorrencia.length();
            if (tamanho >= 3) {
                String letras = textoOcorrencia.substring(0, 3);
                String protocolo = tamanho + letras;
                return protocolo;
            } else {
                return tamanho + textoOcorrencia;
            }
            
        }

        public boolean temPrioridade(){
            
            if(textoOcorrencia.toUpperCase().contains("ARMA") || textoOcorrencia.toUpperCase().contains("DROGA")){
                System.out.println("Esse relato é uma prioridade!");
                return true;
            } else{
                System.out.println("Esse relato tem pouca prioridade!");
                return false;
            }

        }

        public void exibirResumo(){
            String protocolo = gerarProtocolo();
            boolean prioridade = temPrioridade();

            System.out.println("----- RESUMO DA OCORRÊNCIA -----");
            System.out.println("PROTOCOLO: " + protocolo);

            if (prioridade) {
                System.out.println("STATUS: [ PRIORIDADE MÁXIMA ]");
            } else {
                System.out.println("STATUS: [ AGUARDANDO TRIAGEM ]");
            }
            System.out.println("--------------------------------");
        }
    }
}
