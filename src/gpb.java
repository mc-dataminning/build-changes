public class gpb<T extends btn> extends got<T, fwn<T>> {
   public static final akr a = akr.b("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fyi c;

   public gpb(gmd<T, fwn<T>> $$0, fye $$1) {
      super($$0);
      fyi $$2 = $$1.a(fyh.ba);
      this.c = $$2.b("box");
   }

   public static fyo a() {
      fyq $$0 = new fyq();
      fyr $$1 = $$0.a();
      $$1.a("box", fyn.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fyk.a);
      return fyo.a($$0, 64, 64);
   }

   public void a(fbg $$0, gex $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fo()) {
         fbk $$10 = $$1.getBuffer(gff.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, gqa.d);
            $$0.b();
         }
      }
   }
}
