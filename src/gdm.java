public class gdm implements gdo<dnk> {
   public static final gpc a = new gpc(gmx.e, new akh("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fvb c;

   public gdm(gdp.a $$0) {
      fvb $$1 = $$0.a(fva.l);
      this.c = $$1.b("bell_body");
   }

   public static fvh b() {
      fvj $$0 = new fvj();
      fvk $$1 = $$0.a();
      fvk $$2 = $$1.a("bell_body", fvg.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fvd.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fvg.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fvd.a(-8.0F, -12.0F, -8.0F));
      return fvh.a($$0, 32, 32);
   }

   public void a(dnk $$0, float $$1, exx $$2, gbo $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = axz.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
         if ($$0.c == is.c) {
            $$7 = -$$9;
         } else if ($$0.c == is.d) {
            $$7 = $$9;
         } else if ($$0.c == is.f) {
            $$8 = -$$9;
         } else if ($$0.c == is.e) {
            $$8 = $$9;
         }
      }

      this.c.e = $$7;
      this.c.g = $$8;
      eyb $$10 = a.a($$3, gbw::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
