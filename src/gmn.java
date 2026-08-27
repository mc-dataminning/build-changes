public class gmn<T extends bso> extends gmf<T, fub<T>> {
   public static final akm a = new akm("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fvw c;

   public gmn(gjp<T, fub<T>> $$0, fvs $$1) {
      super($$0);
      fvw $$2 = $$1.a(fvv.aZ);
      this.c = $$2.b("box");
   }

   public static fwc a() {
      fwe $$0 = new fwe();
      fwf $$1 = $$0.a();
      $$1.a("box", fwb.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fvy.a);
      return fwc.a($$0, 64, 64);
   }

   public void a(eys $$0, gck $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fr()) {
         eyw $$10 = $$1.getBuffer(gcs.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, gnm.d);
            $$0.b();
         }
      }
   }
}
