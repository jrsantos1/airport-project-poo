# airport-project-poo


nesse segundo commit,parei na segunda página do projeto. Estava desenvolvendo o método para o pouso do avião. Precisa-se verificar esse método abaixo

    public void podeReceberVoo(Aviao aviao){
        for(Pista p : pistas){
            if(!p.pistaEstaCheia()){
                p.setAviaoNaPista(aviao);
                return;
            }
        }
        aviao.setEmEspera(true);
    }