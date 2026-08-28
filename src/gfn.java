public class gfn implements gfp<dpg> {
   public static final gre a = new gre(goz.e, new alf("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fxb c;

   public gfn(gfq.a $$0) {
      fxb $$1 = $$0.a(fxa.l);
      this.c = $$1.b("bell_body");
   }

   public static fxh b() {
      fxj $$0 = new fxj();
      fxk $$1 = $$0.a();
      fxk $$2 = $$1.a("bell_body", fxg.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fxd.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fxg.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fxd.a(-8.0F, -12.0F, -8.0F));
      return fxh.a($$0, 32, 32);
   }

   public void a(dpg $$0, float $$1, ezz $$2, gdp $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = ayz.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
         if ($$0.c == je.c) {
            $$7 = -$$9;
         } else if ($$0.c == je.d) {
            $$7 = $$9;
         } else if ($$0.c == je.f) {
            $$8 = -$$9;
         } else if ($$0.c == je.e) {
            $$8 = $$9;
         }
      }

      this.c.e = $$7;
      this.c.g = $$8;
      fad $$10 = a.a($$3, gdx::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
