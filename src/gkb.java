public class gkb<T extends bqo> extends gjt<T, frr<T>> {
   public static final ajt a = new ajt("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final ftm c;

   public gkb(ghd<T, frr<T>> $$0, fti $$1) {
      super($$0);
      ftm $$2 = $$1.a(ftl.aZ);
      this.c = $$2.b("box");
   }

   public static fts a() {
      ftu $$0 = new ftu();
      ftv $$1 = $$0.a();
      $$1.a("box", ftr.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fto.a);
      return fts.a($$0, 64, 64);
   }

   public void a(ewi $$0, fzz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fo()) {
         ewm $$10 = $$1.getBuffer(gah.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, gla.d);
            $$0.b();
         }
      }
   }
}
