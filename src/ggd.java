public class ggd implements ggf<dpo> {
   public static final gru a = new gru(gpp.e, new akk("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fxq c;

   public ggd(ggg.a $$0) {
      fxq $$1 = $$0.a(fxp.l);
      this.c = $$1.b("bell_body");
   }

   public static fxw b() {
      fxy $$0 = new fxy();
      fxz $$1 = $$0.a();
      fxz $$2 = $$1.a("bell_body", fxv.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fxs.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fxv.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fxs.a(-8.0F, -12.0F, -8.0F));
      return fxw.a($$0, 32, 32);
   }

   public void a(dpo $$0, float $$1, fao $$2, gef $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = ayg.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
         if ($$0.c == jf.c) {
            $$7 = -$$9;
         } else if ($$0.c == jf.d) {
            $$7 = $$9;
         } else if ($$0.c == jf.f) {
            $$8 = -$$9;
         } else if ($$0.c == jf.e) {
            $$8 = $$9;
         }
      }

      this.c.e = $$7;
      this.c.g = $$8;
      fas $$10 = a.a($$3, gen::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
