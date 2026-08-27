public class gfs<T extends boi> extends gfl<T, fnn<T>> {
   public static final aiy a = new aiy("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fpj c;

   public gfs(gcv<T, fnn<T>> $$0, fpf $$1) {
      super($$0);
      fpj $$2 = $$1.a(fpi.aV);
      this.c = $$2.b("box");
   }

   public static fpp a() {
      fpr $$0 = new fpr();
      fps $$1 = $$0.a();
      $$1.a("box", fpo.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fpl.a);
      return fpp.a($$0, 64, 64);
   }

   public void a(esh $$0, fvt $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fj()) {
         esl $$10 = $$1.getBuffer(fwb.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, ggs.d);
            $$0.b();
         }
      }
   }
}
