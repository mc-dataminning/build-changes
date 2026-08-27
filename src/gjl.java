public class gjl<T extends bqt, M extends fqv<T>> extends gkc<T, M> {
   private static final ajv a = new ajv("textures/entity/elytra.png");
   private final fqs<T> b;

   public gjl(ghm<T, M> $$0, ftr $$1) {
      super($$0);
      this.b = new fqs<>($$1.a(ftu.W));
   }

   public void a(ewr $$0, gai $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      crs $$10 = $$3.d(bqh.e);
      if ($$10.a(crv.nS)) {
         ajv $$13;
         if ($$3 instanceof fzh $$11) {
            gmr $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(ckb.a)) {
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
         ewv $$17 = ggp.a($$1, gaq.a($$13), false, $$10.x());
         this.b.a($$0, $$17, $$2, glj.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
