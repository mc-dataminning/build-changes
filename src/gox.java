public class gox<T extends btl> extends gop<T, fwj<T>> {
   public static final akq a = akq.b("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fye c;

   public gox(glz<T, fwj<T>> $$0, fya $$1) {
      super($$0);
      fye $$2 = $$1.a(fyd.ba);
      this.c = $$2.b("box");
   }

   public static fyk a() {
      fym $$0 = new fym();
      fyn $$1 = $$0.a();
      $$1.a("box", fyj.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fyg.a);
      return fyk.a($$0, 64, 64);
   }

   public void a(fbc $$0, get $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fo()) {
         fbg $$10 = $$1.getBuffer(gfb.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, gpw.d);
            $$0.b();
         }
      }
   }
}
