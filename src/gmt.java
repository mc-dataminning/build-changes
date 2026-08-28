public class gmt<T extends btq, M extends fub<T>> extends gnk<T, M> {
   private static final alf a = new alf("textures/entity/elytra.png");
   private final fty<T> b;

   public gmt(gku<T, M> $$0, fwx $$1) {
      super($$0);
      this.b = new fty<>($$1.a(fxa.W));
   }

   public void a(ezz $$0, gdp $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cuq $$10 = $$3.a(btc.e);
      if ($$10.a(cut.nT)) {
         alf $$13;
         if ($$3 instanceof gco $$11) {
            gqa $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(cmz.a)) {
               $$13 = $$12.c();
            } else {
               $$13 = a;
            }
         } else {
            $$13 = a;
         }

         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         this.c().a(this.b);
         this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
         fad $$17 = gjw.a($$1, gdx.a($$13), false, $$10.y());
         this.b.a($$0, $$17, $$2, gor.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
