public class gcx<T extends bmf> extends gcq<T, fku<T>> {
   public static final ahd a = new ahd("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fmp c;

   public gcx(gaa<T, fku<T>> $$0, fml $$1) {
      super($$0);
      fmp $$2 = $$1.a(fmo.aW);
      this.c = $$2.b("box");
   }

   public static fmv a() {
      fmx $$0 = new fmx();
      fmy $$1 = $$0.a();
      $$1.a("box", fmu.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fmr.a);
      return fmv.a($$0, 64, 64);
   }

   public void a(ept $$0, fsz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fj()) {
         epx $$10 = $$1.getBuffer(fth.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, gdw.d);
            $$0.b();
         }
      }
   }
}
