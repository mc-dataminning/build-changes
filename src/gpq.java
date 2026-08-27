public class gpq<T extends bso> extends gpi<T, fww<T>> {
   public static final akt a = new akt("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fys c;

   public gpq(gmp<T, fww<T>> $$0, fyo $$1) {
      super($$0);
      fys $$2 = $$1.a(fyr.bd);
      this.c = $$2.b("box");
   }

   public static fyy a() {
      fza $$0 = new fza();
      fzb $$1 = $$0.a();
      $$1.a("box", fyx.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fyu.a);
      return fyy.a($$0, 64, 64);
   }

   public void a(fbc $$0, gfg $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fA()) {
         fbg $$10 = $$1.getBuffer(gfo.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, gqp.d);
            $$0.b();
         }
      }
   }
}
