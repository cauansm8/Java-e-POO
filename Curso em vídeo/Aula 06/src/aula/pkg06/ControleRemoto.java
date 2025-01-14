package aula.pkg06;
public class ControleRemoto implements Controlador{
        
        private int volume;
        private boolean ligado;
        private boolean tocando;
        
        public ControleRemoto(){
            setVolume (50);
            setLigado (false);
            setTocando (false);
        }

        private int getVolume() {
            return volume;
        }

        private void setVolume(int volume) {
            this.volume = volume;
        }

        private boolean getLigado() {
            return ligado;
        }

        private void setLigado(boolean ligado) {
            this.ligado = ligado;
        }

        private boolean getTocando() {
            return tocando;
        }

        private void setTocando(boolean tocando) {
            this.tocando = tocando;
        }

        @Override
        public void ligar() {
                this.setLigado(true);
        }

        @Override
        public void desligar() {
                this.setLigado (false);
        }

        @Override
        public void abrirMenu() {
                System.out.println("Ligado? " + this.getLigado());
                System.out.println("Tocando? "+ this.getTocando());
                System.out.println ("Volume: " + this.getVolume());

                for (int i = 0; i < this.getVolume(); i+= 10)
                {
                    System.out.print("[0] ");
                }
                System.out.println ("\n");
        }

        @Override
        public void fecharMenu() {
                System.out.println("Fechando menu...\n\n");
        }

        @Override
        public void maisVolume() {
                if (this.getLigado() == true)
                {
                    this.setVolume (getVolume() + 10);
                }
                else
                {
                    System.out.println("Dispositivo nao esta ligado");
                }
        }

        @Override
        public void menosVolume() {
                if (this.getLigado() == true)
                {
                    this.setVolume (getVolume() - 10);
                }
                else
                {
                    System.out.println("Dispositivo nao esta ligado");
                }
        }

        @Override
        public void ligarMudo() {
                if (this.getLigado() == true)
                {
                    if (this.getVolume() > 0)
                    {
                        System.out.println("Dispositivo esta mudo agora");
                        this.setVolume(0);
                    }
                    else
                    {
                        System.out.println("Ja estava mudo");
                    }

                }
                else
                {
                    System.out.println("Dispositivo nao esta ligado");
                }
        }

        @Override
        public void desligarMudo() {
                if (this.getLigado() == true)
                {
                    if (this.getVolume() == 0)
                    {
                        System.out.println("Dispositivo nao esta mudo agora");
                        this.setVolume(50);
                    }
                    else
                    {
                        System.out.println("Nao esta mudo");
                    }

                }
                else
                {
                    System.out.println("Dispositivo nao esta ligado");
                }

        }

        @Override
        public void play() {
                if (this.getLigado() == true)
                {
                    if (this.getTocando() == false)
                    {
                        System.out.println("Dispostivo esta tocando agora");
                        this.setTocando(true);
                    }
                    else
                    {
                        System.out.println("Dispotivo ja estava tocando");
                    }
                }
                else
                {
                    System.out.println("Dispositivo nao esta ligado");
                }
        }

        @Override
        public void pause() {
                if (this.getLigado() == true)
                {
                    if (this.getTocando() == true)
                    {
                        System.out.println("Dispostivo nao esta tocando agora");
                        this.setTocando(false);
                    }
                    else
                    {
                        System.out.println("Dispotivo ja estava pausado");
                    }
                }
                else
                {
                    System.out.println("Dispositivo nao esta ligado");
                }
        }


    }
