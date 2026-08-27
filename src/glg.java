public class glg<T extends bre> extends gky<T, fsw<T>> {
   public static final akf a = new akf("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fur c;

   public glg(gii<T, fsw<T>> $$0, fun $$1) {
      super($$0);
      fur $$2 = $$1.a(fuq.aZ);
      this.c = $$2.b("box");
   }

   public static fux a() {
      fuz $$0 = new fuz();
      fva $$1 = $$0.a();
      $$1.a("box", fuw.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fut.a);
      return fux.a($$0, 64, 64);
   }

   public void a(exn $$0, gbe $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fp()) {
         exr $$10 = $$1.getBuffer(gbm.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, gmf.d);
            $$0.b();
         }
      }
   }
}
