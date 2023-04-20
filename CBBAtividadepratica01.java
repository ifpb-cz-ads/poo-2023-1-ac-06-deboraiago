class  TesteIgualdade {
    void  teste () {
        String  frase1 ;
        String  frase2 ;

        frase1 = new  String ( "Testando a igualdade" );
        frase2 = new  String ( "Testando a igualdade" );

        System.out.println ( "Frase 1: " + frase1 );
        System.out.println ( "Frase 2: " + frase2 );
        System.out.println ( "Frase 1 e Frase 2 são iguais? R: " + ( frase1 == frase2 ) + "\n\n" );
    }
}

 class  CBBAtividadePrática01 {
    public  static  void  main ( String [] args ) {
        TesteIgualdade  teste = new  TesteIgualdade ();
        teste . teste ();
    }
}
