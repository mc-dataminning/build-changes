public class goo<T extends bso, M extends fvq<T>> extends gpi<T, M> {
   private static final akt a = new akt("textures/entity/elytra.png");
   private final fvn<T> b;

   public goo(gmp<T, M> $$0, fyo $$1) {
      super($$0);
      this.b = new fvn<>($$1.a(fyr.Y));
   }

   public void a(fbc $$0, gfg $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cuh $$10 = $$3.d(bsc.e);
      if ($$10.a(cuk.pj)) {
         akt $$13;
         if ($$3 instanceof gef $$11) {
            gry $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(clz.a)) {
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
         fbg $$17 = glp.a($$1, gfo.a($$13), false, $$10.x());
         this.b.a($$0, $$17, $$2, gqp.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
