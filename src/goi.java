public class goi<T extends btc> extends goa<T, fvv<T>> {
   public static final akk a = new akk("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fxq c;

   public goi(glk<T, fvv<T>> $$0, fxm $$1) {
      super($$0);
      fxq $$2 = $$1.a(fxp.aZ);
      this.c = $$2.b("box");
   }

   public static fxw a() {
      fxy $$0 = new fxy();
      fxz $$1 = $$0.a();
      $$1.a("box", fxv.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fxs.a);
      return fxw.a($$0, 64, 64);
   }

   public void a(fao $$0, gef $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fp()) {
         fas $$10 = $$1.getBuffer(gen.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, gph.d);
            $$0.b();
         }
      }
   }
}
