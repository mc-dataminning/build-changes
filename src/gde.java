public class gde<T extends bmk> extends gcx<T, flb<T>> {
   public static final ahg a = new ahg("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fmw c;

   public gde(gah<T, flb<T>> $$0, fms $$1) {
      super($$0);
      fmw $$2 = $$1.a(fmv.aW);
      this.c = $$2.b("box");
   }

   public static fnc a() {
      fne $$0 = new fne();
      fnf $$1 = $$0.a();
      $$1.a("box", fnb.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fmy.a);
      return fnc.a($$0, 64, 64);
   }

   public void a(eqa $$0, ftg $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fj()) {
         eqe $$10 = $$1.getBuffer(fto.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, ged.d);
            $$0.b();
         }
      }
   }
}
