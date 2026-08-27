public class fys<T extends bkj> extends fyl<T, fhc<T>> {
   public static final afw a = new afw("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fiw c;

   public fys(fvy<T, fhc<T>> $$0, fis $$1) {
      super($$0);
      fiw $$2 = $$1.a(fiv.aT);
      this.c = $$2.b("box");
   }

   public static fjc a() {
      fje $$0 = new fje();
      fjf $$1 = $$0.a();
      $$1.a("box", fjb.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fiy.a);
      return fjc.a($$0, 64, 64);
   }

   public void a(emh $$0, fpb $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fj()) {
         eml $$10 = $$1.getBuffer(fpj.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, fzr.d);
            $$0.b();
         }
      }
   }
}
