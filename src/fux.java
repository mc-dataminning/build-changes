public class fux implements fuz<dgm> {
   public static final ggj a = new ggj(gee.e, new ahd("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fmp c;

   public fux(fva.a $$0) {
      fmp $$1 = $$0.a(fmo.k);
      this.c = $$1.b("bell_body");
   }

   public static fmv b() {
      fmx $$0 = new fmx();
      fmy $$1 = $$0.a();
      fmy $$2 = $$1.a("bell_body", fmu.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fmr.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fmu.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fmr.a(-8.0F, -12.0F, -8.0F));
      return fmv.a($$0, 32, 32);
   }

   public void a(dgm $$0, float $$1, ept $$2, fsz $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = aui.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
         if ($$0.c == ic.c) {
            $$7 = -$$9;
         } else if ($$0.c == ic.d) {
            $$7 = $$9;
         } else if ($$0.c == ic.f) {
            $$8 = -$$9;
         } else if ($$0.c == ic.e) {
            $$8 = $$9;
         }
      }

      this.c.e = $$7;
      this.c.g = $$8;
      epx $$10 = a.a($$3, fth::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
