public class ges extends ggm {
   private static final String a = "bell_body";
   private final giu b;

   public ges(giu $$0) {
      super($$0, gqc::d);
      this.b = $$0.b("bell_body");
   }

   public static gja a() {
      gjc $$0 = new gjc();
      gje $$1 = $$0.a();
      gje $$2 = $$1.a("bell_body", giz.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), giw.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", giz.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), giw.a(-8.0F, -12.0F, -8.0F));
      return gja.a($$0, 32, 32);
   }

   public void a(dwv $$0, float $$1) {
      float $$2 = (float)$$0.a + $$1;
      float $$3 = 0.0F;
      float $$4 = 0.0F;
      if ($$0.b) {
         float $$5 = azm.a($$2 / (float) Math.PI) / (4.0F + $$2 / 3.0F);
         if ($$0.c == ja.c) {
            $$3 = -$$5;
         } else if ($$0.c == ja.d) {
            $$3 = $$5;
         } else if ($$0.c == ja.f) {
            $$4 = -$$5;
         } else if ($$0.c == ja.e) {
            $$4 = $$5;
         }
      }

      this.b.e = $$3;
      this.b.g = $$4;
   }
}
