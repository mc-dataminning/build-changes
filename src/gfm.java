public class gfm implements gfo<dpf> {
   public static final grd a = new grd(goy.e, new alf("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fxa c;

   public gfm(gfp.a $$0) {
      fxa $$1 = $$0.a(fwz.l);
      this.c = $$1.b("bell_body");
   }

   public static fxg b() {
      fxi $$0 = new fxi();
      fxj $$1 = $$0.a();
      fxj $$2 = $$1.a("bell_body", fxf.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fxc.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fxf.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fxc.a(-8.0F, -12.0F, -8.0F));
      return fxg.a($$0, 32, 32);
   }

   public void a(dpf $$0, float $$1, ezy $$2, gdo $$3, int $$4, int $$5) {
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
      fac $$10 = a.a($$3, gdw::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
