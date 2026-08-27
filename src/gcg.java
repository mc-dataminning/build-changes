public class gcg<T extends blv> extends gbz<T, fkd<T>> {
   public static final agt a = new agt("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fly c;

   public gcg(fzj<T, fkd<T>> $$0, flu $$1) {
      super($$0);
      fly $$2 = $$1.a(flx.aW);
      this.c = $$2.b("box");
   }

   public static fme a() {
      fmg $$0 = new fmg();
      fmh $$1 = $$0.a();
      $$1.a("box", fmd.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fma.a);
      return fme.a($$0, 64, 64);
   }

   public void a(epd $$0, fsi $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fj()) {
         eph $$10 = $$1.getBuffer(fsq.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, gdf.d);
            $$0.b();
         }
      }
   }
}
