public class gnr<T extends btp> extends gnj<T, fvf<T>> {
   public static final alf a = new alf("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fxa c;

   public gnr(gkt<T, fvf<T>> $$0, fww $$1) {
      super($$0);
      fxa $$2 = $$1.a(fwz.aZ);
      this.c = $$2.b("box");
   }

   public static fxg a() {
      fxi $$0 = new fxi();
      fxj $$1 = $$0.a();
      $$1.a("box", fxf.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fxc.a);
      return fxg.a($$0, 64, 64);
   }

   public void a(ezy $$0, gdo $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fr()) {
         fac $$10 = $$1.getBuffer(gdw.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, goq.d);
            $$0.b();
         }
      }
   }
}
