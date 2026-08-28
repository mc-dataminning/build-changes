public class gns<T extends btq> extends gnk<T, fvg<T>> {
   public static final alf a = new alf("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fxb c;

   public gns(gku<T, fvg<T>> $$0, fwx $$1) {
      super($$0);
      fxb $$2 = $$1.a(fxa.aZ);
      this.c = $$2.b("box");
   }

   public static fxh a() {
      fxj $$0 = new fxj();
      fxk $$1 = $$0.a();
      $$1.a("box", fxg.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fxd.a);
      return fxh.a($$0, 64, 64);
   }

   public void a(ezz $$0, gdp $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fr()) {
         fad $$10 = $$1.getBuffer(gdx.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, gor.d);
            $$0.b();
         }
      }
   }
}
