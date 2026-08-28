public class gpd<T extends btn> extends gov<T, fwp<T>> {
   public static final akr a = akr.b("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fyk c;

   public gpd(gmf<T, fwp<T>> $$0, fyg $$1) {
      super($$0);
      fyk $$2 = $$1.a(fyj.ba);
      this.c = $$2.b("box");
   }

   public static fyq a() {
      fys $$0 = new fys();
      fyt $$1 = $$0.a();
      $$1.a("box", fyp.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fym.a);
      return fyq.a($$0, 64, 64);
   }

   public void a(fbi $$0, gez $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fn()) {
         fbm $$10 = $$1.getBuffer(gfh.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, gqc.d);
            $$0.b();
         }
      }
   }
}
