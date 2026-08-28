public class ggv extends gge<hdr> {
   public ggv(giu $$0) {
      super($$0);
   }

   public static gja a() {
      gjc $$0 = gge.a(giy.a, 0.0F);
      gje $$1 = $$0.a();
      gje $$2 = $$1.a("head");
      $$2.a("hat");
      $$1.a("body");
      $$1.a("left_arm");
      $$1.a("right_arm");
      $$1.a("left_leg");
      $$1.a("right_leg");
      giz $$3 = giz.c().a(24, 0).a(-3.0F, -6.0F, -1.0F, 6.0F, 6.0F, 1.0F, new giy(1.0F));
      $$2.a("left_ear", $$3, giw.a(-6.0F, -6.0F, 0.0F));
      $$2.a("right_ear", $$3, giw.a(6.0F, -6.0F, 0.0F));
      return gja.a($$0, 64, 64);
   }
}
