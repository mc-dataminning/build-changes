public class glq<T extends bsa> extends gli<T, ftg<T>> {
   public static final akh a = new akh("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fvb c;

   public glq(gis<T, ftg<T>> $$0, fux $$1) {
      super($$0);
      fvb $$2 = $$1.a(fva.aZ);
      this.c = $$2.b("box");
   }

   public static fvh a() {
      fvj $$0 = new fvj();
      fvk $$1 = $$0.a();
      $$1.a("box", fvg.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fvd.a);
      return fvh.a($$0, 64, 64);
   }

   public void a(exx $$0, gbo $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fp()) {
         eyb $$10 = $$1.getBuffer(gbw.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, gmp.d);
            $$0.b();
         }
      }
   }
}
