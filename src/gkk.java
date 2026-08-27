public class gkk<T extends bqt> extends gkc<T, fsa<T>> {
   public static final ajv a = new ajv("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final ftv c;

   public gkk(ghm<T, fsa<T>> $$0, ftr $$1) {
      super($$0);
      ftv $$2 = $$1.a(ftu.aZ);
      this.c = $$2.b("box");
   }

   public static fub a() {
      fud $$0 = new fud();
      fue $$1 = $$0.a();
      $$1.a("box", fua.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), ftx.a);
      return fub.a($$0, 64, 64);
   }

   public void a(ewr $$0, gai $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fo()) {
         ewv $$10 = $$1.getBuffer(gaq.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, glj.d);
            $$0.b();
         }
      }
   }
}
