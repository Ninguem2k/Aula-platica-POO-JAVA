package ultraemojicombat;

public class UltraEmojiCombat {
    public static void main(String[] args) {

        Lutador lutador[] = new Lutador[4];

        lutador[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 3, 1);
        lutador[1] = new Lutador("Putscript", "Brasil", 19, 1.68f, 57.8f, 14, 2, 3);
        lutador[2] = new Lutador("Snapshodown", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        lutador[3] = new Lutador("Dead Code", "Alstraliano", 28, 1.93f, 81.6f, 11, 0, 2);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(lutador[0], lutador[0]);
        UEC01.lutar();
        lutador[0].status();
        lutador[1].status();
    }

}